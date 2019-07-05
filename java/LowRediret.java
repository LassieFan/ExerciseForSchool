import java.io.*;
import java.util.*;
public class 降序数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d,y, x,flag = 0;
		System.out.printf("请输入一个整数：");
		Scanner sc= new Scanner(System.in);
		x = sc.nextInt();
		y=x%10;
		int z= x/10;
		while(z>10) {
		d=z%10;
		if(y>d) 
		{flag = 1;break;
		}
		else
			{y=d;}
		z=z/10;
		}
		if(flag==1) System.out.println("该数为非降序数！");
		else System.out.println("该数是降序数！");
	}

}
