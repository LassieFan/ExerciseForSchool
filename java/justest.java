package txt_6chap_4_2;
public class test
{
	public static void main(String[] args) {
		Person p=new Person("lilei","male",20);
		Teacher m=new Teacher("wangping","female",30,"director","operational");
		Student s=new Student("lulu","female",18,88,2018,3,6,"software"); 
		System.out.println(p);
		System.out.println(m);
		System.out.println(s);
	}

}
 class Person {
     String name;
     String sex;
     int age;
	public Person(String name,String sex,int age)
	{
		this.name=name;
		this.sex=sex;
		this.age=age;
	}
	public Person()
	{
        this("","",0);
	}
	public String toString()
	{
		return "姓名: "+name+"   性别 :"+sex+"   年龄:"+age;
	}
	
}
 class Teacher extends Person
{
	private String position;
	private String department;
	public Teacher(String name,String sex,int age,String position,String department)
	{
		super(name,sex,age);
		this.position=position;
		this.department=department;
	}
	public String toString()
	{
		return "姓名: "+name+"   性别: "+sex+"   年龄:"+age+"   职位:"+position+"  部门:"+department;
	}
	
}
class Student extends Person{
	int num;
	int year;
	int month;
	int day;
	String major; 
	public Student(String name,String sex,int age,int num,int year,int month,int day,String major)
	{
		super(name,sex,age);
		this.num=num;
		this.year=year;
		this.month=month;
		this.day=day;
		this.major=major;
	}
	public String toString()
	{  
		return "姓名: "+name+"  性别: "+sex+"   年龄:"+age+"  学号:"+num+"  入学时间:"+year+"/"+month+"/"+day+"  专业:"+major;
	}
}
