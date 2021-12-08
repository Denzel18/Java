/**
 * 
 */

/**
 * @author Denis Bernovschi
 *
 */
/*
 * denis bernovschi
 * 4ain
 * 25/02/2015
 * prova-grafica-4
*/

import java.awt.*; 
import javax.swing.*;

public class EsSwing4 { 
	public static void main(String[] v){ 
		MyFrame f = new MyFrame("Denis Bernovschi"); 
		// potremmo anche usare un JFrame standard… 
		Container c = f.getContentPane(); 
		MyPanel panel = new MyPanel(); 
		c.add(panel); 
		f.setVisible(true); 
	} 
}
