package txt_8chap_3_2;

interface Shape
{
	double size(); 
}
class rectangle implements Shape
{
	double length;
	double width;
	public rectangle(double l,double w)
	{
		length=l;
		width=w;
	}
	public double size()
	{
		return length*width;
	}
}
class circle implements Shape
{
	double r;
	public circle(double r_)
	{
		r=r_;
	}
	public double size()
	{
		return Math.PI*r*r;
	}
}
class cylinder implements Shape
{
	double r;
	double high;
	public cylinder(double r_,double h)
	{
		r=r_;
		high=h;
	}
	public double size()
	{
		return Math.PI*r*r*high;
	}
}
public class shape_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle x=new rectangle(3,4);
		circle y=new circle(3);
		cylinder z=new cylinder(3,4);
		Shape s[]= {x,y,z};
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i].size());
		}
		
	}

}
