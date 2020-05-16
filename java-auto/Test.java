public class Test{
    public static void main(String[] args) {
		
		Automobile a1 = new Automobile("EZ111EZ",2018,"ROSSO",1500,"DIESEL",5, "AUDI","A5"); 
		Automobile a2 = new Automobile("EZ222EZ",2018,"BIANCO",1500,"DIESEL",5, "AUDI","A5");
		Automobile a3 = new Automobile("EZ333EZ",2018,"ROSSO",1500,"BENZINA",5, "AUDI","A5");
		Automobile a4 = new Automobile("EZ444EZ",2018,"NERO",1500,"DIESEL",5, "AUDI","A5");
		Automobile a6 = new Automobile("EZ666EZ",2018,"GRIGIO",1500,"DIESEL",5, "AUDI","A5");
		Automobile a5 = new Automobile("EZ555EZ",2018,"ROSSO",1500,"BENZINAS",5, "AUDI","A5");
		
		Parcheggio parcheggio  = new Parcheggio(); 
		
		
		System.out.println("A1 : "+a1.toString());
		
		
		System.out.println("A1 : "+a1.toString());
		
		System.out.println(a1.luci());
		System.out.println(a1.benzina());
		
		a1.rifornimento(100); 
		System.out.println(a1.getSerbatoio());
		
		parcheggio.svuotaParcheggio();
		
		System.out.println("POSTO P "+parcheggio.entraAutomobilev2(a1));
		System.out.println("POSTO P "+parcheggio.entraAutomobilev2(a2));
		System.out.println("POSTO P "+parcheggio.entraAutomobilev2(a3));
		System.out.println("POSTO P "+parcheggio.entraAutomobilev2(a5));
		System.out.println("POSTO P "+parcheggio.entraAutomobilev2(a6)); 
		System.out.println("POSTO P "+parcheggio.entraAutomobilev1(a4)); 
		System.out.println(parcheggio.toString());
		
		
		parcheggio.esceAutomobile(a1,0); 
		parcheggio.esceAutomobile(a2,5);
		
		System.out.println(parcheggio.toString());
		
		
		Parcheggio p2 = new Parcheggio(parcheggio); 
		
		System.out.println(p2.toString());
		
		
		
		
		
		
	}
}
