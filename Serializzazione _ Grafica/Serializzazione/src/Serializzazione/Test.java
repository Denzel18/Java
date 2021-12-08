package Serializzazione;

import java.io.IOException;

public class Test {
	public static void main(String[] v) throws IOException {
		Auto a = new Auto ("Panda","Fiat","Bianco");
		Auto a2 = new Auto ("Punto","Fiat","Nera");
		System.out.println("Auto : "+a.toString()); 
		a.salvaAuto();
		Auto a1 = a.ricaricaAuto();
		System.out.println("Auto : "+a1.toString());
		
		a2.salvaSuFile();
		System.out.println("Auto (file) : "+ a2.letturaDaFile());
	}
}
