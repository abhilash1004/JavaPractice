import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class button
{
  JTextField t;
  JLabel jl;
  button()
  {
    JFrame jf=new JFrame("Enter Name");
    jf.setLayout(new FlowLayout());
    jf.setSize(1300,900);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JButton b1=new JButton("B1");
    t=new JTextField("Enter Name",50);
    jf.add(t);
    jf.add(b1);
    jl=new JLabel("");
    jf.add(jl);
    jf.setVisible(true);
    b1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
        String str=t.getText();
        if(str.length()==0)
        {
          jl.setText("Empty TextField  fill details");
        }
        else
        {
          jl.setText("Details Saved");
        }
      }
    });
  }
  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable()
    {
      public void run()
      {
        new button();
      }
    });
  }
}
