/*
 * Denis Bernovschi
 * Soluzione
 */ 

public class Lampadario
{
	private String marca; 
	private String modello; 
	private String errore; 
	private Lampadina l1;
	private Lampadina l2;
	private Lampadina l3; 
	
	public Lampadario (String marca, String modello, Lampadina l1 , Lampadina l2 , Lampadina l3){
		this.setMarca(marca); 
		this.setModello(modello);
		this.setLampadina1(l1);
		this.setLampadina2(l2);
		this.setLampadina3(l3);
	}
	
	public Lampadario (Lampadario l){
		this.setMarca(l.marca); 
		this.setModello(l.modello);
		this.setLampadina1(l.l1);
		this.setLampadina2(l.l2);
		this.setLampadina3(l.l3);
	}
	
	
	private void setLampadina1(Lampadina l1){
		this.l1 = l1; 
	}
	private void setLampadina2(Lampadina l2){
		this.l2 = l2; 
	}
	private void setLampadina3(Lampadina l3){
		this.l3 = l3; 
	}
	
	public String getLampadine(){
		String s=""; 
		s= l1.toString() + " ; "+ l2.toString()+ " ; "+l3.toString()+"\n";
		return s;
	}
	private void setMarca(String marca)
	{
		this.marca = marca; 
	}
	private void setModello(String modello)
	{
		this.modello = modello; 
	}
	private String getMarca()
	{
		return this.marca;
	}
	private String getModello()
	{
		return this.modello;
	}
	
	public boolean equals( Lampadario t) {
		boolean check = false; 
		if(this.getModello() == t.getModello())
			if(this.getMarca() == t.getMarca())
				check= true;
			else
				check= false;
		else 
			check= false;
		return check;
	}
	public String toString ()
	{
		String s="";
		s+="marca : "+getMarca()+";";
		s+="modello : "+getModello()+";";
		s+="errore :"+getErrore()+"\n";
		s+="lampadina l1 : "+l1.toString()+"\n";
		s+="lampadina l2 : "+l2.toString()+"\n";
		s+="lampadina l3 : "+l3.toString()+"\n";
		l1.setErrore("/");
		l2.setErrore("/");
		l3.setErrore("/");
		return s ;
		
	}
	private String getErrore()
	{
		return this.errore;
	}
	private void setErrore(String errore)
	{
		this.errore = errore; 
	}
	public void accendiUna(){
		this.l1.lightOn(); 
	}
	public void accendiTutti(){
		this.l1.lightOn(); 
		this.l2.lightOn(); 
		this.l3.lightOn(); 
	}
	public void accendiDue(){
		this.l1.lightOn(); 
		this.l2.lightOn(); 
	}
	public void spegni(){
		this.l1.lightOff(); 
		this.l2.lightOff(); 
		this.l3.lightOff(); 
	}
}
