
/* Questa classe estende le potenzialita' della classe Formica
   aggiungendo un disegno della formica nella posizione occuata
   dall'animale. 
*/

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class FormicaCompleta extends Formica {

    // dimensioni del corpo della formica:
    private int lunghezzaCorpo = 20;
    private int altezzaCorpo = 10;

    //posizione della formica: 
    private int posizX, posizY;
    private int spostGambe = 1;



    // costruttore 1:
    public FormicaCompleta() {
	super();
    }

    // costruttore 2:
    public FormicaCompleta(int pX, int pY, String nm) {
	super(pX, pY, nm);
    }


    public void disegna(Graphics gg) {
	Graphics2D g =(Graphics2D)gg;
	g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
			    RenderingHints.VALUE_ANTIALIAS_ON);
	posizX = super.posizioneX();
	posizY = super.posizioneY();
	if (super.isAlive())
	    g.setColor(Color.red);
	else
	    g.setColor(Color.black);
	disegnoFormichina(g);
    }

    private void disegnoFormichina(Graphics2D gr) {
	// corpo
	gr.fillOval(posizX - 30, posizY + 2, 12, 12);
	gr.fillOval(posizX - 20, posizY + 2, 12, 2);
	gr.fillOval(posizX - 9, posizY + 2, 8, 8);
	gr.setColor(Color.black);
	// zampe:
	gr.drawLine(posizX - 12, posizY + 3, posizX - 8, posizY - 1);
	gr.drawLine(posizX - 8, posizY - 1, posizX - 1 + spostGambe, posizY + 14);
	gr.drawLine(posizX - 14, posizY + 3, posizX - 12, posizY - 1);
	gr.drawLine(posizX - 12, posizY - 1, posizX - 8 - spostGambe, posizY + 14);
	gr.drawLine(posizX - 16, posizY + 3, posizX - 20, posizY - 1);
	gr.drawLine(posizX - 20, posizY - 1, posizX - 35 + 2*spostGambe, posizY + 14);
	spostGambe = -spostGambe;
    }

}