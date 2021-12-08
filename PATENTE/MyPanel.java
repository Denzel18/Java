import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Component.*;
import java.io.*;


public class MyPanel extends JPanel implements ActionListener, java.io.Serializable
{
	Patente patente;
	private JTextField Nome;
    private JTextField Cognome;
    private JTextField Data;
    
    private JLabel testo;
    
    //domande 
    private JLabel [] domande; 
    
    //risposta1 
    private ButtonGroup  ri1; 
    private JRadioButton []r1;
     
    //domanda2
    private ButtonGroup  ri2; 
    private JRadioButton []r2;

    
    //domanda3
    private ButtonGroup  ri3; 
    private JRadioButton []r3;
    
    //domanda4
    private JCheckBox [] r4;
	
    //domanda5
    private ButtonGroup  ri5; 
    private JRadioButton []r5;
   
	//domanda6
	private ButtonGroup  ri6; 
    private JRadioButton []r6;
    
	//domanda7
	private ButtonGroup  ri7; 
    private JRadioButton []r7;
    
    //domanda8
	private JCheckBox [] r8;
    
    
    //immagini
    private JLabel [] img;
	private ImageIcon  [] immagini;
	
	

    
    private JButton conferma;
    private JButton cancella; 
    private JButton salva; 
	private JButton serializza; 
	private JButton deserializza; 
	private JButton letturaFile;
    //vuoti 
	private JLabel [] vuoti; 


