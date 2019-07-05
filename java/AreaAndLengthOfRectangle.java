package area;

import javax.swing.JOptionPane;

public class 矩形面积周长 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=JOptionPane.showInputDialog("please input the length");
        String s2=JOptionPane.showInputDialog("please input the width");
        double a,b;
        a=Double.parseDouble(s1);
        b=Double.parseDouble(s2);
        double area=a*b;
        double zhouchang=2*(a+b);
        JOptionPane.showMessageDialog(null,"the area is:"+area);
        JOptionPane.showMessageDialog(null,"the zhouchang is:"+zhouchang);
	}

}
