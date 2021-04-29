import java.util.*;
class me extends Exception
{

  public String toString()
  {
    return ("Invalid");
  }
}

class regno
{
  public static void numb(int a) throws Exception
  {
    if (a>10)
    {
      a=100201/0;
      //throw new me();
    }
    else
    System.out.println("fine");
  }
  public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int num;
    num=sc.nextInt();
    int a=10/0;

    //try{
      //numb(num);//}
    //catch(Exception e)
    //{
      System.out.println("sdaf");
     //}
  }

}
