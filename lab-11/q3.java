import java.util.*;
class eThread extends Thread
{
	public void run()
	{
		try{
		Thread.sleep(10000/3);
		System.out.println("Thread created.");
		}
		catch(Exception e)
		{System.out.println(e);}
	}
}
class q3
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		eThread e1=new eThread();
		eThread e2=new eThread();
		eThread e3=new eThread();
		e1.start();
		try{
			e1.join();
		}catch(Exception e)
		{}
		e2.start();
		try{
			e2.join();
		}catch(Exception e)
		{}
		e3.start();
		try{
			e1.join();
		}catch(Exception e)
		{}
		System.out.println(e1.isAlive());
		System.out.println(e2.isAlive());
		System.out.println(e3.isAlive());
	}
}
