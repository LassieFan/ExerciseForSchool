package if_else_exe4;
import javax.swing.*;
public class money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     double price,weight,s,freight;
     String s1=JOptionPane.showInputDialog("please input the price:");
     String s2=JOptionPane.showInputDialog("please input the weight:");
     String s3=JOptionPane.showInputDialog("please input s:");
     price=Double.parseDouble(s1);
     weight=Double.parseDouble(s2);
     s=Double.parseDouble(s3);
     double m=price*weight*s;
     if(s<250)
     {
    	 JOptionPane.showMessageDialog(null,"the freight is:"+m);
    	// System.out.println("the freight is"+m);
     }
     else if(s>=250&&s<500)
     {
    	 JOptionPane.showMessageDialog(null,"the freight is:"+m*(1-0.02));
     }
     else if(s>=500&&s<1000)
     {
    	 JOptionPane.showMessageDialog(null,"the freight is:"+m*(1-0.05));
     }
     else if(s>=1000&&s<2000)
     {
    	 JOptionPane.showMessageDialog(null,"the freight is:"+m*(1-0.08));
     }
     else if(s>=2000&&s<3000)
     {
    	 JOptionPane.showMessageDialog(null,"the freight is:"+m*(1-0.1));
     }
     else
     {
    	 JOptionPane.showMessageDialog(null,"the freight is:"+m*(1-0.15));    	 
     }
	}

}
