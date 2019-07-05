package txt_4chap_7;

public class command {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[0]);
		if(0==n)
		{
			System.out.printf("\n");
			return;
		}
        int i=1;
        for(;i<=n;i++)
        {
        	for(int j=0;j<(n-i);j++)
        	{
        		System.out.print(" ");
        	}
        	for(int m=0;m<(2*i-1);m++)
        	{
        		System.out.print(i);
        	}
        	System.out.printf("\n");
        	
        }
		
	}

}
