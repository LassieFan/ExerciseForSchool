import java.io.*;
import java.util.*;
public class ��������� {
	public static void Q(int n) {
		if(n!=0)
			{Q(n/2);
		System.out.printf("%d", n%2);}
		else 
			return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.printf("������һ��ʮ����������");
		Scanner sc= new Scanner(System.in);
		n = sc.nextInt();
		Q(n);
	}

}
