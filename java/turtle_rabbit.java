package txt_12chap_3_2;

class rabbit extends Thread
{
	int pausetime=500;   //控制兔子速度
	public void run()
	{
		try
		{
			for(int i=1;i<=20;i++)
			{
				if(i<20)
				{
					if(i==5||i==10||i==15)
					{
						System.out.println("the rabbit is sleep now....");
						Thread.sleep(3000);    //兔子睡觉时间，用线程睡眠3秒代替
					}
					System.out.println("Now the rabbit is at  "+i);
					Thread.sleep(pausetime);   //用线程睡眠控制兔子速度
				}
				else
				{
					System.out.println("the rabbit have arrived");
				}
		    }
		}catch(InterruptedException e) {}
	}
}
class turtle extends Thread
{
	int pausetime=700;   //控制乌龟速度
	public void run()
	{
		try
		{
			for(int i=1;i<=20;i++)
			{
				if(i<20)
				{
					if(i==5||i==10||i==15)
					{
						System.out.println("the turtle is sleep now....");
						Thread.sleep(1000);    //乌龟睡觉时间，用线程睡眠1秒代替
					}
					System.out.println("Now the turtle is at  "+i);
					Thread.sleep(pausetime);   //用线程睡眠控制乌龟速度
				}
				else
				{
					System.out.println("the turtle have arrived");
				}
		    }
		}catch(InterruptedException e) {}
	}
}
public class turtle_rabbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**********比赛开始*********");
     rabbit x=new rabbit();
     x.start();
     turtle y=new turtle();
     y.start();
     try
     {
    	 x.join();
    	 y.join();
     }catch(InterruptedException e) {}
     System.out.println("**********比赛结束*********");
	}

}