    public MyPanel(Patente patente) 
    {

        
        //buttoni 
        conferma = new JButton ("CONFERMA");
        cancella = new JButton ("CANCELLA");
        salva = new JButton ("SALVA SU FILE");
        serializza = new JButton ("SALVA BIN");
        deserializza = new JButton ("RECUPERA BIN");
        letturaFile = new JButton ("LETTURA FILE");
        //---------------------------------
        
        //inizializzo tutti gli array, mancava come istruzione
        domande = new JLabel [8]; 
        r1 = new JRadioButton [3];
        r2 = new JRadioButton [3];
        r3 = new JRadioButton [3];
        r4 = new JCheckBox [3];
        r5 = new JRadioButton [3];
        r6 = new JRadioButton [3];
        r7 = new JRadioButton [3];
        r8 = new JCheckBox [3];
        vuoti = new JLabel[11];
        immagini = new ImageIcon [8];
        img = new JLabel [8];
        Nome = new JTextField ();
        Cognome = new JTextField();
        Data = new JTextField();
        testo = new JLabel ("QUIZ PATENTE B");

        
        //---------------------------------
        
		ri1 = new ButtonGroup();
		ri2 = new ButtonGroup();
		ri3 = new ButtonGroup();
		
		ri5 = new ButtonGroup();
		ri6 = new ButtonGroup();
		ri7 = new ButtonGroup();

		

        
        GridLayout layout=new GridLayout(11,5);
		setLayout (layout); 
        
        
        //domande
        for(int i = 0; i < 8 ; i++){
			domande[i] = new JLabel(patente.getDomande(i),SwingConstants.RIGHT); 
			domande[i].setHorizontalTextPosition(JLabel.LEADING);
		    domande[i].setVerticalTextPosition(JLabel.BOTTOM);
		}
		//risposte
		for(int i = 0; i < 3 ; i++){
			r1[i] = new JRadioButton (patente.getRisposta1(i)); 
		}
		for(int i = 0; i < 3 ; i++){
			r2[i] = new JRadioButton (patente.getRisposta2(i)); 
		}
		for(int i = 0; i < 3 ; i++){
			r3[i] = new JRadioButton (patente.getRisposta3(i)); 
		}
		for(int i = 0; i < 3 ; i++){
			r4[i] = new JCheckBox(patente.getRisposta4(i)); 
		}
		for(int i = 0; i < 3 ; i++){
			r5[i] = new JRadioButton (patente.getRisposta5(i));
		}
		for(int i = 0; i < 3 ; i++){
			r6[i] = new JRadioButton (patente.getRisposta6(i));
		}
		for(int i = 0; i < 3 ; i++){
			r7[i] = new JRadioButton (patente.getRisposta7(i));
		}
		for(int i = 0; i < 3 ; i++){
			r8[i] = new JCheckBox (patente.getRisposta8(i)); 
		}
		
		//vuoti 
		for(int i = 0; i < 11 ; i++){
			vuoti[i] = new JLabel (""); 
			vuoti[i].setForeground(Color.green);		
		}
		
		//immagini 
		for(int i = 0; i < 8 ; i++){
			String nome = String.valueOf(i+1)+".png"; 
			immagini[i] = new ImageIcon(nome); 
			img[i] = new JLabel();
			img[i].setIcon(immagini[i]);
		}
		
		this.add(cancella);
		this.add(Nome);
		this.add(Cognome);
		this.add(Data);
		this.add(vuoti[1]);
		
		this.add(vuoti[2]);
		this.add(vuoti[3]);
		this.add(testo);
		this.add(vuoti[4]);
		this.add(vuoti[5]);
		
		
		this.add(domande[0]);
		for(int i = 0  ; i < 3 ; i++) 
			this.add(r1[i]);  	
		this.add(img[0]);
		
		this.add(domande[1]);
		for(int i = 0  ; i < 3 ; i++) 
			this.add(r2[i]);  	
		this.add(img[1]);
				
		this.add(domande[2]);
		for(int i = 0  ; i < 3 ; i++) 
			this.add(r3[i]);  	
		this.add(img[2]);
			
		this.add(domande[3]);
		for(int i = 0  ; i < 3 ; i++) 
			this.add(r4[i]);  	
		this.add(img[3]);
		
		this.add(domande[4]);
		for(int i = 0  ; i < 3 ; i++) 
				this.add(r5[i]);  	
		this.add(img[4]);
		
		this.add(domande[5]);
		for(int i = 0  ; i < 3 ; i++) 
				this.add(r6[i]);  	
		this.add(img[5]);
		
		this.add(domande[6]);
		for(int i = 0  ; i < 3 ; i++) 
				this.add(r7[i]);  	
		this.add(img[6]);
		
		this.add(domande[7]);
		for(int i = 0  ; i < 3 ; i++) 
				this.add(r8[i]);  	
		this.add(img[7]);
		
		this.add(conferma);
		this.add(serializza);
		this.add(deserializza);
		this.add(salva);
		this.add(letturaFile);


		
		
	    for(int i = 0 ; i < 3 ; i++)
	    	ri1.add(r1[i]);  
		for(int i = 0 ; i < 3 ; i++)
			ri2.add(r2[i]);   	
		for(int i = 0 ; i < 3 ; i++)
			ri3.add(r3[i]);  	

		
	    for(int i = 0 ; i < 3 ; i++)
			ri5.add(r5[i]);  
		for(int i = 0 ; i < 3 ; i++)
			ri6.add(r6[i]);   	
		for(int i = 0 ; i < 3 ; i++)
			ri7.add(r7[i]);  	

		setSize(900,600);
		
		
		conferma.addActionListener(this);
        cancella.addActionListener(this);
        salva.addActionListener(this);
        serializza.addActionListener(this);
        deserializza.addActionListener(this);
        letturaFile.addActionListener(this);
        
        for(int i = 0 ; i < 3 ; i++)
			r1[i].addActionListener(this);  
		for(int i = 0 ; i < 3 ; i++)
			r2[i].addActionListener(this);  	
		for(int i = 0 ; i < 3 ; i++)
			r3[i].addActionListener(this);  	
		for(int i = 0 ; i < 3 ; i++)
			r4[i].addActionListener(this);  	
		for(int i = 0 ; i < 3 ; i++)
			r5[i].addActionListener(this);  	
		for(int i = 0 ; i < 3 ; i++)
			r6[i].addActionListener(this);  	
		for(int i = 0 ; i < 3 ; i++)
			r7[i].addActionListener(this);
		for(int i = 0 ; i < 3 ; i++)
			r8[i].addActionListener(this);  	  		
    } 
    

