import java.util.*;
class Ithread implements Runnable
{
  Thread t;
  Ithread()
  {
    t=new Thread(this);
    //System.out.println("")
    t.start();
  }
  public void run()
  {
    System.out.println("Thread created through interface Runnable");
  }
}
class Ethread extends Thread
{
  Ethread()
  {
    super();
    start();
  }
  public void run()
  {
    System.out.println("Thread created through Superclass Thread");
  }
}
class q1
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n;
    do
    {
      System.out.println("Enter 1-Through Interface 2-Through Superclass 3-exit");
      n=sc.nextInt();
      switch(n)
      {
        case 1:
          new Ithread();
          break;
        case 2:
          new Ethread();
          break;
      }
      try{Thread.sleep(1000);}
      catch(InterruptedException e)
      {}
    }while(n!=3);
  }
}
