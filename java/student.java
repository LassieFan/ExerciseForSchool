package txt_5chap_2;

public class student {
    
	 int num;
	 String name;
	 int age;
	public student(int num,int age,String name)
	{
		this.num=num;
		this.age=age;
		this.name=name;
	}
	static void add_age(student x)
	{
		x.age++;
	}
	static void show_message(student x)
	{
		System.out.print("ѧ��ѧ��Ϊ��"+x.num);
		System.out.print("  ѧ������Ϊ��"+x.name);
		System.out.print("  ѧ������һ��������Ϊ"+x.age);
	}
	static void find_twenty(student x)
	{
		if(x.age>=20)
		{
			System.out.print("ѧ��Ϊ��"+x.num);
			System.out.print("����Ϊ��"+x.name);
			System.out.printf("\n");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        student s1=new student(1,22,"lilei");
        student s2=new student(2,17,"wangming");
        student s3=new student(4,19,"lucy");
        student s4=new student(6,20,"sofei");
        student s5=new student(7,18,"merry");
        student s[]= {s1,s2,s3,s4,s5};
        for(int i=0;i<s.length;i++)
        {
        	add_age(s[i]);
        }
        for(int i=0;i<s.length;i++)
        {
        	show_message(s[i]);
        	System.out.printf("\n");
        }
        System.out.println("�������20������������£�");
        for(int i=0;i<s.length;i++)
        {
        	find_twenty(s[i]);
        }
        
	}

}
