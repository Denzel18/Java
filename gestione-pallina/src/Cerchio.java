/*
 denis bernovschi 
 class cerchio
 */

public class Cerchio {
	private String oggetto ;
	private int raggio = 100 ;
	private int energia = 200 ;
	private int posizX , posizY ;
	private int sposta = 1;
	private int passo = 5;
	private boolean inVita = true ;
	
    // alcune costanti per stabilire il movimento della formica:
    private final static int NORD = 0, OVEST = 1, SUD = 2, EST = 3;
	
	public Cerchio (){
		posX = 0;
		posY = 0;
		nome = "NN";
	}

	
	public void disegna ( Graphics gg) {
		Graphics2D g =(Graphics2D)gg;
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
		RenderingHints.VALUE_ANTIALIAS_ON);
		posizX = super.posizioneX();
		posizY = super.posizioneY();
		if (super.isAlive())
			g.setColor(Color.red);
		else
			g.setColor(Color.black);
		disegna_cerchio(g);
		
	}
	
	private void disegna_cerchio(Graphics2D gr){
		gr.fillOval(50 , 50 , 50 ,50 );
		gr.setColor(Color.green);
	}
    
	public void muoviUnPasso() {
        if (!inVita) 
    	    return;
        
    	int direzione = (int)(Math.random()*4);  // scelgo una direzione
    											// casuale.
    	// la formica si sposta nella direzione scelta:
    	if (direzione == NORD)
    		posY += passo;
    	else if (direzione == SUD)
    		posY -= passo;
    	if (direzione == EST)
    		posX += passo;
    	if (direzione == OVEST)
    		posX -= passo;
    	energia--;
    }
    public int posizioneX() {
    	return posX;
    } 
    public int posizioneY() {
    	return posY;
    }
    public boolean isAlive() {
    	return inVita;
    }
    public void setPasso(int ps) {
    	passo = ps;
    }
    public void mangia(int cibo) {
    	if (inVita)
    		energia += cibo;
    }
    public int getEnergia() {
    	return energia;
    }
    public void battezza(String nm) {
    	nome = nm;
    }
    public String dammiNome() {
    	return nome;
    }
}
