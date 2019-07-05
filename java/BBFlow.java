package txt_keshe;
import java.util.Collections;
import java.util.LinkedList;

public class BBFlow {

	public int n;//��ҵ��

	public int bestc;//��С���ʱ���

	public int [][]m;//ÿ����ҵ����Ĵ���ʱ������

	public int [][]b;//ÿ����ҵ����Ĵ���ʱ����������

	public int[][] a;//����m��b�Ķ�Ӧ��ϵ����

	public int[] bestx;//���Ž�

	public boolean[][] y;//��������

	

	public BBFlow(int n,int[][] m){   //���캯����ʼ������
		this.n=n;
		
		bestc=10000;

		this.m=m;

		b=new int[n][2];

		a=new int[n][2];

		bestx=new int[n];

		y=new boolean[n][2];

	}

	public void swap(int[][] b,int i,int j,int k,int t){  //�������������ڻ���1�ͻ���2�ϵ����ʱ��С�ķ���ǰ�棬���Ǽ�������

		int temp=b[i][j];

		b[i][j]=b[k][t];

		b[k][t]=temp;

	}

	public void swap(int[] x,int i,int j){

		int temp=x[i];

		x[i]=x[j];

		x[j]=temp;

	}

	/**

	 * �Ը���ҵ�ڻ���1��2������ʱ������

	 */

	public void sort()
	{

		int[] c=new int[n];

		for(int j=0;j<2;j++)
		{

			for(int i=0;i<n;i++)
			{

				b[i][j]=m[i][j];       

				c[i]=i;

			}

			for(int i=0;i<n-1;i++)     //ð����������㣨j����һ��ѭ���Ƚ��ڻ���1�ϼӹ�ʱ�䰴�Ǽ������򣬵ڶ���ѭ��������2�ϼӹ�ʱ�䰴�Ǽ�������
			{
				for(int k=n-1;k>i;k--)
				{
					if(b[k][j]<b[k-1][j])
					{
						swap(b,k,j,k-1,j);    //b�е�ʱ��˳�򽻻�

						swap(c,k,k-1);        //��c�е���ҵ˳����н���
					}
				}
			}
			for(int i=0;i<n;i++)
				a[c[i]][j]=i;           //����ҵ������˳���¼��a[][]��
		}

	}

	/**

	 * �������ʱ����½�

	 */

	public int bound(Nodes enode,int[] f){
		for(int k=0;k<n;k++)
		{
			for(int j=0;j<2;j++)
			{
				y[k][j]=false;    //��ʼ����������ȫΪfalse
			}
		}

		for(int k=0;k<=enode.s;k++)
		{
			for(int j=0;j<2;j++)
			{
			    y[a[enode.x[k]][j]][j]=true;   //��������������޸�
			}
		}

		f[1]=enode.f[1]+m[enode.x[enode.s]][0];  //�Ѿ������������M�е�f[1]
		f[2]=((f[1]>enode.f[2])?f[1]:enode.f[2])+m[enode.x[enode.s]][1];  //

		int sf2=enode.sf2+f[2];   //�Ѿ������������M��f[2]
		int s1=0;
		int s2=0;
		int k1=n-enode.s;
		int k2=n-enode.s;
		int f3=f[2];
		
		//����s1��ֵ
		for(int j=0;j<n;j++)
		{
			if(!y[j][0])
			{
				k1--;
				if(k1==n-enode.s-1)
					f3=(f[2]>f[1]+b[j][0])?f[2]:f[1]+b[j][0];  //�ж��Ǹ��󣬼�������b�еĻ���1�ϵ�ʱ��
				s1+=f[1]+k1*b[j][0];     //�������ҵ��Ҫ�����ʼ����ҵ����1�ϵ�ʱ��
			}
		}

		//����s2��ֵ
		for(int j=0;j<n;j++)
		{
			if(!y[j][1])
			{
				k2--;
				s1+=b[j][1];    //��û�м����t[2]����
				s2+=f3+k2*b[j][1];  
			}
		}
		
		//�������ʱ����½�
		return  sf2+((s1>s2)?s1:s2);  
	}
	

	/**
	 * ���ȶ���ʽ��֧�޽編����������ҵ��������
	 */
	public int bbFlow(int nn){
		n=nn;
		sort();//��ÿ����ҵ�ڻ���1��2������ʱ������
		
		LinkedList<Nodes> heap=new LinkedList<Nodes>();  //��ʽ������Ŷѽڵ�
		Nodes enode =new Nodes(n);

		//�������пռ���

		do{
			if(enode.s==n)
			{
				//Ҷ�ڵ�
				if(enode.sf2<bestc)
				{
					bestc=enode.sf2;
					for(int i=0;i<n;i++)
					{
						bestx[i]=enode.x[i];
					}
				}
			}
			else
			{
				//������ǰ��չ���Ķ��ӽ��
				for(int i=enode.s;i<n;i++)
				{
					swap(enode.x,enode.s,i);
					int[] f=new int[3];
					int bb=bound(enode,f);
					if(bb<bestc)
					{
						//�������ܺ������Ž�
						//��������С��
						Nodes node=new Nodes(enode,f,bb,n);
						heap.add(node);
					//	Collections.sort(heap);
					}
					swap(enode.x,enode.s,i);
				}//��ɽ����չ
			}
			//ȡ��һ����չ���
			enode=heap.poll();    //poll���Ƴ���һ�����ݲ�����
		}while(enode!=null&&enode.s<=n);
		return bestc;
	}

	public static void main(String[] args) {
		int n=3;
		int[][] m={{2,1},{3,1},{2,3}};//m���±��0��ʼ
		BBFlow f=new BBFlow(n,m);
		f.bbFlow(n);
		System.out.println("������������ҵ����˳��Ϊ��");
		for(int i=0;i<n;i++)
			System.out.print((f.bestx[i]+1)+" ");
		System.out.println();
		System.out.println("���ŵ�����������ʱ��Ϊ��"+f.bestc);
	}
}

class Nodes implements Comparable{    //���Comparable�ӿ�ǿ�ж�ʵ������ÿ����Ķ��������������

	int s;//�Ѱ�����ҵ��
	int sf2;//��ǰ����2�ϵ����ʱ���
	int bb;//��ǰ���ʱ����½�
	int[] f;//f[1]����1��������ʱ�䣬f[2]����2��������ʱ��
	int[] x;//��ǰ��ҵ����
	
	public Nodes(int n){
		//��С�ѽ���ʼ��
		x=new int[n];
		for(int i=0;i<n;i++)
			x[i]=i;
		s=0;
		f=new int[3];
		f[1]=0;
		f[2]=0;
		sf2=0;
		bb=0;
	}

	public Nodes(Nodes e,int[] ef,int ebb,int n){
		//��С���½��
		x=new int[n];
		for(int i=0;i<n;i++)
			x[i]=e.x[i];
		f=ef;
		sf2=e.sf2+f[2];
		bb=ebb;
		s=e.s+1;
	}

	public int compareTo(Object o) {  //��� compareTo ��������Ϊ������Ȼ�ȽϷ���,�Ƚϴ˶�����ָ�������˳������ö���С�ڡ����ڻ����ָ��������ֱ𷵻ظ������������������
		int xbb=((Nodes) o).bb;
		if(bb<xbb) return -1;
		if(bb==xbb) return 0;
		return 1;
	}
}