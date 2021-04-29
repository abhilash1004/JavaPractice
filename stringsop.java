import java.util.Scanner;
public class stringsop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String ");
        System.out.println("a. To compare two strings\n"+
                           "b. To convert the uppercase character to lower and vice-versa\n"+
                           "c. To display whether an entered string is a substring of the other or not\n"+
                           "d. If the entered string is a substring of the other, replace it with Hello\n"+
                           "e. exit\n");
        int k=0;char c;
        String s="",s5="";
        while(true)
        {
            System.out.println("Enter choice ");
            c=sc.next().charAt(0);
            switch(c)
            {
            case 'a':
                System.out.println("Enter 2 Strings ");
                String s1=sc.next();
                String s2=sc.next();
                if(s1.compareTo(s2)==0)
                {
                    System.out.println("Equal");
                }
                else
                {
                    System.out.println("Not Equal");
                }
                break;
            case 'b':
                System.out.println("Enter a String ");
                String s3=sc.next();
                String ss3="";
                for(int i=0;i<s3.length();i++)
                {
                  char ch=s3.charAt(i);
                    if(Character.isLowerCase(ch))
                    {
                        ss3+=Character.toUpperCase(ch);
                    }
                    else
                    {
                        ss3+=Character.toLowerCase(ch);
                    }
                }
                System.out.println("After converting to lowercase to uppercase and vice versa we get "+ss3);
                break;
            case 'c':
                System.out.println("Enter string and a substring ");
                String s4=sc.next();
                String ss5=sc.next();
                if(s4.indexOf(ss5)>=0)
                {
                    System.out.println("is a substring");
                    s=new String(s4);
                    s5=new String(ss5);
                }
                else
                {
                    System.out.println("Not a Substring");
                }
                break;
            case 'd':
                if(s.isEmpty())
                {
                    System.out.println("Not a Substring\n");
                }
                else
                {
                    String st=s.replace(s5,"Hello");
                    System.out.println("After Replacing Substring with Hello we get "+ st);
                }
                break;
            case 'e':
                System.exit(0);
            }
        }

    }

}
