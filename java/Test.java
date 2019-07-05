package exp_12chap_12_3;
import java.util.*;
class PersonPassBridge extends Thread{
   private Bridge bridge;    //�Ŷ���
   String id;               //�˵ı�ʶ
	
   public PersonPassBridge(String id,Bridge b)
   {
	   this.id=id;
	   this.bridge=b;
   }
   public void run()
   {
	   bridge.getBridge();    //�ȴ�����
	   System.out.println(id+"�����š���������");
	   try
	   {
		   Thread.sleep((int)Math.random()*1000);
	   }catch(InterruptedException e) {}
	   bridge.goDownBridge();    //
   }
}
class Bridge
{
	private boolean engaged=false;      //�ŵ�ռ��״̬
	
	public synchronized void getBridge()   //ȡ�������ʸ�
	{
		while(engaged)
		{
   			try{
   				wait();                  //����ű�ռ�þ�ѭ���ȴ�
   			}catch(InterruptedException e) {}
		}
		engaged=true;	    //ռ���ţ�Ϊtrue��Ϊռ��
	}
	
	public synchronized void goDownBridge()      //����
	{
		engaged=false;
		notifyAll();                             //���������ȴ����߳�
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
        	x=new PersonPassBridge("�ϱߣ���"+k+"��",b);
        	x.start();
        }
        for(int k=1;k<=3;k++)
        {
        	x=new PersonPassBridge("���ߣ���"+k+"��",b);
        	x.start();
        }
	}
}