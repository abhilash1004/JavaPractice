/*class Base { 
    public void Print() 
    { 
        System.out.println("Base"); 
    } 
} 
  
class Derived extends Base { 
    public void Print() 
    { 
        System.out.println("Derived"); 
    } 
} 
  
class Main { 
    public static void DoPrint(Base o) 
    { 
        o.Print(); 
    } 
    public static void main(String[] args) 
    { 
        Base x = new Base(); 
        Base y = new Derived(); 
        Derived z = new Derived();
        x = z; 
       // z = y;
        DoPrint(x); 
        DoPrint(y); 
        DoPrint(z); 
    } 
}*/
/*class Test { 
    int x  = 10;
    int y = x + 5;   
    public static void main(String[] args) {     
         Test t = new Test(); 
         System.out.println(t.x+" "+t.y); 
    } 
} */
/*class Test1 {    
    Test1(int x) { 
        System.out.println("Constructor called " + x); 
    } 
} 
   
// This class contains an instance of Test1  
class Test2 {     
    Test1 t1 = new Test1(10);    
   
    Test2(int i) { t1 = new Test1(i); }  
   
    public static void main(String[] args) {     
         Test2 t2 = new Test2(5); 
    } 
} */
// Main.java 
/*class Test 
{ 
    public static void main(String args[]) 
    { 
        short s = 0; 
        int x = 07; 
        int y = 8; 
        int z = 112345; 

        s += z; 
        System.out.println("" + x+" " + y+" " + s); 
    } 
} //end class */
class Alpha 
{ 
    public String type = "a "; 
    public Alpha() { System.out.print("alpha "); } 
} 

class Beta extends Alpha 
{
    //String type = "c ";
    public Beta() { System.out.print("beta "); } 

    void go() 
    { 
        super.type = "b "; 
        System.out.print(this.type + super.type); 
    } 

    public static void main(String[] args) 
    { 
        new Beta().go(); 
    } 
} 

