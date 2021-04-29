import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculator
{
  JLabel jl;
  JTextField jt;
  Calculator()
  {
    String str="",str2="";
    JFrame jf=new JFrame("Calculator");
    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jt=new JTextField(20);
    jf.setLayout(new GridLayout(5,4));
    jf.add(jt);
    JButton b=new JButton(""+0);
    jf.add(b);
    b.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
        String s=jt.getText();
        jt.setText(s+0);
      }
    });
    b=new JButton(""+1);
    jf.add(b);
    b.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
        String s=jt.getText();
        jt.setText(s+1);
      }
    });
    b=new JButton(""+2);
    jf.add(b);
    b.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
        String s=jt.getText();
        jt.setText(s+2);
      }
    });
    b=new JButton(""+3);
    jf.add(b);
    b.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
        String s=jt.getText();
        jt.setText(s+3);
      }
    });
    b=new JButton(""+4);
    jf.add(b);
    b.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
        String s=jt.getText();
        jt.setText(s+4);
      }
    });
    b=new JButton(""+5);
    jf.add(b);
    b.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
        String s=jt.getText();
        jt.setText(s+5);
      }
    });
    b=new JButton(""+6);
    jf.add(b);
    b.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
        String s=jt.getText();
        jt.setText(s+6);
      }
    });
    b=new JButton(""+7);
    jf.add(b);
    b.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
        String s=jt.getText();
        jt.setText(s+7);
      }
    });
    b=new JButton(""+8);
    jf.add(b);
    b.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
        String s=jt.getText();
        jt.setText(s+8);
      }
    });
    b=new JButton(""+9);
    jf.add(b);
    b.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
        String s=jt.getText();
        jt.setText(s+9);
      }
    });
    JButton b1=new JButton("+");
    JButton b2=new JButton("-");
    JButton b3=new JButton("*");
    JButton b4=new JButton("/");
    jf.add(b1);
    jf.add(b2);
    jf.add(b3);
    jf.add(b4);
    b1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
        String s2=jt.getText();
        jt.setText(s2+"+");
      }
    });
    b2.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
        String s3=jt.getText();
        jt.setText(s3+"-");
      }
    });
    b3.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
        String s4=jt.getText();
        jt.setText(s4+"*");
      }
    });
    b4.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
        String s5=jt.getText();
        jt.setText(s5+"/");
      }
    });
    JButton b5=new JButton("=");
    jf.add(b5);
    jl=new JLabel("");
    b5.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
        String str2=jt.getText();
        if(str2.length()!=0)
        {
          char ch[]=new char[str2.length()];
          str2.getChars(0,str2.length(),ch,0);
          int p=-1;
          for(int i=0;i<ch.length;i++)
          {
            if(ch[i]=='+'||ch[i]=='-'||ch[i]=='*'||ch[i]=='/')
            {
              p=i;
              break;
            }
          }
          if(p!=-1)
          {int ans;
          int n1=Integer.parseInt(str2.substring(0,p));
          int n2=Integer.parseInt(str2.substring(p+1,str2.length()));
          switch(ch[p])
          {
            case '+':
                  ans=n1+n2;
                  break;
            case '-':
                  ans=n1-n2;
                  break;
            case '*':
                   ans=n1*n2;
                  break;
            case '/':
                  ans=n1/n2;
                  break;
            default:
                 ans=0;
          }
          jl.setText(""+ans);
          jt.setText("");
         }
         else
         {
           jl.setText("Invalid Expression");
         }
        }
      }
    });
    JButton jb=new JButton("DEL");
    jf.add(jb);
    jf.add(jl);
    jb.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
        String s=jt.getText();
        int n=s.length();
        jt.setText(s.substring(0,n-1));
      }
    });
   }
   public static void main(String[] args) {
     SwingUtilities.invokeLater(new Runnable()
     {
       public void run()
       {
         new Calculator();
       }
     });
   }
}
