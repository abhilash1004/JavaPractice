import  java.io.*;
import java.util.*;
class q1
{
  public static void main(String[] args) throws IOException {
    Scanner sc=new Scanner(System.in);
    String info;
    System.out.println("ENTER String value");
    info=sc.next();
    OutputStream f1=new FileOutputStream("q1.txt");
    byte b[]=info.getBytes();

      f1.write(b);

    f1.close();
    InputStream f=new FileInputStream("q1.txt");
    byte b2[]=new byte[f.available()] ;
    int v=f.read(b2);
    for(int j=0;j<info.length();j++)
    {
      System.out.println(new String(b,0,f.available()));
    }
    f.close();
  }
}
