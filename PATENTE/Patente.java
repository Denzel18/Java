import java.io.*;
public class Patente implements java.io.Serializable{
	
	private String [] domande; 
	private String [] risposta1; 
	private String [] risposta2; 
	private String [] risposta3; 
	private String [] risposta4; 
	private String [] risposta5; 
	private String [] risposta6; 
	private String [] risposta7; 
	private String [] risposta8; 
	
	public Patente(){
		domande = new String[8];
		risposta1 = new String[3];
		risposta2 = new String[3];
		risposta3 = new String[3];
		risposta4 = new String[3];
		risposta5 = new String[3];
		risposta6 = new String[3];
		risposta7 = new String[3];
		risposta8 = new String[3];
		setDomande(0,"1) Nell'incrocio rappresentato nella figura il conducente del veicolo A deve dare la precedenza a:"); 
		setDomande(1,"2) La prescrizione del segnale raffigurato, se abbinato ad un semaforo, vale quando il semaforo funziona a luce gialla lampeggiante"); 
		setDomande(2,"3) Il segnale raffigurato e' posto in corrispondenza a:"); 
		setDomande(3,"4) Il segnale raffigurato preannuncia un incrocio in cui il conducente ha"); 
		setDomande(4,"5) Il segnale raffigurato preannuncia un tratto di strada con:"); 
		setDomande(5,"6) Il segnale raffigurato indica che si puo' scegliere"); 
		setDomande(6,"7) Il segnale raffigurato indica che si puo' scegliere"); 
		setDomande(7,"8) Il segnale raffigurato indica:");
		
		setRisposta1(0,"E e S");
		setRisposta1(1,"solo a S");
		setRisposta1(2,"puo' passare");
		
		setRisposta2(0,"No");
		setRisposta2(1,"Si");
		setRisposta2(2,"Vale con la luce rossa");
		
		setRisposta3(0,"Divieto di transito biciclette");
		setRisposta3(1,"Pista Ciclabile");
		setRisposta3(2,"Attraverso pedonale");
		
		setRisposta4(0,"Divieto di transito biciclette");
		setRisposta4(1,"Pista Ciclabile");
		setRisposta4(2,"Attraverso pedonale");
		
		setRisposta5(0,"Divieto di transito biciclette");
		setRisposta5(1,"Pista Ciclabile");
		setRisposta5(2,"Attraverso pedonale");
		
		setRisposta6(0,"Divieto di transito biciclette");
		setRisposta6(1,"Pista Ciclabile");
		setRisposta6(2,"Attraverso pedonale");
		
		setRisposta7(0,"Divieto di transito biciclette");
		setRisposta7(1,"Pista Ciclabile");
		setRisposta7(2,"Attraverso pedonale");
		
		setRisposta8(0,"Divieto di transito biciclette");
		setRisposta8(1,"Pista Ciclabile");
		setRisposta8(2,"Attraverso pedonale");
		 
	}
	
	
	public String getDomande(int pos){
		return domande[pos];
	}	
	public void setDomande(int pos, String dom){
		domande[pos] = dom; 
	}
	
	public String getRisposta1(int pos){
		return risposta1[pos];
	}	
	public void setRisposta1(int pos, String risp){
		risposta1[pos] = risp; 
	}
	
	public String getRisposta2(int pos){
		return risposta2[pos];
	}	
	public void setRisposta2(int pos, String risp){
		risposta2[pos] = risp; 
	}

	
	public String getRisposta3(int pos){
		return risposta3[pos];
	}	
	public void setRisposta3(int pos, String risp){
		risposta3[pos] = risp; 
	}
	
	public String getRisposta4(int pos){
		return risposta4[pos];
	}	
	public void setRisposta4(int pos, String risp){
		risposta4[pos] = risp; 
	}
	
	public String getRisposta5(int pos){
		return risposta5[pos];
	}	
	public void setRisposta5(int pos, String risp){
		risposta5[pos] = risp; 
	}
	
	public String getRisposta6(int pos){
		return risposta6[pos];
	}	
	public void setRisposta6(int pos, String risp){
		risposta6[pos] = risp; 
	}
	
	public String getRisposta7(int pos){
		return risposta7[pos];
	}	
	public void setRisposta7(int pos, String risp){
		risposta7[pos] = risp; 
	}
	
	public String getRisposta8(int pos){
		return risposta8[pos];
	}	
	public void setRisposta8(int pos, String risp){
		risposta8[pos] = risp; 
	}
	
	public void salvaPatente() throws java.io.IOException {
		FileOutputStream output = new FileOutputStream("patente.bin");
		ObjectOutputStream stream = new ObjectOutputStream(output);
		stream.writeObject(this);
		output.close();
		stream.close();
	}
	
	public Patente ricaricaPatente() throws java.io.IOException{
		Patente p = null; 
		FileInputStream input = new FileInputStream("patente.bin");
		ObjectInputStream stream = new ObjectInputStream(input);
		try {
			p = (Patente) stream.readObject();
		}catch(ClassNotFoundException exception) {
			System.out.println("errore  "+exception.getException());
		}
		input.close();
		stream.close();
		return p;
	}
	
	
	public static void main( String argv[]) throws IOException{
			Patente p = new Patente();
			System.out.println("risposte : "+p.getRisposta4(1));
			
				p.salvaPatente();
				Patente p2 = null; 
				p2 = p.ricaricaPatente();
				System.out.println(p2.getRisposta4(1));
			
	}
}
