class NewThread implements Runnable
{
    Thread t;
    NewThread(String str)
    {
      t=new Thread(this,str);
      System.out.println("Child Thread"+t);
      t.start();
    }
    public void run()
    {
      try
      {
        for(int i=5;i>0;i--)
        {
          System.out.println("Thread Child:"+i);
          t.sleep(1000);
        }
      }
      catch(Exception e)
      {
        System.out.println("Exception: "+e);
      }
    }
}
/*class NewThread2 extends Thread1
{
  NewThread2(String str);
  {
    super(str);
    System.out.println("created "+str );
    start();
  }
  public void run()
  {
    try
    {
      for(int i=5;i>0;i--)
      {
        System.out.println(getName()+":"+i);
        sleep(1000);
      }
    }
    catch(Exception e)
    {
      System.out.println("Exception: "+e);
    }
  }
}*/
class threadQ2
{
  public static void main(String[] args) {
    Thread t;
    NewThread ob=new NewThread("One");
    //new NewThread("Two");
    //new NewThread("three");
    //ob.t.setPriority(6);
    //try{
    //Thread.sleep(16000);}
    //catch(Exception e){}
    try
    {
      for(int i=5;i>0;i--)
      {
        System.out.println("Thread Main:"+i);
        Thread.sleep(1000);
      }
    }
    catch(Exception e)
    {
      System.out.println("Exception: "+e);
    }
  }
}
