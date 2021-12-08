/*
  Questa classe definisce tre formiche (oggetti della classe Formica)
  che si muovono nel piano x,y. Se passano attraverso la retta di 
  equazione x = 7, mangiano 100 unita' di cibo. Si vuol vedere se 
  qualcuna delle formiche riesce a raggiungere il traguardo, che e'
  la retta di equazione x = 10 entro 200 passi.
*/

public class MarciaFormiche {

    public final static int LINEA_CIBO = 7;
    public final static int PASTO = 100;
    public final static int TRAGUARDO = 10;

    public static void main(String[] arg) {

	// definisco tre formiche:
	Formica f1 = new Formica();
	f1.battezza("Ada");

	Formica f2 = new Formica();
	f2.battezza("Carla");

	Formica f3 = new Formica();
	f3.battezza("Chiara");

	// muovo le formiche per 200 passi:
	for (int i = 0; i < 200; i++) {

	    f1.muoviUnPasso();
	    f2.muoviUnPasso();
	    f3.muoviUnPasso();

	    if (f1.posizioneX() == LINEA_CIBO) 
		f1.mangia(PASTO);

	    if (f2.posizioneX() == LINEA_CIBO) 
		f2.mangia(PASTO);

	    if (f3.posizioneX() == LINEA_CIBO) 
		f3.mangia(PASTO);
	}

	// stampo i risultati della marcia:
	System.out.println();

	if (f1.posizioneX() >= TRAGUARDO)
	    System.out.println(f1.dammiNome() + " ha raggiunto il traguardo");
	else 
	    System.out.println(f1.dammiNome() + " si e' fermata nel punto: "
			       + f1.posizioneX() + " " + f1.posizioneY());

	if (f2.posizioneX() >= TRAGUARDO)
	    System.out.println(f2.dammiNome() + " ha raggiunto il traguardo");
	else 
	    System.out.println(f2.dammiNome() + " si e' fermata nel punto: "
			       + f2.posizioneX() + " " + f2.posizioneY());

	if (f3.posizioneX() >= TRAGUARDO)
	    System.out.println(f3.dammiNome() + " ha raggiunto il traguardo");
	else 
	    System.out.println(f3.dammiNome() + " si e' fermata nel punto: "
			       + f3.posizioneX() + " " + f3.posizioneY());

	System.out.println();

    } // fine metodo main


} // fine classe MarciaFormiche
