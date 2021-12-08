import java.awt.*;
import javax.swing.*;

public class Main{
	public static void main(String[] argv){
		Finestra f = new Finestra("ES");
		Container c = f.getContentPane(); 
		Pannello panel = new Pannello();
		Pannello2 panel2 = new Pannello2();
		c.add(panel);
		f.setLocation(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}


	

