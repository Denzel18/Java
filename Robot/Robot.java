
/**
 * Aggiungi qui una descrizione della classe Robot
 * 
 * @author Mirco Morazzini 4c/in 
 * 17/01/19
 */
public class Robot
{
	//il nome degli attributi deve essere uguale a quello riportato nel testo
	
	//attributi 
	private String marca;
    private String modello;
    private String colore;
	private boolean cottura;
    private int velocita;
    private int vMax;
    private int temperatura;
    private int tMax;
    private int tempo;
    private int sMax;
    public boolean acceso;
  
    
    
    public Robot(String marca, String modello, String colore, int velocitaMax, int temperaturaMax, int tempoMax)
    {
     this.setMarca(marca);
     this.setModello(modello);
     this.setColore(colore);
     
     /*
     //non 50, in quanto il tuo costruttore ha ricevuto in ingresso in valore utile che è velocitaMax   
     idem per setTemperaturaMax e per TempoMax 
     */
     this.vMax = velocitaMax; //non 50, in quanto il tuo costruttore ha ricevuto in ingresso in valore utile che è velocitaMax   
     this.tMax = temperaturaMax;
     this.sMax = tempoMax;
     /*
      * qui ha senso invece mettere dei valori di default
      */ 
     this.velocita = 0;
     this.temperatura = 0;
     this.tempo = 0;
     cottura= false; 
     acceso= false;      
    } 
    // METODI SET
    private void setMarca(String marca)
    {
        this.marca = marca; 
    }
    private void setModello(String modello)
    {
        this.modello = modello; 
    }
    private void setColore(String colore)
    {
        this.colore = colore; 
    }
    // METODI GET
    private String getMarca()
    {
        return this.marca;
    }
    private String getModello()
    {
        return this.modello;
    }
    private String getColore()
    {
        return this.colore;
    }
    /*
     * Gli altri set/get non erano richiesti in quanto la prof
     * ti ha detto espressamente nella consegna che voleva solo quei 3 (marca, modello,colore)
     * quindi tu, dovevi fare solo quei 3
     */
     
     
    /* Lei ti ha detto che i vari metodi hanno un nome specifico, ecco quindi che se 
     * il nome che ti da è On, tu devi creare il metodo con quel nome, e non 
     * accendi in quanto anche quello è considerato errore, in quanto non hai rispettato le specifiche.
     * So che può sembrarti una stronzata, ma quando su un codice ci lavorano più persone, se una sa 
     * che la funzione si chiama On, ma tu l'hai chiamata accendi(), rischi di complicare il suo lavoro 
    */
    
    
    //Metodi
    public void On() 
    {
        if(acceso==false)
        acceso = true;
    }
    
    /*
     * Ti dice che Off,spegne una robot acceso impostando 
     * velocità, temperatura e tempo al valore minimo.
     */
    public void Off()
    {
        if(acceso==true)
        {
            acceso = false;
            velocita = 0; 
            temperatura = 0; 
            tempo = 0; 
        }
    }
    /*
     * temperatura(+/-n): aumenta/diminuisce di n unità la temperatura di un robot acceso 
     * impedendo di uscire dai valori limite prefissati (0 – tMax).
     * Qui l'appunto da fare era chiedere se il valore di n, potevi sceglierlo arbitrariamente 
     * tu o se andava chiesto all'utente, l'implementazione è molto simile a quella in lampadina o microonde. 
     * Ed anche qui devi stare attento al nome del metodo !!!!!
     * boolean abbassa = true, abbasso la temperatura, false aumento 
	 * Ho supposto che il valore di n lo scelgo io arbitrariamente, in caso contrario avresti dovuto passarglielo alla funzione 
	 * quindi la firma del metodo sarebbe stata : public void temperatura(boolean abbassa, int n); 
	*/
   
	public void temperatura(boolean abbassa)   //aumenta
	{
		int n = 10; 
		if(acceso==true)
		{
			if(abbassa == true)
			{
				if(((this.temperatura-n) > 0 ) && ((this.temperatura-n) <this.tMax))
				{
					this.temperatura-=n;
				}
			}
			else
			{
				if(((this.temperatura+n) > 0 ) && ((this.temperatura+n) <this.tMax))
				{
					this.temperatura+=n;
				}
			}
		}   
	}    

