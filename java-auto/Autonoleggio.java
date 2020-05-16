import java.lang.reflect.Array;
import java.util.Arrays;
public class Autonoleggio
{
	private final static int MAX = 1000;
	private Automobile autonoleggio  [] ;
	private String errore; 
	
	
	//x codice 
	private int codiceVecchio ; 
	
	public Autonoleggio()
	{
		autonoleggio = new Automobile[MAX];
		codiceVecchio = 0; 
	}
	
	
	public Autonoleggio(Autonoleggio p)
	{
		int i = 0;
		autonoleggio = new Automobile[MAX]; 
		for(i = 0; i< MAX ; i++)
		{
			if (p.autonoleggio[i] == null)
			{
				this.setAutomobile(null,i); 
			}
			else
			{
				this.setAutomobile(p.getAutomobile(i), i); 
			}
				
		}
		this.codiceVecchio = p.codiceVecchio ;  
	
	}

	public Automobile getAutomobile(int i){
		Automobile a = null; 
		a = autonoleggio[i];
		return a;  
	}
	
	public void setAutomobile(Automobile a , int posto){
		autonoleggio[posto] = a;
	}
	
	public void eliminazioneAutomobile (String targa)
	{
		for(int i = 0; i < MAX && targa != autonoleggio[i].getTarga() ; i++)
		{
			if(targa == autonoleggio[i].getTarga())
				autonoleggio[i] = null ; 
		}
	}
	
	public void aggiuntaAutomobile(Automobile a){ 
		int i = 0;     
		for(i = 0; i < MAX; i++){
			
			if(autonoleggio[i] == null){
				autonoleggio[i] = a;
				//codice 
				codiceVecchio += 1;
				autonoleggio[i].setCodiceAuto(codiceVecchio); 
			}
		}	
	}
	public String ricercaAutomobile (String targa)
	{
		String s = ""; 
		for(int i = 0; i < MAX && targa != autonoleggio[i].getTarga() ; i++)
		{
			if(targa == this.autonoleggio[i].getTarga())
				s+="AUTOMOBILE : "+autonoleggio[i].toString(); 
		}
		return s; 
	}
	public String ricercaAutomobilePosti (int posti)
	{
		String s = ""; 
		for(int i = 0; i < MAX ; i++)
		{
			if(this.autonoleggio[i].getNPosti() == posti)
				s+=" VEICOLO TARGATO : "+autonoleggio[i].getTarga()+"   IN POSTO : "+i+"\n"; 
		}
		return s; 
	}
	
	
	public int postiLiberi()
	{
		int k = 0; 
		for(int i = 0; i< MAX; i++) 
			if(autonoleggio[i] == null)
				k++;
		return k ; 
	}
	
	public String toString()
	{
		String s="";
		for(int i = 0; i< MAX ; i++)
		{
			s+="POSTO "+i;
			if(this.autonoleggio[i] != null)
				s+=" Targa :  "+this.autonoleggio[i].toString(); 
			s+="\n";
		}
		return s;
	}
	
	public  void  getByMarche()
	{
		String [] marche = { "Mercedes", "OPEL", "Audi", "Fiat", "Mazda", "Citroen", "BMW"}; 
		int volumi [] = { 0,0,0,0,0,0,0}; 
		int nAuto = 0 ; 
		
		for(int i = 0 ; i < 7 ; i++){
			for(int j = 0 ; j < MAX ; j++)
			{
				if(marche[i] == autonoleggio[i].getMarca())
				{
					nAuto++;
				}
			}
			volumi[i] = nAuto;
			nAuto = 0; 
		}		
		for(int i = 0 ; i < 7 ; i++){
			System.out.println("MARCA : "+marche[i] + " nAUTO : "+volumi[i]+"\n");
		}
	}
	
	
	public void svuotaParcheggio(){
		for(int i = 0; i<MAX ; i++){
			this.autonoleggio[i] = null; 
		}
	
	}
	
	
}
 
