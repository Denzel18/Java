
public class Telecomando{

	private String marca; 
	private String modello; 
	private String errore; 
	
	public Telecomando (String marca, String modello){
		this.setMarca(marca); 
		this.setModello(modello);
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
	public boolean equals( Telecomando t) {
		if(this.getModello() == t.getModello())
			if(this.getMarca() == t.getMarca())
				return true;
			else
				return false;
		else 
			return false;
	}
	public String toString ()
	{
		String s="";
		s+="marca : "+getMarca()+";";
		s+="modello : "+getModello()+";";
		s+="errore :"+getErrore();
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
	public String accendiUno(Micronde m){
		String s="";
		m.On(); 
		s= m.toString() + "\n";
		return s;
	}
	public String accendiTutti(Micronde m,Micronde m2,Micronde m3){
		String s="";
		m.On(); 
		m2.On(); 
		m3.On(); 
		s= m.toString() + " ; "+ m2.toString()+ " ; "+m3.toString()+"\n";
		return s;
	}
	public String accendiDue(Micronde m,Micronde m2){
		String s="";
		m.On(); 
		m2.On(); 
		s= m.toString() + " ; "+ m2.toString()+ "\n";
		return s; 

	}
	public String spegni(Micronde m,Micronde m2,Micronde m3){
		String s="";
		m.Off(); 
		m2.Off(); 
		m3.Off(); 
		s= m.toString() + " ; "+ m2.toString()+ " ; "+m3.toString()+" ;\n";
		return s;
	}
}
