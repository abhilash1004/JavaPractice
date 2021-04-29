import java.io.*;
class Examprac
{
  public static void main(String[] args) throws IOException{
    String name="exam.txt";
    FileInputStream f=new FileInputStream(name);
    int n=f.available();
    byte b[]=new byte[n];
    f.read(b);
    String str=new String(b);
    String str2[]=str.split("\n");
    f.close();
    String data[][]=new String[str2.length][6];
    for(int i=0;i<str2.length;i++)
    {
      data[i]=str2[i].split(" ");
    }
    Thread1 ob=new Thread1(data);
    Thread t;
    try
    {
      ob.t.join();
    //Thread.sleep(5);
    }
    catch(Exception e)
    {}
    Thread2 ob2=new Thread2(data);
    try
    {
      ob2.t.join();
    //Thread.sleep(5);
    }
    catch(Exception e)
    {}
      //System.out.println("Program Finished"+Integer.parseInt(data[1][3])+"\n"+data[1][4]+"\n"+data[1][2]);
    //System.out.println("Program Finished");
    int p=ob.max();
    char buffer[]=new char[str2[p].length()];
    str2[p].getChars(0,str2[p].length(),buffer,0);
    FileWriter f2=new FileWriter(name,true);
    f2.write(buffer);
    f2.close();
  }
}
class Thread1 implements Runnable
{
  String str[][];
  Thread t;
  int i;
  Thread1(String str[][])
  {
    this.str=str;
    t=new Thread(this);
    try
    {
      t.start();
    }
    catch(Exception e)
    {}
  }
  public void run()
  {
    int n=str.length;
    int max=0,i,m1,m2,m3;
    int m[]=new int[str.length];
    for(i=0;i<3;i++)
    {
      m1=Integer.parseInt(str[i][2]);
      m2=Integer.parseInt(str[i][3]);
      m3=Integer.parseInt(str[i][4]);
      m[i]=m1+m2+m3;
      if(max>m[i])
      {max=m[i];
        this.i=i;
      }
      System.out.println("Total marks of "+str[i][1]+" are "+m[i]);
      try
      {t.sleep(1000);}
      catch(Exception e)
      {}
    }
  }
  public int max()
  {
    return i;
  }
}
class Thread2 implements Runnable
{
  String str[][];
  Thread t;
  Thread2(String str[][])
  {
    this.str=str;
    t=new Thread(this);
    try
    {
      t.start();
    }
    catch(Exception e)
    {}
  }

  public void run()
  {
    int temp,high,i,m1,m2,m3=0;
    for(i=0;i<str.length;i++)
    {
      m1=Integer.parseInt(str[i][2]);
      m2=Integer.parseInt(str[i][3]);
      m3=Integer.parseInt(str[i][4]);
      temp=(m1>m2?m1:m2);
      high=temp>m3?temp:m3;
      System.out.println("Highest marks of "+str[i][1]+" are "+high);
      try
      {
        t.sleep(1000);
      }
      catch(Exception e)
      {}
    }
  }
}