    public void actionPerformed(ActionEvent e)
    {
		if (e.getSource()== conferma){
			
			int punteggio = 0; 
			if(r1[0].isSelected())
				punteggio+=1;
			if(r2[1].isSelected())
				punteggio +=1; 
			if(r3[0].isSelected())
				punteggio +=1; 
			if(r4[0].isSelected() == true) 
				punteggio+=1;
			if(r4[2].isSelected() == true) 
				punteggio+=1;
				
			if(r5[1].isSelected())
				punteggio +=1; 
			if(r6[2].isSelected())
				punteggio +=1; 
			if(r7[0].isSelected())
				punteggio +=1; 
				
			if(r8[0].isSelected() == true) 
				punteggio+=1;
			if(r8[1].isSelected() == true) 
				punteggio+=1;
			
			if(punteggio >= 6 ) 
				JOptionPane.showMessageDialog(null, "Nome : "+Nome.getText()+"\n"+
													"Cognome :  "+Nome.getText()+"\n"+
													"Data : "+Data.getText()+"\n"+
													"Promosso \n");
			else 
				JOptionPane.showMessageDialog(null, "Nome : "+Nome.getText()+"\n"+
						"Cognome :  "+Nome.getText()+"\n"+
						"Data : "+Data.getText()+"\n"+
						"Bocciato \n");
		}
		
		if (e.getSource() == cancella){
			Nome.setText("");
			Cognome.setText("");
			Data.setText("");
			ri1.clearSelection(); 
			ri2.clearSelection(); 
			ri3.clearSelection();
			for(int i = 0; i<3 ; i++)
				r4[i].setSelected(false);
				
			ri5.clearSelection(); 
			ri6.clearSelection(); 
			ri7.clearSelection(); 
			for(int i = 0; i<3 ; i++)
				r8[i].setSelected(false); 
			
		}
		if(e.getSource() == salva){
			JOptionPane.showMessageDialog(null,"salva su file");
			try{
				this.salvaSuFile();
			}catch(IOException x){
				JOptionPane.showMessageDialog(null,"errore, salva su file");
			}
			
		}
		if(e.getSource() == serializza){
			JOptionPane.showMessageDialog(null,"salva su file binario");
			try{
				this.salvaQuiz();
			}catch(IOException x){
				JOptionPane.showMessageDialog(null,"errore, salva su file");
			}
		}
		if(e.getSource() == deserializza){
			JOptionPane.showMessageDialog(null,"recupera da file binario");
			try{
				MyPanel pNew = this.ricaricaQuiz(); 
				riscrivi(pNew);
			}catch(IOException x){
				JOptionPane.showMessageDialog(null,"errore, salva su file");
			}
			
		}
		if(e.getSource() == letturaFile){
			JOptionPane.showMessageDialog(null,"lettura da file");
			try{
				letturaDaFile();
			}catch(IOException x){
				JOptionPane.showMessageDialog(null,"errore, lettura da file");
			}
			
		}
    }
    
