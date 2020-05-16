package Serializzazione;

import java.io.*;


public class Auto implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String modello; 
	private String marca; 
	private String colore; 
	
	public Auto(String modello, String marca, String colore) {
		this.modello = modello; 
		this.marca = marca;
		this.colore = colore; 
	}
	
	public String toString() {
		String s="";
		s = this.marca+";"+this.modello+";"+this.colore;
		return s; 
	}
	public void salvaAuto() throws java.io.IOException {
		FileOutputStream output = new FileOutputStream("auto.bin");
		ObjectOutputStream stream = new ObjectOutputStream(output);
		stream.writeObject(this);
		output.close();
		stream.close();
	}
	
	public Auto ricaricaAuto() throws java.io.IOException{
		Auto a = null; 
		FileInputStream input = new FileInputStream("auto.bin");
		ObjectInputStream stream = new ObjectInputStream(input);
		try {
			a = (Auto) stream.readObject();
		}catch(ClassNotFoundException exception) {
			System.out.println("errore  "+exception.getException());
		}
		input.close();
		stream.close();
		return a;
	}
	
	public void salvaSuFile() throws java.io.IOException {
		String line = this.colore+";"+this.marca+";"+this.modello;
		try {
		  File file = new File("auto.txt");
		  FileWriter fw = new FileWriter(file);
		  fw.write(line);
		  fw.flush();
		  fw.close();
		}catch(IOException e){ 
		      System.out.println("Errore salvataggio su file\n");
		}
	}
	public String letturaDaFile() throws java.io.IOException {
	    String path = "auto.txt";
	    char[] in = new char[300];
	    String linea="";
	    int size = 0;
	    try {
	      File file = new File(path);
	      FileReader fr = new FileReader(file);
	      BufferedReader br = new BufferedReader(fr);
	      size = br.read(in);
	      for(int i=0; i<size; i++){
	      	linea+=in[i];
	      }
	      br.close();
	    }
	    catch(IOException e) { 
	      e.printStackTrace();
	    }
		return linea;
	}
}



