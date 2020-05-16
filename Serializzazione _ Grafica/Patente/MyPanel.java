package Patente;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.awt.Component.*;


public class MyPanel extends JPanel implements ActionListener 
{
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
	ImageIcon  [] immagini;
	
	ImageIcon premio = new ImageIcon("1.png");

    
    private JButton conferma;
    private JButton cancella; 
    
    
    //vuoti 
	private JLabel [] vuoti; 


    public MyPanel(Patente patente) 
    {
        Border border=LineBorder.createBlackLineBorder();

        
        //buttoni 
        conferma = new JButton ("CONFERMA");
        cancella = new JButton ("CANCELLA");
        
        
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
        Nome.setBorder(border);
        Cognome = new JTextField();
        Cognome.setBorder(border);
        Data = new JTextField();
        Data.setBorder(border);
        testo = new JLabel ("QUIZ PATENTE B");
        testo.setBorder(border);

        
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
			domande[i] = new JLabel(patente.getDomande(i)); 
			domande[i].setHorizontalTextPosition(JLabel.LEADING);
		    domande[i].setVerticalTextPosition(JLabel.BOTTOM);
		    domande[i].setBorder(border);
		}
		//risposte
		for(int i = 0; i < 3 ; i++){
			r1[i] = new JRadioButton (patente.getRisposta1(i)); 
			r1[i].setBorder(border);
		}
		for(int i = 0; i < 3 ; i++){
			r2[i] = new JRadioButton (patente.getRisposta2(i)); 
			r2[i].setBorder(border);
		}
		for(int i = 0; i < 3 ; i++){
			r3[i] = new JRadioButton (patente.getRisposta3(i)); 
			r3[i].setBorder(border);
		}
		for(int i = 0; i < 3 ; i++){
			r4[i] = new JCheckBox (patente.getRisposta4(i)); 
			r4[i].setBorder(border);
		}
		for(int i = 0; i < 3 ; i++){
			r5[i] = new JRadioButton (patente.getRisposta5(i));
			r5[i].setBorder(border);
		}
		for(int i = 0; i < 3 ; i++){
			r6[i] = new JRadioButton (patente.getRisposta6(i));
			r6[i].setBorder(border);
		}
		for(int i = 0; i < 3 ; i++){
			r7[i] = new JRadioButton (patente.getRisposta7(i));
			r7[i].setBorder(border);
		}
		for(int i = 0; i < 3 ; i++){
			r8[i] = new JCheckBox (patente.getRisposta8(i)); 
			r8[i].setBorder(border);
		}
		
		//vuoti 
		for(int i = 0; i < 11 ; i++){
			vuoti[i] = new JLabel ("VUOTO"); 
			vuoti[i].setBorder(border);
		}
		
		//immagini 
		for(int i = 0; i < 8 ; i++){
			String nome = String.valueOf(i+1)+".png"; 
			System.out.println("Nome : "+nome);
			img[i] = new JLabel();
			img[i].setIcon(immagini[i]);
			img[i].setBorder(border);
		}
		
		this.add(vuoti[0]);
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
		
		this.add(vuoti[6]);
		this.add(vuoti[7]);
		this.add(conferma);
		this.add(cancella);
		this.add(vuoti[8]);


		
		
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

		setSize(400, 400);
		
		r1[0].setBorder(border);
		
		conferma.addActionListener(this);
        cancella.addActionListener(this);
        
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
			ri1.clearSelection(); 
			ri2.clearSelection(); 
			ri3.clearSelection();
			for(int i = 0; i<3 ; i++)
				r4[i].setSelected(false);
				
			ri5.clearSelection(); 
			ri6.clearSelection(); 
			ri7.clearSelection(); 
			for(int i = 0; i<3 ; i++)
				r7[i].setSelected(false); 
			
		}
    }
}

