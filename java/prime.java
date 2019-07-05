package txt_4chap_6;

public class prime {
static int a[]=new int[98];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,m=0;
        for(i=2;i<=99;i++)
        {
        	boolean flag=true;
        	for(int j=2;j<=Math.sqrt(i);j++)
        	{
        		if(i%j==0)
        		{
        			flag=false;
        			break;
        		}
        	}
        	if(flag==true)
        	{
        		a[m++]=i;
        	}
        }
        for(i=0;i<m;i++)
        {
        	if(a[i]+2==a[i+1])
        	{
        		System.out.print(a[i]+"  ");
        	}
        	else if(i!=0&&a[i]+2!=a[i+1]&&a[i]==a[i-1]+2)       		
			{
        		System.out.print(a[i]+"  ");
			}
              
        }
		
	}

}
