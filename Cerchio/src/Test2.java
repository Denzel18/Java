import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Test2 extends JApplet {

	MyFrame f = new MyFrame("Denis Bernovschi"); 
	
    public final static int LINEA_ENERGIA =200;
    public final static int ENERGIA = 100;
    public final static int TRAGUARDO = 300;

    private Cerchio_grafico f1, f2, f3;
    private Disegno disegno;
    private JTextField info1, info2, info3;

    private Timer tempor;

    public void init() {

	// definisco tre formiche:
	f1 = new Cerchio_grafico(250, 180, "F1");
	f2 = new Cerchio_grafico(250, 200, "F2");
	f3 = new Cerchio_grafico(250, 220, "F3");
	
	f1.setPasso(10);
	f2.setPasso(10);
	f3.setPasso(10);

	disegno = new Disegno();

	tempor = new Timer(100, new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    f1.muoviUnPasso();
		    f2.muoviUnPasso();
		    f3.muoviUnPasso();
		    
		    if (f1.posizioneX() == LINEA_ENERGIA) 
		    	f1.assumiEnergia(ENERGIA);

		    if (f2.posizioneX() == LINEA_ENERGIA) 
		    	f2.assumiEnergia(ENERGIA);
		    
		    if (f3.posizioneX() == LINEA_ENERGIA) 
		    	f3.assumiEnergia(ENERGIA);

		    if (!f1.isAlive() && !f2.isAlive() && !f3.isAlive())
		    	tempor.stop();

		    if (f1.posizioneX() > TRAGUARDO || f2.posizioneX() > TRAGUARDO || f3.posizioneX() > TRAGUARDO)
		    	tempor.stop();

		    info1.setText("energia di " + f1.dammiNomeOggetto()+ ": " + f1.getEnergia());
		    info2.setText("energia di " + f2.dammiNomeOggetto()+ ": " + f2.getEnergia());
		    info3.setText("energia di " + f3.dammiNomeOggetto()+ ": " + f3.getEnergia());

		    disegno.repaint();
		}
	    });

	Container cont = getContentPane();
	cont.add(disegno, BorderLayout.CENTER);
	cont = f.getContentPane();
	info1 = new JTextField(10);
	info2 = new JTextField(10);
	info3 = new JTextField(10);
	info1.setText("energia di " + f1.dammiNomeOggetto()+ ": " + f1.getEnergia());
	info2.setText("energia di " + f2.dammiNomeOggetto()+ ": " + f2.getEnergia());
	info3.setText("energia di " + f3.dammiNomeOggetto()+ ": " + f3.getEnergia());

	JPanel pannelloInfo = new JPanel();
	//pannelloInfo.setDimension()
	pannelloInfo.setLayout(new GridLayout(1, 3));
	pannelloInfo.add(info1);
	pannelloInfo.add(info2);
	pannelloInfo.add(info3);
	cont.add(pannelloInfo, BorderLayout.SOUTH);
	cont.add(disegno , BorderLayout.CENTER);
	f.setVisible(true);
	tempor.start();

    }
    private class Disegno extends JPanel {
    	public void paintComponent(Graphics g) {
	    	super.paintComponent(g);
	    	f1.disegna(g);
	    	f2.disegna(g);
	    	f3.disegna(g);
	    	g.setColor(Color.black);
	    	int larghezza=500, altezza=400;
	    	g.drawLine(0,altezza/2, larghezza-1,altezza/2);
	    	g.drawLine(larghezza/2,0,larghezza/2,altezza-1);
	    	g.setColor(Color.green);
	    	g.drawString("ENERGIA", LINEA_ENERGIA, 400);
	    	g.drawLine(LINEA_ENERGIA, 0, LINEA_ENERGIA, 400);
		    g.setColor(Color.orange);
		    g.drawString("TRAGUARDO", TRAGUARDO, 400);
		    g.drawLine(TRAGUARDO, 0, TRAGUARDO, 400);
		}
    }
    
    public class MyFrame extends JFrame { 
    	  public MyFrame(){  
    	  super(); setBounds(500,500,500,500); 
    	  } 
    	  public MyFrame(String titolo){  
    	  super(titolo);  
    	  setBounds(500,500,500,500); 
    	  } 
    }

    

    public void stop() {
	if (tempor != null) 
	    tempor.stop();
    }

    public void start() {
	if (tempor != null && !tempor.isRunning())
	    tempor.start();
    }

    public void destroy() {
    	tempor = null;
    }

}
