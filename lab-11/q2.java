class NewThread implements Runnable
{
  String name;
  Thread t;
  NewThread(String name)
  {
    this.name=name;
    t=new Thread(this,name);
    System.out.println("Created thread: "+name);
    t.start();
  }
  public void run()
  {
    for(int i=0;i<3;i++)
    {
      try
      {
        System.out.println(t.getName()+": "+i);
        t.sleep(500);
      }
      catch(InterruptedException e)
      {}
    }
  }
}
class q2
{
  public static void main(String[] args) {
    NewThread ob1=new NewThread("one");
    NewThread ob2=new NewThread("two");
    NewThread ob3=new NewThread("three");
    try
    {
      for(int i=0;i<2   ;i++)
      {
        System.out.println(Thread.currentThread()+":"+i);
        Thread.sleep(1000);
      }
    }
    catch(InterruptedException e)
    {}
  }
}
