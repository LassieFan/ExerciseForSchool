package e_x�η�����ֵ;
import java.io.*;

import javax.swing.JOptionPane;

public class similar_val {
	//�׳˺���
	static int recurrence(int b)
	{
		if(0==b)
			return 1;
		else
			return b*recurrence(b-1);
	}
	
	public static void  main(String[] args) {
		// TODO Auto-generated method stub
      double val;
      double  x=0.2;
      double e=0.00001;
      int m=0;
      while(x<=1)
      {
    	  val=0.0;
    	  m=0; 
    	  double s1=0,s=0;
    	  do
    	  {  
    		  val+=Math.pow(x, (double)m)/recurrence(m);
    		  s1=val-s;
    		  s=val;
    		  m++;
    	  } while(s1>=e);
    	  System.out.printf("e��%f�η���ֵΪ��%f%n",x,val);	  	  
    	  x+=0.2;
      }
	}
	}
