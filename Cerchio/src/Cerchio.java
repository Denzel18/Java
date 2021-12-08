/*
 denis bernovschi 
 class cerchio
 */

public class Cerchio {
	private String oggetto ;
	private int raggio = 100 ;
	private int energia = 50 ;
	private int posX , posY ;
	private int sposta = 1;
	private int passo = 5;
	private boolean inVita = true ;
	
    // alcune costanti per stabilire il movimento della formica:
    private final static int NORD = 0, OVEST = 1, SUD = 2, EST = 3;
	
	public Cerchio (){
		posX = 0;
		posY = 0;
		oggetto = "NN";
	}
	
	public Cerchio(int pX , int pY , String nm){
		posX = pX; 
		posY = pY; 
		oggetto = nm;
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
    	if (energia <= 0)
    	    inVita = false;
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
    public void assumiEnergia(int cibo) {
    	if (inVita)
    		energia += cibo;
    }
    public int getEnergia() {
    	return energia;
    }
    public void assegnaNomeOggetto(String nm) {
    	oggetto = nm;
    }
    public String dammiNomeOggetto() {
    	return oggetto;
    }
}
