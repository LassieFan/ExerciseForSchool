package txt_7chap_3_5;
import java.util.*;
public class random {

	static void sort(int arr[])
	{
		for(int i=1;i<20;i++)
		{
			boolean flag=true;
			for(int j=0;j<arr.length-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=false;
				}
			}
			if(flag==true)
				break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Random m=new Random();
    int rd;
    int arr[]=new int[20];
    int n=0;
    String s="";
    for(int i=0;i<20;i++)
    {
    	rd=10+m.nextInt(81);
    	for(int j=0;j<n;j++)
    	{
    		if(rd==arr[j])
    			{
    			   rd=10+m.nextInt(81);
    			   j=-1;
    			   continue;
    			}
    	}
    		arr[i]=rd;
    		s=s+rd;
    		if(i<19)
    			s=s+",";
    	    	n=i+1;
    }
    System.out.println(s);
    sort(arr);
    int i=0;
    while(i<arr.length)
    {
    	System.out.print(arr[i++]+" ");
    }
	}

}
