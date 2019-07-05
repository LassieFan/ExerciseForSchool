package txt_4chap_4;

public class choice_sort {
    static void sort(int arr[])
    {
    	for(int i=0;i<arr.length-1;i++)
    	{
    		int min=arr[i];
    		int m=i;
    		for(int j=i;j<arr.length;j++)
    		{
    			if(arr[j]<min)
    			{
    			      m=j;
    			      min=arr[j];
    			}
    		}
    		int temp=arr[i];
    		arr[i]=min;
    		arr[m]=temp;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {2,3,1,6,2,8,9,4,5,7,10};
//     arr.length
     sort(arr);
     for(int i=0;i<arr.length;i++)
     {
    	 System.out.print(arr[i]+"  ");
     }
	}

}
