package txt_12chap_3_1;
import java.util.*;
public class many_thread extends Thread {
    int time;
    String name;
	public many_thread(String s,int t)
	{
		name = s;
		time = t;
	}
	public void run()
	{
		int i=1;
		while(i<=6)
		{
				try{
					System.out.println("No."+i+"  "+name);
					i++;
					Thread.sleep(time);
				}catch(InterruptedException e) {}
			
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		many_thread th1=new many_thread("Fast",1000);
		th1.start();
		many_thread th2=new many_thread("Mid",2000);
		th2.start();
		many_thread th3=new many_thread("Slow",3000);
		th3.start();
		
	}

}