    public void salvaQuiz() throws java.io.IOException {
		FileOutputStream output = new FileOutputStream("quiz.bin");
		ObjectOutputStream stream = new ObjectOutputStream(output);
		stream.writeObject(this);
		output.close();
		stream.close();
	}	
	public MyPanel ricaricaQuiz() throws java.io.IOException{
		MyPanel quiz = null; 
		FileInputStream input = new FileInputStream("quiz.bin");
		ObjectInputStream stream = new ObjectInputStream(input);
		try {
			quiz = (MyPanel) stream.readObject();
		}catch(ClassNotFoundException exception) {
			System.out.println("errore  "+exception.getException());
		}
		input.close();
		stream.close();
		return quiz;
	}
	public void riscrivi(MyPanel p){
			
			this.Nome.setText(p.Nome.getText());
			this.Cognome.setText(p.Cognome.getText());
			this.Data.setText(p.Data.getText());

		
			for(int i = 0 ; i< 8 ; i++){
				domande[i].setText(p.domande[i].getText());
			}
			for(int i = 0 ; i < 3 ; i++)
				if(p.r1[i].isSelected())
					this.r1[i].setSelected(true);
			for(int i = 0 ; i < 3 ; i++)
				if(p.r2[i].isSelected())
					this.r2[i].setSelected(true);
			for(int i = 0 ; i < 3 ; i++)
				if(p.r3[i].isSelected())
					this.r3[i].setSelected(true);
			for(int i = 0 ; i < 3 ; i++)
				if(p.r4[i].isSelected() == true)
					this.r4[i].setSelected(true);
			for(int i = 0 ; i < 3 ; i++)
				if(p.r5[i].isSelected())
					this.r5[i].setSelected(true);
			for(int i = 0 ; i < 3 ; i++)
				if(p.r6[i].isSelected())
					this.r6[i].setSelected(true);
			for(int i = 0 ; i < 3 ; i++)
				if(p.r7[i].isSelected())
					this.r7[i].setSelected(true);
			for(int i = 0 ; i < 3 ; i++)
				if(p.r8[i].isSelected() == true)
					this.r8[i].setSelected(true);
			
	}
	public void salvaSuFile() throws java.io.IOException {
		String contenutoFile =""; 
		contenutoFile +=Nome.getText()+";"+Cognome.getText()+";"+Data.getText()+";";
	
		for(int i = 0 ; i< 8 ; i++){
			contenutoFile += domande[i].getText()+";";
		}

		
		String risp1 ="";
		for(int i = 0 ; i < 3 ; i++)
			if(r1[i].isSelected())
				risp1 = r1[i].getText()+";";
		//----------------------------//
		String risp2 ="";
		for(int i = 0 ; i < 3 ; i++)
			if(r2[i].isSelected())
				risp2 = r2[i].getText()+";";
		//----------------------------//
		String risp3 ="";
		for(int i = 0 ; i < 3 ; i++)
			if(r3[i].isSelected())
				risp3 = r3[i].getText()+";";
		//----------------------------//	
		String risp4 ="";
		for(int i = 0 ; i < 3 ; i++)
			if(r4[i].isSelected() == true)
				risp4 += r4[i].getText() + ";";
		//----------------------------//
		String risp5 ="";
		for(int i = 0 ; i < 3 ; i++)
			if(r5[i].isSelected())
				risp5 = r5[i].getText()+";";
		//----------------------------//
		String risp6 ="";
		for(int i = 0 ; i < 3 ; i++) 
			if(r6[i].isSelected())
				risp6 = r6[i].getText()+";";
		//----------------------------//	
		String risp7 ="";
		for(int i = 0 ; i < 3 ; i++) 
			if(r7[i].isSelected())
				risp7 = r7[i].getText()+";";
		//----------------------------//
		String risp8 ="";
		for(int i = 0 ; i < 3 ; i++) 
			if(r8[i].isSelected() == true)
				risp8 += r8[i].getText() + ";";
		
		contenutoFile += risp1+risp2 +risp3+risp4+risp5+risp6+risp7+risp8; 	
		try {
		  File file = new File("quiz.txt");
		  FileWriter fw = new FileWriter(file);
		  fw.write(contenutoFile);
		  fw.flush();
		  fw.close();
		}catch(IOException e){ 
		      System.out.println("Errore salvataggio su file\n");
		}
	}
	public MyPanel letturaDaFile() throws java.io.IOException {
		Patente patente = new Patente();
		MyPanel p = new MyPanel(patente);
		
		
		int numeroDomande = 8;
		int numeroRisposte = 8; 
		int numeroRispostePossibili = 3; 
		
		//contatori
		int j = 0, i = 0; 
		
		String[] componenti = null;
		int numeroComponenti = 0 ; 
	    String path = "quiz.txt";
	    char[] in  = new char [100000];
	    String linea="";
	    int size = 0;
	    try {
	      File file = new File(path);
	      FileReader fr = new FileReader(file);
	      BufferedReader br = new BufferedReader(fr);
	      size = br.read(in);
	      for(i=0; i<size; i++){
	      	linea+=in[i];
	      }
	      br.close();
	      componenti = linea.split(";");
	      numeroComponenti = componenti.length;
	    }
	    catch(IOException e) { 
	      e.printStackTrace();
	    }
	    p.Nome.setText(componenti[0]);
	    p.Cognome.setText(componenti[1]);
	    p.Data.setText(componenti[2]);
	    
	    
		//DOMANDE 
	    for(i=3 ; i < (numeroDomande+3) && i < numeroComponenti ; i++){
			p.domande[j].setText(componenti[i]);
			j++;
		}
		
		for(j=0 ; j < numeroRispostePossibili ; j++){
			String risposte = (String) r1[j].getText();
			String rispostaData = (String) componenti[11];
			if(rispostaData.equals(risposte)){
				r1[j].setSelected(true);
			}
		}
		
		
		for(j=0 ; j < numeroRispostePossibili ; j++){
			String risposte = (String) r2[j].getText();
			String rispostaData = (String) componenti[12];
			if(rispostaData.equals(risposte)){
				r2[j].setSelected(true);
			}
		
		}
		
		
		for(j=0 ; j < numeroRispostePossibili ; j++){
			String risposte = (String) r3[j].getText();
			String rispostaData = (String) componenti[13];
			if(rispostaData.equals(risposte)){
				r3[j].setSelected(true);
			}
		
		}
		
		
		for(j=0 ; j < numeroRispostePossibili ; j++){
			String risposte = (String) r4[j].getText();
			String rispostaData = (String) componenti[14];
			if(rispostaData.equals(risposte)){
				r4[j].setSelected(true);
			}
		
		}
		
		
		for(j=0 ; j < numeroRispostePossibili ; j++){
			String risposte = (String) r5[j].getText();
			String rispostaData = (String) componenti[15];
			if(rispostaData.equals(risposte)){
				r5[j].setSelected(true);
			}
		
		}
		
		
		for(j=0 ; j < numeroRispostePossibili ; j++){
			String risposte = (String) r6[j].getText();
			String rispostaData = (String) componenti[16];
			if(rispostaData.equals(risposte)){
				r6[j].setSelected(true);
			}
		
		}
		
		
		for(j=0 ; j < numeroRispostePossibili ; j++){
			String risposte = (String) r7[j].getText();
			String rispostaData = (String) componenti[17];
			if(rispostaData.equals(risposte)){
				r7[j].setSelected(true);
			}
		
		}
		
		
		for(j=0 ; j < numeroRispostePossibili ; j++){
			String risposte = (String) r8[j].getText();
			String rispostaData = (String) componenti[18];
			System.out.println("risposta selezionata : "+ risposte + " - "+ rispostaData);
			if(rispostaData.equals(risposte)){
				r8[j].setSelected(true);
			}
		
		}
				
	    this.riscrivi(p);
		return p;
	}
	
	
}

