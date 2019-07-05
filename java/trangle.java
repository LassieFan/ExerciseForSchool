package txt_5chap_1;
import javax.swing.*;
public class trangle {
     
	private double a;
	private double b;
	private double c;
	public trangle()
	{
		a=Double.parseDouble(JOptionPane.showInputDialog("please input the a"));
		b=Double.parseDouble(JOptionPane.showInputDialog("please input the b"));
		c=Double.parseDouble(JOptionPane.showInputDialog("please input the c"));
	}
	public double perimeter()
	{
		return a+b+c;
	}
	public double area()
	{
		double x=perimeter()/2;
		double y=Math.sqrt(x*(x-a)*(x-b)*(x-c));
		return y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     trangle x=new trangle();
     JOptionPane.showMessageDialog(null, "x perimeter is:"+x.perimeter());
     JOptionPane.showMessageDialog(null, "x area is:"+x.area());
     trangle y=new trangle();
     JOptionPane.showMessageDialog(null, "y perimeter is:"+y.perimeter());
     JOptionPane.showMessageDialog(null, "y area is:"+y.area());  
	}

}