	/*
	 * Lo stesso procedimento identico che abbiamo fatto per temperatura, lo facciamo anche per tempo
	 */
    public void tempo(boolean aumenta)
	{
		int n = 10; 
		if(acceso==true)
		{
			if(aumenta == true)
			{
				if(((this.tempo+n) > 0 ) && ((this.tempo+n) <this.sMax))
				{
					this.tempo+=n;
				}
			}
			else
			{
				if(((this.tempo-n) > 0 ) && ((this.tempo-n) <this.sMax))
				{
					this.tempo-=n;
				}
			}
		}   
	}  
	/*
	 * Lo stesso procedimento identico che abbiamo fatto per temperatura, lo facciamo anche per tempo
	 */
    public void velocita(boolean aumenta)
	{
		int n = 10; 
		if(acceso==true)
		{
			if(aumenta == true)
			{
				if(((this.velocita+n) > 0 ) && ((this.velocita+n) <this.vMax))
				{
					this.tempo+=n;
				}
			}
			else
			{
				if(((this.velocita-n) > 0 ) && ((this.velocita-n) <this.vMax))
				{
					this.tempo-=n;
				}
			}
		}   
	}    
    /*
     *  go: avvia il ciclo di cottura accendendo il relativo pulsante, solo se sono stati 
     * correttamente impostati velocità, tempo e temperatura, altrimenti 
     * restituisce un messaggio in cui è riportato quale o quali valori devono essere impostati.
     *  Quando ti dice correttamente impostati, vuole dire che devono essere nel range di valori 0-xMax
     */
    public String go()
    {
		String errore = ""; 
		cottura = false; 
		if((this.velocita > 0) && (this.velocita < this.vMax)){
			if((this.tempo > 0) && (this.tempo < this.tMax)){
				if((this.temperatura < 0) && (this.temperatura > this.tMax)){
					cottura = true; 
				}
				else
				{
					errore += " La temperatura e' fuori dal range "; 
				}
			}
			else 
			{
					errore += " Il tempo e' fuori dal range ";
			}
		}
		else
		{
			errore += " La velocita' e' fuori dal range ";
		}
		if(cottura == true) 
			return "la cottura è avviata";
		else
			return errore; 
     
    } 
    /*
     * end: termina il ciclo di cottura impostando velocità, temperatura e tempo al valore minimo.
     * se termina il ciclo di cottura è importante che cottura torni ad 
     * essere false, ma tu ti sei dimenticato l'istruzione
     */
    public void end()
    {
        if(cottura==true)
        {
               this.velocita=0;
               this.temperatura=0;
               this.tempo=0;
               //ti mancava questa riga 
               this.cottura = false;
        } 
    }  
    /* il check per come l'avevi progettato tu, bastava che una 
     * solo cosa era uguale è tornava true, in realtà 
     * sappiamo entrambi che non è cosi che funziona, vanno invece fatti 
     * if "incastrati tra loro, così al primo if che da false restitusco false 
     * in quanto non sono ugali, l'altra strada è quella di fare tutto 
     * in un if unendo con gli and tutte le condizioni, come abbiamo fatto per lampadina
     */
     
    public boolean equals(Robot b)
    {
	
		boolean check = false;
		if(this.getMarca()== b.getMarca())
			if(this.getModello()== b.getModello())
				if(this.getColore()== b.getColore())
					if(this.vMax== b.vMax)
						if(this.tMax== b.tMax)	 
							if(this.sMax== b.sMax)
								check = true; 
							else 
								return false;
						else 
							return false;
					else 
						return false;
				else 
					return false;
			else 
				return false;
		else 
			return false;
									        
		return check;			
		    
    }
    public String toString(){
        String robot="";
        robot += "Marca : "+this.getMarca()+";";
        robot += "Modello : "+this.getModello()+";";
        robot += "Colore : "+this.getColore()+";";
        robot += "Velocita' : "+this.velocita+";";
        robot += "Velocita' : "+this.vMax+";";
        robot += "Temperatura : "+this.temperatura+";";
        robot += "Temperatura : "+this.tMax+";";
        robot += "Tempo : "+this.tempo+";";
        robot += "Tempo : "+this.sMax+";";
        return robot;
    }
    
}
