package double_to_int;

import javax.swing.JOptionPane;

public class double_to_int {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=JOptionPane.showInputDialog("please input the data");
		double a=Double.parseDouble(s);
		int b=(int)a;
		double c=a-b;
		System.out.println("cha is:"+c);
	    System.out.printf("cha is %.4f", c);
	}

}
