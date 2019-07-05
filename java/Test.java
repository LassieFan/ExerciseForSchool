package exp_12chap_12_3;
import java.util.*;
class PersonPassBridge extends Thread{
   private Bridge bridge;    //桥对象
   String id;               //人的标识
	
   public PersonPassBridge(String id,Bridge b)
   {
	   this.id=id;
	   this.bridge=b;
   }
   public void run()
   {
	   bridge.getBridge();    //等待上桥
	   System.out.println(id+"正过桥。。。。。");
	   try
	   {
		   Thread.sleep((int)Math.random()*1000);
	   }catch(InterruptedException e) {}
	   bridge.goDownBridge();    //
   }
}
class Bridge
{
	private boolean engaged=false;      //桥的占用状态
	
	public synchronized void getBridge()   //取得上桥资格
	{
		while(engaged)
		{
   			try{
   				wait();                  //如果桥被占用就循环等待
   			}catch(InterruptedException e) {}
		}
		engaged=true;	    //占用桥，为true即为占用
	}
	
	public synchronized void goDownBridge()      //下桥
	{
		engaged=false;
		notifyAll();                             //唤醒其他等待的线程
	}
	
}
public class Test
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        Bridge b=new Bridge();
        PersonPassBridge x;
        for(int k=1;k<=4;k++)
        {
        	x=new PersonPassBridge("南边，第"+k+"人",b);
        	x.start();
        }
        for(int k=1;k<=3;k++)
        {
        	x=new PersonPassBridge("北边，第"+k+"人",b);
        	x.start();
        }
	}
}