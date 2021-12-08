/*
 * denis bernovschi
 * 4ain
 * 25/02/2015
 * prova-grafica-4
*/

import java.awt.*; 
import javax.swing.*;
 
public class MyPanel extends JPanel { 
private int contatore ;
 public void paintComponent(Graphics g){  
   super.paintComponent(g);
		g.setColor(Color.yellow);
		// white, gray, lightGray, darkGray  
		// red, green, yellow, pink, etc. etc.  
		g.fillRect(160,160, 180,180);
		g.setColor(Color.blue);   
	    g.drawRect(160,160, 180,180); 
	    g.setColor(Color.black);
	    g.setColor(Color.green);
	    g.drawOval(160,160, 180,180);
	    g.drawString("sei bravissimo",160,170);
	    g.setColor(Color.red);
	    g.drawString("contatore : "+contatore , 160,180);
	    this.contatore++;
	}
 } 
