public class Lampadina
{
    private int colore;
    private int Lmax;
    private int luminosita;
    private boolean acceso;
    private String errore;
  
    
    public Lampadina(int colore,int Lmax)
    {
       this.setColore(colore);
       this.setLMax(Lmax);
       
       //per me false è spenta , viceversa true è on 
       this.acceso=false;
       
       this.setErrore("/");
    }
    
    public Lampadina(Lampadina lamp)
    {
       setColore(lamp.colore);
       this.Lmax=lamp.Lmax;
       this.acceso=lamp.acceso;
       setErrore(lamp.errore);
    }

    public void setColore(int colore)
    {
        if(colore<=1)       
            this.colore=1;
        else if(colore>=4)
            this.colore=4;
        else                
            this.colore=colore;
            
    }
    public void setErrore (String errore){
		this.errore = errore; 
	}
    public void setLMax(int Lmax)
    {
		this.Lmax = Lmax; 
	}
	public int getColore()
	{
		return this.colore; 
	}
    public String getColoreS() 
    {
        if(this.getColore() ==1)
            return "bianco";
        else if(this.getColore() == 2 )
            return "rosso";
        else if(this.getColore() == 3)
            return "blu";
        return "giallo";
    }
    
    public int getLuminosita() 
    {                          
        if(isAcceso()==true)
            return luminosita;
        else{
			setErrore("lampadina spenta\n");
			return -1;
		}
    }
    /* TI MANCAVA ANCHE QUESTO*/
    private int getLum(){
		return this.luminosita;
	}
    private void setLum(int luminosita){
		this.luminosita=luminosita;
	}
    /* * * * * * * */
    
    private int getLmax()
    {
        return Lmax;
    }
    private String getErrore(){
		return this.errore; 
	}
    
    public boolean isAcceso()
    {
        return acceso;
    }
     
    public void lightOn()
    {
        if(isAcceso()==false)
        {
            acceso=true;
            luminosita=0;
        }else{
			setErrore("La lampadina è gia' accesa"); 
		}
    }
    
    public void lightOff()
    {
        if(isAcceso()==true)
        {
            acceso=false;
        }else{
			setErrore("La lampadina è gia' spenta"); 	
		}
    }
    
    public String toString() 
    {
        String var;
        var="Acceso: " + isAcceso() + "; Colore: " + getColore();
        if(isAcceso()==true)
            var=var + "; Luminosita: " + getLuminosita() + "; Luminosita massima: " + Lmax;
        else
            var=var + "; Luminosita massima: " + Lmax;
        var = var + " ; Errore:  "+getErrore();
        return var+"\n";
    }
    
    public boolean equals(Lampadina lamp)
    {
		boolean check = false; 
		if((getColore()==lamp.getColore())&&(getLmax()==lamp.getLmax()))
			check =  true;
		return check;
    }
    
    /*
     * 
     * cose che ti mancano
     * - get/set errore 
     * - errore nel toString 
     * - varLum 
     */ 
     public void varLum(boolean aumenta){
		int n = 10; 
		if(aumenta == true)
			if((this.getLum()+n)>0 && (this.getLum()+n)<Lmax)
				this.setLum(this.getLum()+n);
			else 
				setErrore("La luminosità non è compresa nel range");
		else 
			if(this.getLum()-n>0 && this.getLum()-n<Lmax)
				this.setLum(this.getLum()-n);
			else
				setErrore("La luminosità non è compresa nel range");		
	 } 
     
	public void varLum(boolean aumenta, int n){
		if(aumenta == true)
			if((this.getLum()+n>0) && (this.getLum()+n)<Lmax)
				this.setLum(this.getLum()+n);
			else 
				setErrore("La luminosità non è compresa nel range");
		else 
			if((this.getLum()-n>0) && (this.getLum())-n<Lmax)
				this.setLum(this.getLum()-n);
			else
				setErrore("La luminosità non è compresa nel range");		
	 } 
     
    
}
