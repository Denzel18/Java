public class Villa extends Abitazione
{
	private int nPiani ; 
	private int supGiardino; 
	private boolean piscina; 
	
	public Villa(String via, String citta, int nStanze, int superficie, int nPiani, int supGiardino, boolean piscina)
	{
			super(via, nStanze, citta, superficie); 
			this.nPiani = nPiani; 
			this.supGiardino = supGiardino; 
			this.piscina = piscina; 
	}

	public  String toString ()
	{
		String s = "";
		s+=via+" "+citta+" "+nStanze+" "+superficie+" "+nPiani+" "+supGiardino+" "+piscina; 
		return s; 
	} 
	
	public  String equals(Abitazione x)
	{
		String s="Sono uguali"; 
		if(this.via != x.via)
			s="Sono diverse"; 
		return s;
	} 
}
