/*
 * Denis Bernovschi
 * Soluzione
 */ 
public class Test{
    public static void main(String[] args) {
		Lampadina l1 = new Lampadina(1,100);
		Lampadina l2 = new Lampadina(1,100); 
		Lampadina l3 = new Lampadina(l1); 
		Lampadina l4 = new Lampadina(3,100); 
		
		System.out.println(l1.toString()+l2.toString()+l3.toString());
		
		if(l1.equals(l2))
			System.out.println("le lampadine 1 e 2 sono uguali\n");
		else
			System.out.println("le lampadine 1 e 2 sono diversi\n");
			
			
		System.out.println("accendo le lampadine 1 e 2\n");
		l1.lightOn();
		l2.lightOn();
		System.out.println(l1.toString()+l2.toString()+l3.toString());
		System.out.println("spengo le lampadine 1 e 2 \n");
		l1.lightOff();
		l2.lightOff();
		System.out.println(l1.toString()+l2.toString()+l3.toString());
		System.out.println(" provo a spegnere nuovamente le lampadine 1 e 2 \n");
		l1.lightOff();
		l2.lightOff();
		System.out.println(l1.toString()+l2.toString()+l3.toString());
		System.out.println("Colore lampadina 4: "+l4.getColore()+"\n");
		l4.setColore(10); 
		System.out.println("Colore lampadina 4: "+l4.getColore()+"\n");
		
		//aumenta = true , diminuisce = false 
		l4.lightOn();
		l4.varLum(true); 
		System.out.println(l4.toString());
		
		
		
		//LAMPADARIO 
		Lampadario L = new Lampadario("Philips","HUE",l1,l2,l3); 
		System.out.println("TESTING LAMPADARIO\n");
		System.out.println(L.toString()+"\n");
		System.out.println("TESTING LAMPADINE\n");
		System.out.println(L.getLampadine()+"\n");
		L.accendiDue();
		System.out.println("ACCENDO DUE LAMPADINE \n"+L.toString()+"\n");
		L.spegni();
		System.out.println("SPENGO LE LAMPADINE \n"+L.toString()+"\n");	
		
		
		
	}
}
