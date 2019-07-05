package Is_drop_num;
import java.io.*;

import javax.swing.JOptionPane;
public class drop_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s=JOptionPane.showInputDialog("please input n:");
     int n=Integer.parseInt(s);
     int m=n/10;
     int k=n%10;
     int flag=1;
     while(m!=0)
     {
    	 if(k<=(m%10))
    	 {
    		 k=m%10;
    		 m/=10;		 
    	 }
    	 else
    	 {
    		 flag=0;
    		 break;
    	 }
     }
     if(1==flag)
     {
    	 System.out.println("this num is drop");
     }
     else
     {
    	 System.out.println("this num is not drop");
     }
	}

}
