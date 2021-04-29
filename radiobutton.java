import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 class JRadioButtonDemo extends JFrame implements ActionListener
{	JLabel jlab;
	public static void main(String[] args)
	{	  try
		  {	SwingUtilities.invokeAndWait(new Runnable()
                                    {         public void run()
			       {JRadioButtonDemo jtbd = new JRadioButtonDemo();
				     jtbd.makeGUI();
			       } } );
		                }
		catch(Exception exc)
		{	System.out.println("cant create because of"+exc); 	}
	}
  private void makeGUI()
	{
		setLayout(new FlowLayout());
		JRadioButton b1 = new JRadioButton("A");
		b1.addActionListener(this);
		add(b1);
		JRadioButton b2 = new JRadioButton("B");
		b2.addActionListener(this);
		add(b2);
		JRadioButton b3 = new JRadioButton("C");
		b3.addActionListener(this);
		add(b3);
		// Define a button group
		ButtonGroup bg = new ButtonGroup();
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);
	                jlab = new JLabel("Select one");
	                add(jlab); setSize(300, 300); setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		jlab.setText("You Selected "+ae.getActionCommand());
	} }
