class CurrentThreadDemo
{
  public static void main(String[] args) {
    Thread t=Thread.currentThread();
    System.out.println("Current Thread :"+t);
    t.setName("Thread is main");
    System.out.println("After: "+t+"\n"+t.getName());
    try
    {
      for(int i=5;i>0;i--)
      {
        System.out.println("Thread1:"+i);
        t.sleep(1000);
      }
    }
    catch(Exception e)
    {
      System.out.println("Exception: "+e);
    }
  }
}
