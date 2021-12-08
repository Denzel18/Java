public class Automobile
{
	private String targa;
	private int anno; 
	private String colore;
	private int cilindrata;
	private String carburante;
	private int nPosti;
	private String marca;
	private String modello;
	private int serbatoio;
	private boolean luci;
	private int codiceAUTO; 
	
	public Automobile(String targa,int anno,String colore,int cilindrata,String carburante,int nPosti,String marca,String modello)
	{
		this.setTarga(targa);
		this.setAnno(anno); 
		this.setColore(colore); 
		this.setCilindrata(cilindrata);
		this.setCarburante(carburante);
		this.setNPosti(nPosti);
		this.setMarca(marca);
		this.setModello(modello); 
		this.setSerbatoio(10); 
		this.setLuci(false) ; //false = OFF
	}
	public Automobile(Automobile a)
	{
		this.setTarga(a.getTarga());
		this.setAnno(a.getAnno()); 
		this.setColore(a.getColore()); 
		this.setCilindrata(a.getCilindrata());
		this.setCarburante(a.getCarburante());
		this.setNPosti(a.getNPosti());
		this.setMarca(a.getMarca());
		this.setModello(a.getModello()); 
		this.setSerbatoio(a.getSerbatoio()); 
		this.setLuci(a.getLuci()) ; //false = OFF
	}
	
	
	public void setCodiceAuto( int codice ){
		this.codiceAUTO = codice ;
	}
	public int getCodiceAuto(){
		return this.codiceAUTO; 
	}
	
	private void setTarga ( String targa){
		this.targa = targa; 
	}
	private void setAnno (int anno){
		this.anno = anno; 
	}
	
	private void setColore (String colore ){
		this.colore = colore; 
	}
	
	private void setCilindrata (int cilindrata ){
		this.cilindrata = cilindrata;  
	}
	
	private void setCarburante (String carburante ){
		this.carburante = carburante;  
	}
	
	private void setNPosti (int nPosti ){
		this.nPosti = nPosti;
	}
	
	private void setMarca (String marca ){
		this.marca = marca; 
	}
	
	private void setModello (String modello ){
		this.modello = modello;  
	}
	
	private void setSerbatoio (int l ){
		this.serbatoio = l ; //l = litri rimasti;  
	}
	private void setLuci (boolean luci ){
		this.luci = luci;  
	}
	
	// METODI GET 
	
	public String getTarga (){
		return this.targa; 
	}
	public int getAnno (){
		return this.anno; 
	}
	
	public String getColore ( ){
		return this.colore ; 
	}
	
	public int getCilindrata (){
		return this.cilindrata ;  
	}
	
	public String getCarburante (){
		return this.carburante;  
	}
	
	public int getNPosti (){
		return this.nPosti;
	}
	
	public String getMarca (){
		return this.marca; 
	}
	
	public String getModello (){
		return this.modello ;  
	}
	
	public int getSerbatoio (){
		return this.serbatoio;  
	}
	public boolean getLuci (){
		return this.luci;  
	}
	
	public String toString()
	{
		String s=""; 
		s+= "marca : "+ this.getMarca();
		s+= "targa : "+ this.getTarga();
		return s;
	}
	
	public boolean equals(Automobile b)
	{
		boolean check = false;
		if(this.getTarga()== b.getTarga())
			check = true;
		return check;			
	}	
	
	public String luci()
	{
		String s="";
		if(this.getLuci()== true)
			s= "luci accese";
		else	
			s="luci spente";
		return s;
		
	}	
	public String benzina()
	{
		String s="";
		if(this.getSerbatoio()<= 10)
			s= "benzina non c'e'";
		else	
			s="benzina c'e'";
		return s;
	}
		
	public void rifornimento(int q)
	{
		if((this.getSerbatoio()+q)>100)
			this.setSerbatoio(100);
		else
			this.setSerbatoio(this.getSerbatoio()+q);
		
	}	
		
}
