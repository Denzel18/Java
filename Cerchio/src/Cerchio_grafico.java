import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Cerchio_grafico extends Cerchio{
	private int raggioPalina = 50 ;
	
	private int posizX , posizY ;
	private int spostamento = 1 ;
	
	public Cerchio_grafico (){
		super();
	}
	public Cerchio_grafico(int pX, int pY, String nm) {
		super(pX, pY, nm);
    }
    public void disegna(Graphics gg){
		Graphics2D g =(Graphics2D)gg;
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
		RenderingHints.VALUE_ANTIALIAS_ON);
		posizX = super.posizioneX();
		posizY = super.posizioneY();
		if (super.isAlive())
			g.setColor(Color.red);
		else
			g.setColor(Color.black);
		disegnoCerchio(g);
    }
    private void disegnoCerchio(Graphics2D gr) {
		// cerchio
		gr.fillOval(posizX - 30, posizY + 2, 12, 12);
		gr.setColor(Color.black);
		spostamento = -spostamento;
	}
}
