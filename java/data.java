package txt_5chap_4;
//import java.io.*;
//import java.util.Scanner;
public class data {
    
	int year=2000;
	int month=1;
	int day;
	
	public data(int a,int b,int c)
	{
		this.judge_change_a(a);
		this.judge_change_b(b);
		this.judge_change_c(c);
	}
	public void judge_change_a(int a)
	{
		if (a>=0)
		{
			this.year=a;
		}
	}
	public void judge_change_b(int a)
	{
		if(a>0&&a<=12)
		{
			this.month=a;
		}
	}
	public void judge_change_c(int c)
	{
		int date[]= {31,29,31,30,31,30,31,31,30,31,30,31};
		if(c>date[this.month-1]&&this.month!=2)
		{
			this.day=date[this.month-1];
			return;
		}
		else
		{
			if(this.month==2)
			{
				if(this.year%4==0&&this.year%100!=0||this.year%400==0)
				{
				    if(c<=29)
				    {
				    	this.day=c;
				    	return;
				    }
				    else
				    {
				    	this.day=29;
				    	return;
				    }
				}
				else
				{
					if(c<=28)
				    {
				    	this.day=c;
				    	return;
				    }
				    else
				    {
				    	this.day=28;
				    	return;
				    }
				}
				
			}
			else
			{
				this.day=c;
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		data a1=new data(2014,44,32);
		data a2=new data(-22,2,32);  
		System.out.println("该日期为  "+a1.year+"/"+a1.month+"/"+a1.day);
		System.out.println("该日期为  "+a2.year+"/"+a2.month+"/"+a2.day);

	}

}
