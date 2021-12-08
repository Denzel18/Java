/* Questa classe definisce il prototipo di una formica, che e'
   un essere (con un nome) che si muove un passo alla volta in 
   modo casuale in una delle 4 direzioni: NORD, SUD, EST, OVEST. 
   Ad ogni passo consuma dell'energia. Se ha consumato tutta 
   l'energia a disposizione, muore e non si puo' piu' muovere.
   La formica puo' mangiare, in tal caso, incrementa l'energia.
*/


public class Formica {

    // definisco le variabili di istanza:
    private String nome; // il nome della formica.
    private int posX, posY; // le coordinate della posizione occupata 
                            // dalla formica
    private int energia = 200; // l'energia che possiede la formica
    private boolean inVita = true; // lo stato della formica
    private int passo = 5;  // lunghezza di un passo di una formica.

    // alcune costanti per stabilire il movimento della formica:
    private final static int NORD = 0, OVEST = 1, SUD = 2, EST = 3;

    // Costruttore 1:

    public Formica() {
	posX = 0;
	posY = 0;
	nome = "NN";
    }

    // Costruttore 2:
    public Formica(int pX, int pY, String nm) {
	posX = pX; 
	posY = pY; 
	nome = nm;
    }

    // la formica si muove in una di quattro direzioni: NORD, ... EST
    // e ad ogni passo consuma un po' di energia. Se l'energia e' 0, 
    // la formica muore.
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


    // se la formica mangia, incrementa la riserva di energia.
    // la formica puo' mangiare solo se e' viva.
    public void mangia(int cibo) {
	if (inVita)
	    energia += cibo;
    }

    // restituisce la quantita' di energia della formica.
    public int getEnergia() {
	return energia;
    }

    // assegna un nome alla formica:
    public void battezza(String nm) {
	nome = nm;
    }

    // restituisce il nome:
    public String dammiNome() {
	return nome;
    }

    // posizione x raggiunta: 
    public int posizioneX() {
	return posX;
    }

    // posizione y raggiunta: 
    public int posizioneY() {
	return posY;
    }

    // restituisce l'informazione se la formica e' viva 
    public boolean isAlive() {
	return inVita;
    }

    // assegna la lunghezza di un passo di una formica
    public void setPasso(int ps) {
	passo = ps;
    }


} // fine classe Formica
