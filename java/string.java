package txt_7chap_3_2;
import java.io.*;
import java.util.Scanner;
public class string {
    public static void main(String args[]){
		// TODO Auto-generated method stub
	String s[]=new String[10];    //最多输入十行文字
	//StringBuffer m=new StringBuffer();
	int i=0;
	int n=0;
	int letter=0;
	boolean next=true;
	System.out.println("please input strings:");
	do
	{
		Scanner in=new Scanner(System.in);
		s[i]=in.nextLine();
		if(!s[i].equals("end"))
		{
			i++;
		}
		else
		{
			n=i;
			in.close();
			break;
		}
	}while(i<10);
	
	char DIGAL[]=new char[100];
	int l=0;
	for(i=0;i<n;i++)
	{
		for(int j=0;j<s[i].length();j++)
		{
			char m=s[i].charAt(j);
			if(m>='a'&&m<='z'||m>='A'&&m<='Z')
				{
				   letter++; 
				   if(j!=0&&s[i].charAt(j-1)>='0'&&s[i].charAt(j-1)<='9')
				   {
					   DIGAL[l++]=' ';
				   }
				}
			else if(m>='0'&&m<='9')
			{
                DIGAL[l]=m;
                l++;
			}
			else
			{
				if(j!=0&&s[i].charAt(j-1)>='0'&&s[i].charAt(j-1)<='9')
				   {
					   DIGAL[l++]=' ';
				   }
			}
		}
		DIGAL[l++]='\n';
	}
	System.out.println("the number of letter is: "+letter);
	System.out.println("the digal is: ");
	for(i=0;i<l;i++)
	{
		System.out.print(DIGAL[i]);		
	}
	for(i=0;i<n;i++)
	{
		s[i]=s[i].replaceAll("the", "a");
		System.out.println("replace: "+s[i]);
	}
	
    }
}