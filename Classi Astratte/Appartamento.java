public class Appartamento extends Abitazione
{
	private int piano ; 
	private boolean ascensore; 
	private int terazzi; 
	
	public Appartamento(String via, String citta, int nStanze, int superficie, int piano, int terazzi, boolean ascensore)
	{
			super(via, nStanze, citta, superficie); 
			this.piano = piano; 
			this.terazzi = terazzi; 
			this.ascensore = ascensore; 
	}

	public  String toString ()
	{
		String s = "";
		s+=via+" "+citta+" "+nStanze+" "+superficie+" "+piano+" "+terazzi+" "+ascensore; 
		return s; 
	} 
	
	public  String equals(Abitazione x)
	{
		String s="Sono uguali"; 
		if(this.via != x.via) //terazzi
			s="Sono diverse"; 
		return s;
	} 
}

