package txt_8chap_3_3;

abstract class fruit
{
	abstract public String getWeight();
}
class apple extends fruit
{
	private double w;
	public apple(double w_)
	{
		w=w_;
	}
	public String getWeight()
	{
		return "ƻ���������ǣ�"+w;
	}
}
class pear extends fruit
{
	private double w;
	public pear(double w_)
	{
		w=w_;
	}
	public String getWeight()
	{
		return "���ӵ������ǣ�"+w;
	}
}
class orange extends fruit
{
	private double w;
	public orange(double w_)
	{
		w=w_;
	}
	public String getWeight()
	{
		return "���ӵ������ǣ�"+w;
	}
}
public class fruite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     apple x=new apple(3);
     pear y=new pear(4);
     orange z=new orange(5);
     fruit s[]= {x,y,z};
     for(int i=0;i<s.length;i++)
     {
    	 System.out.print("ˮ��������:"+s[i].getClass().getName()+"  ");
    	 System.out.println(s[i].getWeight());
     }
	}

}
