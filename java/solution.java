package Fun_twice;
import javax.swing.*;
public class solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub    
        String s1=JOptionPane.showInputDialog("please input the first data(a)");
        String s2=JOptionPane.showInputDialog("please input the second data(b)");
        String s3=JOptionPane.showInputDialog("please input the third data(c)");
        double a,b,c;
        a=Double.parseDouble(s1);
        b=Double.parseDouble(s2);
        c=Double.parseDouble(s3);
        double d=b*b-4*a*c;
        if(d<0)
        {
          JOptionPane.showMessageDialog(null,"this fun is no answer");
        //  System.out.println("this fun is no answer");
        }
        else if(0==d)
        {
          double x;
          x=-b/(2*a);
          JOptionPane.showMessageDialog(null,"the answer is only:"+x);
        }
        else
        {
           double x1,x2;
           double m=Math.sqrt(d);
           x1=(-b+m)/(2*a);
           x2=(-b-m)/(2*a);
           JOptionPane.showMessageDialog(null,"the first answer is:"+x1);
           JOptionPane.showMessageDialog(null,"the second answer is:"+x2);
        }
	}

}
