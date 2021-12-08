import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.io.IOException;

public class Pannello extends JPanel implements ActionListener 
{
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	
	ImageIcon i1;
	ImageIcon i2;
	ImageIcon i3;
	ImageIcon i4;


	Border border;
	
	JLabel t1; 
	JLabel immagine; 
	JLabel vuoto1; 
	JLabel vuoto2; 
	JLabel vuoto3; 
	JLabel vuoto4; 
	
	
	GridLayout layout; 
	public Pannello() 
    {
		b1 = new JButton ("IMMAGINE 1");
		b2 = new JButton ("IMMAGINE 2");
		b3 = new JButton ("IMMAGINE 3");
		b4 = new JButton ("IMMAGINE 4");
	
		i1 = new ImageIcon("i1.png"); 
		i2 = new ImageIcon("i2.png"); 
		i3 = new ImageIcon("i3.png"); 
		i4 = new ImageIcon("i4.png"); 

	
		t1 = new JLabel("PROVA");
		vuoto1 = new JLabel("vuoto");
		vuoto2 = new JLabel("vuoto");
		vuoto3 = new JLabel("vuoto");
		vuoto4 = new JLabel("vuoto");
		immagine = new JLabel("Immagine");
		
		t1.setText("PROVA");

		border=LineBorder.createBlackLineBorder();
	
		layout=new GridLayout(5, 2);
		setLayout(layout);
		setSize(300, 300);
    
		this.add(b1);
		this.add(vuoto1);
		this.add(b2);
		this.add(vuoto2);
		this.add(b3);
		this.add(immagine);
		this.add(b4);
		this.add(vuoto3);

		
	
	
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	

	
	public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource()== b1)
        {
			immagine.setIcon(i1);
        }
        if (e.getSource()== b2)
        {
			immagine.setIcon(i2);
        }
        if (e.getSource()== b3)
        {
			immagine.setIcon(i3);
        }
        if (e.getSource()== b4)
        {
			immagine.setIcon(i4);
		}
    }
	
}
