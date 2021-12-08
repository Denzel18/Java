public class Test {
	public static void main(String[] args) {
		/* PASSO 0 */
		Stampante hp = new Stampante(10,15); // cassetto 10 fogli, inchiostro 15 fogli
						System.out.println("*** SUPERATO IL METODO COSTRUTTORE : VOTO MAX 2.5  ");
						
						/* PASSO 1 */
						System.out.println(hp);
						System.out.println("*** STAMPANTE NUOVA-NUOVA : VOTO MAX 3  ");
						
						/* PASSO 2 */
						hp.premiTastoAccensione();
						System.out.println(hp);
						System.out.println("*** ACCENSIONE STAMPANTE : VOTO MAX 3.5  ");
						
						/* PASSO 3 */
						hp.caricaCartuccia();
						hp.caricaCarta(50);
						System.out.println(hp);
						System.out.println("*** CARICAMENTO CARTA E INCHIOSTRO : VOTO MAX 4  ");
						
						
						/* PASSO 4 */
						hp.premiTastoAccensione();
						System.out.println(hp);
						hp.premiTastoAccensione();
						System.out.println(hp);
						System.out.println("*** SPEGNIMENTO e RIACCENSIONE : VOTO MAX 4.5  ");
						
						
						/* PASSO 5 */
						hp.stampaFoglio();
						System.out.println(hp);
						System.out.println("*** STAMPA FOGLIO : VOTO MAX 5  ");
						
						
						
						/* PASSO 6 */
						for (int i=0; i <50; i++){
							hp.stampaFoglio();
							System.out.println(hp);
						}
						System.out.println("*** STAMPA PIU' FOGLI DI QUANTI CE NE SONO : VOTO MAX 5.5  ");
						
						
						/* PASSO 7 */
						hp.caricaCarta(10);
						System.out.println(hp);
						for (int i=0; i <10; i++){
							hp.stampaFoglio();
							System.out.println(hp);
						}
						System.out.println("*** STAMPA PIU' FOGLI SINO A QUANDO L'INCHIOSTRO FINISCE : VOTO MAX 6  ");
						
						/* PASSO 8 */
						//INTRODURRE OPPORTUNE VERIFICHE PER DIMOSTRARE CHE LA STAMPANTE QUANDO E' SPENTA
						//NON FA NULLA

						hp.premiTastoAccensione();
						System.out.println("*** LA STAMPANTE SPENTA NON FA NULLA : VOTO MAX 6.5");
						System.out.println(hp);
						System.out.println("prova stampa fogli con stampante spenta \n");
						hp.stampaFoglio();
						System.out.println(hp);
						hp.caricaCarta(5);
						hp.caricaCartuccia();
						System.out.println(hp);

	}
}
