
public class Telecomando2{

	private String marca; 
	private String modello; 
	private String errore; 
	private Micronde m1;
	private Micronde m2;
	private Micronde m3; 
	
	public Telecomando2 (String marca, String modello, Micronde m1 , Micronde m2 , Micronde m3){
		this.setMarca(marca); 
		this.setModello(modello);
		this.setMicronde1(m1);
		this.setMicronde2(m2);
		this.setMicronde3(m3);
	}

	private void setMicronde1(Micronde m1){
		this.m1 = m1; 
	}
	private void setMicronde2(Micronde m2){
		this.m2 = m2; 
	}
	private void setMicronde3(Micronde m3){
		this.m3 = m3; 
	}

	public String getMicronde(){
		String s=""; 
		s= m1.toString() + " ; "+ m2.toString()+ " ; "+m3.toString()+"\n";
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
	public boolean equals( Telecomando2 t) {
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
		s+="errore :"+getErrore()+"\n";
		s+="micronde m1 : "+m1.toString()+"\n";
		s+="micronde m2 : "+m2.toString()+"\n";
		s+="micronde m3 : "+m3.toString()+"\n";
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
	public void accendiUno(){
		this.m1.On(); 
	}
	public void accendiTutti(){
		this.m1.On(); 
		this.m2.On(); 
		this.m3.On(); 
	}
	public void accendiDue(){
		this.m1.On(); 
		this.m2.On(); 
	}
	public void spegni(){
		this.m1.Off(); 
		this.m2.Off(); 
		this.m3.Off(); 
	}
}
