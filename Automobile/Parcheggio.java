public class Parcheggio
{
	private final static int MAX_POSTI = 6;
	private Automobile park1 [] ;
	private String errore; 
	
	public Parcheggio()
	{
		park1 = new Automobile[MAX_POSTI]; 
	}
	
	
	public Parcheggio(Parcheggio p)
	{
		int i = 0;
		park1 = new Automobile[MAX_POSTI]; 
		for(i = 0; i< MAX_POSTI ; i++)
		{
			if (p.park1[i] == null)
			{
				this.setAutomobile(null,i); 
			}
			else
			{
				this.setAutomobile(p.getAutomobile(i), i); 
			}
				
		}
	
	}

	public Automobile getAutomobile(int i){
		Automobile a = null; 
		a = park1[i];
		return a;  
	}
	
	public void setAutomobile(Automobile a , int posto){
		park1[posto] = a;
	}
	
	public void esceAutomobile (Automobile a, int posto){
		if(a.getTarga() == park1[posto].getTarga())
			park1[posto] = null ; 
		else 
			System.out.println("macchine non corrispondente"); 
	}
	
	public int entraAutomobilev1(Automobile a){
		int i = 0;     
		for(i = 0; (i < MAX_POSTI); i++){
			if(park1[i] == null){
				park1[i] = a;
				return i;  
			}
		}	
		return -1;
	}
	public int entraAutomobilev2(Automobile a){
		int p = postoLibero();         
		park1[p] = a; 
		return p;
		
	}
	public int postoLibero(){
		int posto = 0; 
		for(int i = 0; i< MAX_POSTI ; i++)
			if(this.park1[i] == null){
				posto = i; 
				return posto;
			}
		return posto;  
	}
	public int postiLiberi(){
		int k = 0; 
		for(int i = 0; i< MAX_POSTI; i++) 
			if(park1[i] == null)
				k++;
		return k ; 
	}
	
	public String toString(){
		String s="";
		for(int i = 0; i< MAX_POSTI ; i++){
			s+="POSTO "+i;
			if(this.park1[i] != null)
				s+=" Targa :  "+this.park1[i].getTarga(); 
			s+="\n";
		}
		return s;
	}
	
	
	public void svuotaParcheggio(){
		for(int i = 0; i<MAX_POSTI ; i++){
			this.park1[i] = null; 
		}
	
	}
	
	
}
 
