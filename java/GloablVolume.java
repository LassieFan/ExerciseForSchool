package v_square;
import java.io.*;
public class ÇòÌåÌå»ı {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     double r;
     System.out.print("please input the r:");
     try
     {
    	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	 String s=br.readLine();
    	 r=Double.parseDouble(s);
    	 double v=4/3*Math.PI*r*r*r;
    	 System.out.println("the v is:"+v);
     }catch(IOException e){
    	 System.out.println(e);
     }
	}
    
}
