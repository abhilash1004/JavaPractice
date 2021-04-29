import java.util.*;
class eThread extends Thread
{
	public void start(int a)
	{
		try{
		Thread.sleep(10000/3);
		System.out.println("Thread created."+a);
		}
		catch(Exception e)
		{System.out.println(e);}
	}
}
class prio
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		eThread e1=new eThread();
		eThread e2=new eThread();
		eThread e3=new eThread();
		e1.start(1);
		try{
			e1.join();
		}catch(Exception e)
		{}
		e2.start(2);
		try{
			e2.join();
		}catch(Exception e)
		{}
		e3.start(3);
		try{
			e1.join();
		}catch(Exception e)
		{}
		System.out.println(e1.getPriority());
		System.out.println(e2.getPriority());
		System.out.println(e3.getPriority());
		e1.setPriority(1);
		e2.setPriority(10);
		e3.setPriority(7);
		System.out.println(e1.getPriority());
		System.out.println(e2.getPriority());
		System.out.println(e3.getPriority());
	}
}
