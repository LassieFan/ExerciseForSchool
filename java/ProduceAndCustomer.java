package txt_12chap_3_7;

///�������߳�
class Producer extends Thread
{
	date d;
	boolean flag = true;
	Producer(date d)
	{
		this.d = d;
	}
	public void run()
	{
		while(flag)
		{
			synchronized (d)
			{	
				///��ʼ����
				if(d.number < 10)
				{
					if(d.flag == true)
					{
						try
						{
							d.number++;
							System.out.print("������"+d.number+".....");
							d.flag = false;
							Thread.sleep(1000);
						}
						catch (InterruptedException e)
						{
							e.printStackTrace();
						}
					}
				}else flag = false;
				///��������
			}
		}
	}
}

///�������߳�
class Consumer extends Thread
{
	date d;
	boolean flag = true;
	Consumer(date d)
	{
		this.d = d;
	}
	public void run()
	{
		while(flag)
		{
			synchronized (d)
			{
				///��������
				if(d.number < 10)
				{
					if(d.flag == false)
					{
						try
						{
							System.out.println("���ѣ�"+d.number);
							d.flag = true;
							Thread.sleep(500);
						}
						catch (InterruptedException e)
						{
							e.printStackTrace();
						}
					}
				}
				if(d.number == 10)
				{
					if(d.flag == false)
					{
						System.out.println("���ѣ�"+d.number);
						flag = false;	
					}
				}
				///���ѽ���	
			}
		}
	}
}

///�ٽ���Դ
class date
{
	int number = 0;
	boolean flag = true;
}

public class ���������� {
	public static void main(String[] args) 
	{
		System.out.println("#########��������ģ�Ϳ�ʼ#########");
		date d = new date();
		Producer p = new Producer(d);
		p.start();
		Consumer c = new Consumer(d);
		c.start();
      try 
      {  
  		p.join();
  		c.join();
      } 
      catch (InterruptedException e) 
      {  
          e.printStackTrace();  
      }
		System.out.println("#########��������ģ�ͽ���#########");
	}
}