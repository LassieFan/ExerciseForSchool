import java.io.*;
import java.util.*;
public class ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d,y, x,flag = 0;
		System.out.printf("������һ��������");
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
		if(flag==1) System.out.println("����Ϊ�ǽ�������");
		else System.out.println("�����ǽ�������");
	}

}
