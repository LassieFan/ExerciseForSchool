package txt_8chap_3_1;

interface show
{
	 void display();
}
class Inform implements show
{
	String message;
	public Inform(String m)
	{
		message=m;
	}
	public void display()
	{
		System.out.println(message);
	}
	/*public String toString()
	{
		return message;
	}*/
	}
class car_ implements show
{
	String car;
	public car_(String m)
	{
		car=m;
	}
	public void display()
	{
		System.out.println(car);
	}
	}
class ad implements show
{
	String adv;
	public ad(String m)
	{
		adv=m;
	}
	public void display()
	{
		System.out.println(adv);
	}
	
	}
public class car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     show x=new Inform("֪ͨ��Ϣ");
  //   System.out.println(x);
     x.display();
     show y=new car_("��������");
     y.display();
     show z=new ad("�����Ϣ");
     z.display();
	}

}
