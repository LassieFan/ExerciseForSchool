package txt_4chap_1;
import java.util.Scanner;
public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double score[]=new double[50];
        System.out.println("please input the score,input the -1 is over:");
        int i=0;
        double sum=0;
        double max,min;
        Scanner sc=new Scanner(System.in);
    	score[i]=sc.nextDouble();
    	max=min=score[i];
    	sum+=score[i];
        while(score[i]!=-1)
        {
        	score[++i]=sc.nextDouble();
        	sum+=score[i];
        	if(score[i]>max)
        	{
        		max=score[i];
        	}
            if(score[i]<min&&score[i]!=-1)
            {
            	min=score[i];
            }
        }
        sum+=1;
        double ave=sum/i;
        int n1,n2,n3,n4,n5;
        n1=n2=n3=n4=n5=0;
        for(int m=0;m<i;m++)
        {
        switch((int)score[m]/10)
        {
        case(10):
        case(9):
        {
        	n1++;
        	break;
        }
        case(8):
        {
        	n2++;
        	break;
        }
        case(7):
        {
        	n3++;
        	break;
        }
        case(6):
        {
        	n4++;
        	break;
        }
        default:
        {
        	n5++;
        }
        }
     	}
        System.out.println("the max score is :"+max);
        System.out.println("the min score is :"+min);
        System.out.println("the average score is :"+ave); 
        System.out.println("������������ "+n5+"��");
        System.out.println("����������"+n4+"��");
        System.out.println("�е�������"+n3+"��");
        System.out.println("����������"+n2+"��");
        System.out.println("����������"+n1+"��");
	}

}
