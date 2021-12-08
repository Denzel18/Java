import java.awt.*;
import javax.swing.*;
import java.io.IOException;

public class Test{
	public static void main(String[] argv)throws IOException{
		Patente p = new Patente();
		MyFrame f = new MyFrame("Simulazione quiz patente");
		Container c = f.getContentPane(); 
		MyPanel panel = new MyPanel(p);
		c.add(panel);
		f.setLocation(200,100);
		
		//Queste due istruzioni servono a dare colore al panel e al frame
		//f.setBackground(Color.YELLOW);
		//panel.setBackground(Color.CYAN);
		f.setVisible(true);
		panel.salvaSuFile();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}

 
