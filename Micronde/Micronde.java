
public class Micronde
{
	
	//costanti 
	private int tMax;
	//attributi caratteristiche apparecchio
	private String marca;
	private String modello;
	//attributi stato apparecchio  
	private int potenza;
	private int tCottura;
	private boolean acceso;
	private String errore;
	// costruttore  
	public Micronde(String marca, String modello, int tMax){
		//costruttore che accetti in ingresso marca, modello e tempo di cottura massima 
		this.setMarca(marca);
		this.setModello(modello);
		this.setTMax(tMax);
		//valori di default, scegli tu 
		this.setPotenza(0);
		this.setTCottura(0);
		this.setAcceso(false);
		this.setErrore("");
     }
	//  setter/getter
	private void setTMax(int tMax){
		this.tMax = tMax; 
	}
	private void setAcceso(boolean acceso){
		this.acceso = acceso;
	}
	private void setPotenza(int potenza){	
		if(potenza >= 0 && potenza <6)
			this.potenza = potenza; 
		else if(potenza < 0) 
			this.potenza = 0;
		else 
			this.potenza = 5; 
	}
	private void setMarca(String marca){
		this.marca = marca; 
	}
	private void setModello(String modello){
		this.modello = modello; 
	}
	public void setTCottura(int tCottura){
		this.tCottura = tCottura; 
	}
	public String getTempo(){
		int minuti = this.getTCottura()/60;
		int secondi = this.getTCottura()%60;
		String s = "Minuti : "+minuti+" Secondi : "+secondi; 
		return s; 
	}

	private void setErrore(String errore){
		this.errore = errore; 
	}
	private int getTMax(){
		return this.tMax;
	}
	private String getMarca(){
		return this.marca;
	}
	private String getModello(){
		return this.modello;
	}
	private int getPotenzaInt(){
		return this.potenza;
	}
	private String getPotenza(){
		String s =""; 
		switch(getPotenzaInt()){
			case 0:
				s = "nessun livello impostato";
				break; 
			case 1: 
				s = "scongelamento";
				break;
			case 2: 
				s ="300W";
				break;
			case 3:
				s ="500W";
				break;
			case 4: 
				s = "650W"; 
				break; 
			case 5: 
				s = "JET";
				break; 
			default:
				s = "nessun livello impostato";
				break; 
		}
		return s; 
	}
	private int getTCottura(){
		return this.tCottura;
	}
	private String getErrore(){
		return this.errore;
	}
	public boolean getAcceso(){
		return acceso;
	}    
	public void varTempoV1(int secondi, boolean diminuisco){
		if(getAcceso())
			if(diminuisco == true ) //diminuisco
				if((getTCottura()-secondi)>0 && (getTCottura()-secondi)<this.tMax)
					this.setTCottura(getTCottura()-secondi);
				else 
					this.setErrore("errore tempo di cottura");
			else if(diminuisco == false)
				if((getTCottura()+secondi)>0 && (getTCottura()+secondi)<this.tMax)
					this.setTCottura(getTCottura()+secondi);
				else 
					this.setErrore("errore tempo di cottura");		
		else
			this.setErrore("micronde spento");
	}


	public void varTempoV2(boolean diminuisco){
		if(this.getAcceso() == true)
			if(diminuisco == true ) //diminuisco
				if((this.getTCottura()-30)>0 && (this.getTCottura()-30)<this.tMax)
					this.setTCottura(getTCottura()-30);
				else 
					this.setErrore("errore tempo di cottura");
			else if(diminuisco == false)
				if((this.getTCottura()+30)>0 && (this.getTCottura()+30)<this.tMax)
					this.setTCottura(getTCottura()+30);
				else 
					this.setErrore("errore tempo di cottura");
		else
			this.setErrore("micronde spento");		
	}

	public void Off()
	{
		if(this.getAcceso() == true ){
			this.setAcceso(false);
			this.setPotenza(0);
			this.setTCottura(0);
		}else{ 
			this.setErrore("micronde già spento");
		}
	}

	public void On(){
		if(this.getAcceso() == true)
			setErrore("micronde già acceso");
		else{
			this.setAcceso(true); 
			if(this.getPotenzaInt() == 0) 
				this.setPotenza(4); 
			if(this.getTCottura() == 0)
				this.setTCottura(30); 
		}
	}
	public String toString (){
		String s="\n";
		s+="marca : "+getMarca()+";";
		s+="modello : "+getModello()+";";
		s+="potenza : "+getPotenza()+";";
		s+="tempo cottura : "+getTCottura()+";";
		s+="errore :"+getErrore()+"";
		return s ;
	}
	public boolean equals(Micronde b){
		if(this.getPotenza() == b.getPotenza())
			if(this.getMarca() == b.getMarca())
				if(this.getTCottura() == b.getTCottura())
					if(this.getAcceso() == b.getAcceso())
						return true; 
					else
						return false; 
				else 
					return false; 
			else
				return false;
		else 
			return false; 
		
    }
}
