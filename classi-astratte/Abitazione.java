abstract public class Abitazione {
		
	protected String via; 
	protected int nStanze; 
	protected String citta; 
	protected int superficie; 
	
	public Abitazione (String via, int nStanze, String citta, int superficie)
	{
		this.via = via; 
		this.nStanze = nStanze;
		this.citta = citta; 
		this.superficie = superficie;
	}
	
	public abstract String toString () ; 
	
	public abstract String equals( Abitazione x); 
	
}
