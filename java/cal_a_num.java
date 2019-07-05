package txt_7chap_3_1;

public class cal_a_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=args[0];
		int n=0;
		for(int i=0;i<a.length();i++)
		{
			char x=a.charAt(i);
			if(x=='a')
				n++;
		}
       System.out.println("a的个数为："+n);
	}

}
