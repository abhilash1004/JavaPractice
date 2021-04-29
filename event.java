import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class EventDemo
{	JLabel  l;
	EventDemo()
	{	JFrame f = new JFrame("An Event Example");
		f.setLayout(new FlowLayout());
		f.setSize(220,90);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 		 JButton b1 = new JButton("Alpha");
        	 JButton b2 = new JButton("Beta");
                      l = new JLabel("Button Press Demo");
f.add(l);
                      f.add(b1);
		 f.add(b2);

		 f.setVisible(true);
     b1.addActionListener(new ActionListener()
                                      {	     public void actionPerformed(ActionEvent ae)
   			     {
   				   l.setText("Alpha was pressed");
   			       }  } );
     		 b2.addActionListener(new ActionListener()
   		           {        	public void actionPerformed(ActionEvent ae)
   	                   	{
   				   l.setText("Beta was pressed");
   		       	}  } );

    	      }
   	      public static void main(String args[])
     	      {	  SwingUtilities.invokeLater(new Runnable()
   		{
   		          public void run()
   		           {
   			     new EventDemo();
   		            } } );
   	                  }
              }
