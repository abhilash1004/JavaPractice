
class A
{ void disp()
 {System.out.println("Inside A");}
}
class B extends A
{
 void disp()
 {System.out.println("Inside B");
  super.disp();}
 void OOP()
{
System.out.println("Testing");
}
}
class C extends A
{
 void disp()
 {System.out.println("Inside C");
  super.disp();}
}
class Dispatch
{
 public static void main(String args[])
 {
  A a=new A();
  B b=new B();
  C c=new C();
  A v;
  //B r;
  v=a;
  v.disp();
  v=b;
  //v.OOP();
  //v.disp();
  v=c;
  v.disp();
 }
}
