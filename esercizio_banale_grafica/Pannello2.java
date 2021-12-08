import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Pannello2 extends JPanel 
{

	ImageIcon i1;
	ImageIcon i2;
	ImageIcon i3;
	ImageIcon i4;

	JLabel immagine; 
	
	Border border;
	GridLayout layout; 
	
	public Pannello2() 
    {
		
		immagine = new JLabel ("IMMAGINE");

		i1 = new ImageIcon("i1.jpeg"); 
		i2 = new ImageIcon("i2.jpeg"); 
		i3 = new ImageIcon("i3.jpeg"); 
		i4 = new ImageIcon("i4.png"); 
	
		border=LineBorder.createBlackLineBorder();
	
		layout=new GridLayout(1, 1);
		setLayout(layout);
		setSize(200, 500);
		immagine.setIcon(i2);
    

		this.add(immagine);
	
	
	}
	
}

