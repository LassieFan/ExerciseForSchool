package txt_12chap_3_7;

///生产者线程
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
				///开始生产
				if(d.number < 10)
				{
					if(d.flag == true)
					{
						try
						{
							d.number++;
							System.out.print("生产："+d.number+".....");
							d.flag = false;
							Thread.sleep(1000);
						}
						catch (InterruptedException e)
						{
							e.printStackTrace();
						}
					}
				}else flag = false;
				///生产结束
			}
		}
	}
}

///消费者线程
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
				///消费生产
				if(d.number < 10)
				{
					if(d.flag == false)
					{
						try
						{
							System.out.println("消费："+d.number);
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
						System.out.println("消费："+d.number);
						flag = false;	
					}
				}
				///消费结束	
			}
		}
	}
}

///临界资源
class date
{
	int number = 0;
	boolean flag = true;
}

public class 生产消费者 {
	public static void main(String[] args) 
	{
		System.out.println("#########生产消费模型开始#########");
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
		System.out.println("#########生产消费模型结束#########");
	}
}