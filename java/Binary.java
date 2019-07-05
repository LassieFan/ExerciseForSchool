package D_to_Binary;
import java.io.*;
import java.util.Scanner;
public class ¶þ½øÖÆ {
static void fun(int n)
	{
		if(0==n)
		{
			return;
		}
		else
		{
			fun(n/2);
			System.out.print(n%2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
     System.out.println("please input the num:");
     Scanner s= new Scanner(System.in);
     n = s.nextInt();
     fun(n);
	}

}
