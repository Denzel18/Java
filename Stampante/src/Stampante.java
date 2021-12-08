public class Stampante {
	/*attributi*/
	private int capacitaFogli;
	private int capacitaInchiostro ; 
	private int fogli ; 
	private int inchiostro ;
	private boolean stato ;
	//metodo costruttore
	public Stampante ( int fogli , int inchiostro ){
		   	this.setCapacitaFogli(fogli);
			this.setCapacitaInchiostro(inchiostro);	
			this.setStato(false);		
	}
	//metodi set 
	//capacita stampante
	private void setCapacitaFogli(int n){
		this.capacitaFogli = n ; 
	}
	private void setCapacitaInchiostro(int inc){
		this.capacitaInchiostro  = inc ; 
	}
	//ricarica fogli 
	public void caricaCarta(int z){
		if(z<=getCapacitaFogli()) 
			this.fogli = z ;
		else
			this.fogli = getCapacitaFogli(); 
	}
	//ricarica inchiostro 
	public void caricaCartuccia (){
		this.inchiostro=getCapacitaInchiostro();
	}
 	private void setStato ( boolean stato ){
		this.stato = stato ; 
	}
	//metodi get 
	private int getCapacitaFogli (){
		return this.capacitaFogli;
	}
	private int getCapacitaInchiostro (){
		return this.capacitaInchiostro;
	}
	private int getFogli (){
		return this.fogli ;
	}
	private int getInchiostro (){
		return this.inchiostro ;
	}
	private boolean getStato (){
		return this.stato ; 
	}
	private boolean getLedStatoFogli (){
	 	boolean ledFogli= false ;
		if ((this.getStato() == true) &&(this.getFogli() <= 0) )
			ledFogli = true ; 
		return ledFogli ; 
	}
	private boolean getLedStatoInchiostro (){
		boolean ledInchiostro = false ;
		if ((this.getStato() == true) && (this.getInchiostro() <= 0))
			ledInchiostro = true ;
		return ledInchiostro ; 
	}
	/*gestione stampante*/
	private void setInchiostro (int x ){
		this.inchiostro = x ; 
	}
	private void setFogli (int y ){
		this.fogli = y ;
	}
	public void premiTastoAccensione(){
		this.setStato(!this.getStato());
	}
	public void stampaFoglio(){
		if((this.getFogli() > 0 ) && (this.getInchiostro() > 0) && (this.getStato() == true)){
			this.setFogli(this.getFogli() -1 );
			this.setInchiostro(this.getInchiostro() -1 );
		}
	}
	
	/*metodo toString*/
	public String toString (){
		String s=""; 
		if(this.getStato()== false ){
			s+= "la stampante è spenta\n" ; 
			return s ; 
		}
		else{
			s+="fogli : "+String.valueOf(this.getFogli())+"  ";
			s+="inchiostro : "+String.valueOf(this.getInchiostro())+"  ";
			if(getLedStatoInchiostro()== true)
				s+="  *inchiostro* ";
			if (getLedStatoFogli() == true)
				s+="   *fogli*  "; 
		}
		return s ;
	}
}
