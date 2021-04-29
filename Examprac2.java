import java.io.*;
import java.util.*;
class Author implements Serializable
{
  String name,Dob,City;
  int AId;
  Author(String name,String Dob,int id,String City)
  {
    this.name=name;
    this.Dob=Dob;
    this.AId=id;
    this.City=City;
  }
  public String toString()
  {
    return ("Name "+name+" ,Dob= "+Dob+" City: "+City);
  }
}
class Book implements Serializable
{
  int ISBN;
  String author,name,date,cat;
  Book(int num,String author,String name,String date,String cate)
  {
    this.ISBN=num;
    this.author=author;
    this.name=name;
    this.date=date;
    this.cat=cate;
  }
  public String toString()
  {
    return ("Book Name "+name+" ,Author Name= "+author+" Date: "+date);
  }
}
class BookException extends Exception
{
  String book;
  BookException(String name)
  {
    this.book=name;
  }
  public String toString()
  {
    return ("It is BookNameException \n Book's Name is wrong : "+book);
  }
}
class ep2
{
  public static void book_check(String str) throws BookException
  {
    int num;
    char ch[]=new char[str.length()];
    str.getChars(0,str.length(),ch,0);
      for(int i=0;i<str.length();i++)
      {
        num=ch[i];
        if((num<=90&&num>=65) || (num>=97&&num<=122) || (num>47 && num<59))
        {
          continue;
        }
        throw new BookException(str);
      }

  }
  public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n1,n2,i,j;
    System.out.println("Enter No of Authors");
    n1=sc.nextInt();
    System.out.println("Enter No of Books");
    n2=sc.nextInt();
    System.out.println("Enter the Details Of Author");
    Author ob1[]=new Author[n1];
    String name,dob,city;
    int id;
    for(i=0;i<n1;i++)
    {
      System.out.println("Enter Authors name,Date of Birth,Author id,city of "+i+1+"th Person ");
      name=sc.next();
      dob=sc.next();
      id=sc.nextInt();
      city=sc.next();
      ob1[i]=new Author(name,dob,id,city);
    }
    Book ob2[]=new Book[n2];
    String aut,nam,date,cat;
    int idcode;
    System.out.println("Enter details of books: ");
    for(i=0;i<n2;i++)
    {
        System.out.println("Enter isbn number,author name,book name,date of release,category ");
        idcode=sc.nextInt();
        aut=sc.next();
        nam=sc.next();
        date=sc.next();
        cat=sc.next();
        try
        {
          book_check(nam);
          ob2[i]=new Book(idcode,aut,nam,date,cat);
        }
        catch(BookException e)
        {
          System.out.println("Entered Book name is wrong\n Book Rejected \n Re-Enter the Values");
          i--;
          continue;
        }
    }
    String fname="exam2.txt";
    FileOutputStream fos=new FileOutputStream(fname,true);
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    for(i=0;i<n1;i++)
    {
      oos.writeObject(ob1[i]);
    }
    for(i=0;i<n2;i++)
    {
      oos.writeObject(ob2[i]);
    }
    oos.flush();
    oos.close();
    FileInputStream fis=new FileInputStream(fname);
    ObjectInputStream ois=new ObjectInputStream(fis);
    for(i=0;i<n1;i++)
    {
      ob1[i]=(Author)ois.readObject();
    }
    for(i=0;i<n2;i++)
    {
      ob2[i]=(Book)ois.readObject();
    }

    for(i=0;i<n1;i++)
    {
      System.out.println(ob1[i]);
    }
    for(i=0;i<n2;i++)
    {
      System.out.println(ob2[i]);
    }
  }
}
