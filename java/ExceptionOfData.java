package txt_9chap_4_3;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class »’∆⁄“Ï≥£ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     Scanner s=new Scanner(System.in);
		     String str=s.nextLine();
		     s.close();
		     SimpleDateFormat sm=new SimpleDateFormat("yyyy/mm/dd");
		     try
		     {
		    	Date date=sm.parse(str);
		    	System.out.println(date);
		     }catch(ParseException e)
		     {
		    	 e.printStackTrace();
		     }
	}

}
