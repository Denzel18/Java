public class Lavastoviglie {
	private boolean ledON_OFF ;
	private boolean ledMancanzaSale ;
	private boolean ledMancanzaDetersivo ;
	private boolean ledFineCiclo ;
	private boolean lavaggio_eco ;
	private boolean lavaggio_65 ;
	private boolean lavaggio_70 ;
	private boolean lavaggio_ammolo ;
	private String marca ;
	private int serbatoio ;
	private int serbatoioSale ;
	private String errore ;
	
	public Lavastoviglie ( String brand ){
		this.setMarca(brand);
		this.setLedON_OFF(false);
		this.setLedMancanzaSale(false);
		this.setLedMancanzaDetersivo(false);
		this.setLedFineCiclo(false);
		this.setLavaggioEco(false);
		this.setLavaggio65(false);
		this.setLavaggio70(false);
		this.setLavaggioAmmolo(false);
		this.setCapacitaSerbatoio(100);
		this.setCapacitaSerbatoioSale(100);
		
	}
	private void setMarca (String brand){
		this.marca = brand ;
	}
	private void setLedON_OFF(boolean check){
		this.ledON_OFF = check ;
	}
	private void setLedMancanzaSale(boolean check){
		this.ledMancanzaSale = check ;
	}
	private void setLedMancanzaDetersivo(boolean check){
		this.ledMancanzaDetersivo = check ;
	}
	private void setLedFineCiclo(boolean check){
		this.ledFineCiclo = check ;
	}
	private void setLavaggioEco(boolean check){
		this.lavaggio_eco = check ;
	}
	private void setLavaggio65(boolean check){
		this.lavaggio_65 = check ;
	}	
	private void setLavaggio70(boolean check){
		this.lavaggio_70 = check ;
	}
	private void setLavaggioAmmolo(boolean check){
		this.lavaggio_ammolo = check ;
	}
	private void setCapacitaSerbatoio(int capacita){
		this.serbatoio=capacita;
	}
	private void setCapacitaSerbatoioSale(int capacita){
		this.serbatoioSale=capacita;
	}
	private String getMarca () { 
		return this.marca ; 
	}
	private boolean getLedON_OFF() {
		return this.ledON_OFF;
	}
	private boolean getLedMancanzaSale(){
		return this.ledMancanzaSale;
	}
	private boolean getLedMancanzaDetersivo(){
		return this.ledMancanzaDetersivo;
	}
	private boolean getLedFineCiclo(){
		return this.ledFineCiclo;
	}
	private boolean getLavaggioEco (){
		return this.lavaggio_eco ;
	}
	private boolean getLavaggio65 (){
		return this.lavaggio_65 ;
	}
	private boolean getLavaggio70 (){
		return this.lavaggio_70 ;
	}
	private boolean getLavaggioAmmolo (){
		return this.lavaggio_ammolo ;
	}
	private int getCapacitaSerbatoio(){
		return this.serbatoio ;
	}
	private int getCapacitaSerbatoioSale(){
		return this.serbatoioSale ;
	}
	public String getErrore(){
		return this.errore;
	}
	public boolean selezionaLavaggioEco(){
		if(this.getCapacitaSerbatoio() > 10 && this.getCapacitaSerbatoioSale() > 10 ){
			this.setLavaggioEco(true);
			return true ;
		}
		else{
			setErrore("detersivo/sale insufficiente");
			return false ;
		}	
	}
	public boolean selezionaLavaggio65(){
		if(this.getCapacitaSerbatoio() > 10 && this.getCapacitaSerbatoioSale() > 10 ){
			this.setLavaggio65(true);
			return true ;
		}
		else{
			setErrore("detersivo/sale insufficiente");
			return false ;
		}	
	}
	public boolean selezionaLavaggio70(){
		if(this.getCapacitaSerbatoio() > 10 && this.getCapacitaSerbatoioSale() > 10 ){
			this.setLavaggio70(true);
			return true ;
		}
		else{
			setErrore("detersivo/sale insufficiente");
			return false ;
		}	
	}
	public boolean selezionaLavaggioAmmolo(){
		this.setLavaggioAmmolo(true);
		return true;
	}
	public void setErrore( String s){
		this.errore = s ;
	}	
	public boolean ricaricaSerbatoio(){
		if(this.getCapacitaSerbatoio() <= 0){
			setCapacitaSerbatoio(100);
			return true;
		}
		else{
			setErrore("serbatoio ancora pieno");
			return false;
		}
	}
	public boolean ricaricaSerbatoioSale(){
		if(this.getCapacitaSerbatoioSale() <= 0){
			setCapacitaSerbatoioSale(100);
			return true;
		}
		else{
			setErrore("serbatoio sale ancora pieno");
			return false;
		}
	}
	public boolean lavaggio(){
		if(this.getLedON_OFF() == true){
			if(getLavaggio65() == true || getLavaggio70() == true || getLavaggioEco() == true || getLavaggioAmmolo() == true){
				if(this.getCapacitaSerbatoio() >= 10 && this.getCapacitaSerbatoioSale() >= 10 ){
					this.setCapacitaSerbatoio(this.getCapacitaSerbatoio() - 10 );
					this.setCapacitaSerbatoioSale(this.getCapacitaSerbatoioSale() -10 );
					return true ;
				}
				else{
					setErrore("lavastoviglie senza deterisivo");
					return false;
				}
			}
			else{
				setErrore("nessun lavaggio selezionato");
				return false;
			}
	    }
		else{
			setErrore("lavastoviglie spenta\n");
			return false ;
		}
	}
	public void accendi(){
		this.setLedON_OFF(true);
		if(getCapacitaSerbatoioSale() <= 0)
			this.setLedMancanzaSale(true);
		if(getCapacitaSerbatoio() <= 0)
			this.setLedMancanzaDetersivo(true);
		this.setLedFineCiclo(false);
	}
	public void spegni(){
		this.setLedON_OFF(false);
		this.setLedMancanzaSale(false);
		this.setLedMancanzaDetersivo(false);
		this.setLedFineCiclo(false);
	}
	public void fineLavaggio(){
		this.setLedFineCiclo(true);
	}
	public String toString (){
		String s="";
		s+="marca : "+getMarca()+"\n";
		s+="detersivo : "+getCapacitaSerbatoio()+"\n";
		s+="sale : "+getCapacitaSerbatoioSale()+"\n";
		s+="ON-OFF : "+getLedON_OFF()+"\n";
		s+="led sale : "+getLedMancanzaSale()+"\n";
		s+="led detersivo : "+getLedMancanzaDetersivo()+"\n";
		s+="fine lavaggio : "+getLedFineCiclo()+"\n";
		return s ;
	}

}
