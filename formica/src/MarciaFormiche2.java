/*
  Questa classe definisce tre formiche (oggetti della classe FormicaCompleta)
  che si muovono nel piano x,y. Se passano attraverso la retta di 
  equazione x = 150, mangiano 100 unita' di cibo. Si vuol vedere se 
  qualcuna delle formiche riesce a raggiungere il traguardo, che e'
  la retta di equazione x = 300.
*/
// <applet code = "MarciaFormiche2.class" height = 400 width = 450>
// </applet>


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MarciaFormiche2 extends JApplet {

    public final static int LINEA_CIBO = 150;
    public final static int PASTO = 100;
    public final static int TRAGUARDO = 300;

    private FormicaCompleta f1, f2, f3;
    private Disegno disegno;
    private JTextField info1, info2, info3;

    private Timer tempor;

    public void init() {

	// definisco tre formiche:
	f1 = new FormicaCompleta(200, 180, "Ada");
	f2 = new FormicaCompleta(200, 200, "Carla");
	f3 = new FormicaCompleta(200, 220, "Chiara");
	f1.setPasso(5);
	f2.setPasso(5);
	f3.setPasso(5);

	disegno = new Disegno();

	tempor = new Timer(100, new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    f1.muoviUnPasso();
		    f2.muoviUnPasso();
		    f3.muoviUnPasso();
		    if (f1.posizioneX() == LINEA_CIBO) 
			f1.mangia(PASTO);

		    if (f2.posizioneX() == LINEA_CIBO) 
			f2.mangia(PASTO);
		    
		    if (f3.posizioneX() == LINEA_CIBO) 
			f3.mangia(PASTO);

		    if (!f1.isAlive() && !f2.isAlive() && !f3.isAlive())
			tempor.stop();

		    if (f1.posizioneX() > TRAGUARDO ||
			  f2.posizioneX() > TRAGUARDO ||
			  f3.posizioneX() > TRAGUARDO)
			tempor.stop();

		    info1.setText("energia di " + f1.dammiNome() 
				  + ": " + f1.getEnergia());
		    info2.setText("energia di " + f2.dammiNome() 
				  + ": " + f2.getEnergia());
		    info3.setText("energia di " + f3.dammiNome() 
				  + ": " + f3.getEnergia());

		    disegno.repaint();
		}
	    });

	Container cont = getContentPane();
	cont.add(disegno, BorderLayout.CENTER);
	info1 = new JTextField(10);
	info2 = new JTextField(10);
	info3 = new JTextField(10);
	info1.setText("energia di " + f1.dammiNome() 
		      + ": " + f1.getEnergia());
	info2.setText("energia di " + f2.dammiNome() 
		      + ": " + f2.getEnergia());
	info3.setText("energia di " + f3.dammiNome() 
		      + ": " + f3.getEnergia());

	JPanel pannelloInfo = new JPanel();
	pannelloInfo.setLayout(new GridLayout(1, 3));
	pannelloInfo.add(info1);
	pannelloInfo.add(info2);
	pannelloInfo.add(info3);
	cont.add(pannelloInfo, BorderLayout.SOUTH);
	tempor.start();

    }

    // classe interna che definisce il disegno
    private class Disegno extends JPanel {
	public void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    f1.disegna(g);
	    f2.disegna(g);
	    f3.disegna(g);
	    g.setColor(Color.green);
	    g.drawLine(LINEA_CIBO, 0, LINEA_CIBO, 400);
	    g.setColor(Color.orange);
	    g.drawLine(TRAGUARDO, 0, TRAGUARDO, 400);

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

} // fine classe MarciaFormiche
