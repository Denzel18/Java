public class Test{
    public static void main(String[] args) {
        
        Micronde m1 = new Micronde ("Samsung","ts133g",3000);
        Micronde m2 = new Micronde ("Philips","t213g",5000);
        Micronde m3 = new Micronde ("Sony","ts21g",4000);
        
        Telecomando t1 = new Telecomando ("samsung" , "X");
        Telecomando t2 = new Telecomando ("philips" , "Z"); 
        
        
        System.out.println(m1.toString()+m2.toString()+m3.toString());
        
        
        System.out.println("EQUALS\n");
        
        if(m1.equals(m2) == true) 
			System.out.println("microonde ugale !");
		else 
			System.out.println("microonde diverso !");
        
		System.out.println("ACCENDO M1\n");
		m1.On();
		System.out.println(m1.toString());
		
		System.out.println("Tempo di cottura\n");
		m1.setTCottura(400);
		// è corretto, perchè 400/60 = 6min+0,67*60 = 40secondi, infatti se considero 6*60 = 360secondi+40secondi = 400secondi 
		System.out.println(m1.getTempo());
        
        System.out.println("Vario il tempo di cottura (tempo scelto dall'utente\n");
        m1.varTempoV1(40,true);
        System.out.println(m1.getTempo());
        
        System.out.println("Vario il tempo di cottura (tempo default\n");
        m1.varTempoV2(true);
        System.out.println(m1.getTempo());
        
        
        System.out.println("EQUALS Telecomando\n");
        if(t1.equals(t2) == true) 
			System.out.println("telecomandi uguali !");
		else 
			System.out.println("telecomando diversi !");
        
        
        System.out.println("Spengo M1\n");
        m1.Off();
        System.out.println(m1.toString());
        
        System.out.println("Accendo tutti");
        System.out.println(t1.accendiTutti(m1,m2,m3));
        
			
		System.out.println("Spengo tutti i microonde con il telecomando");
		System.out.println(t1.spegni(m1,m2,m3)); 
		
		
		
		
		//------------- telecomando versione 2 ----------------------// 
		 System.out.println("Telecomando V2");
        Telecomando2 t3 = new Telecomando2 ("samsung", "CC", m1 , m2, m3);
        
        System.out.println(t3.toString());
        t3.accendiTutti(); 
		System.out.println(t3.getMicronde());
		t3.spegni();
		System.out.println(t3.getMicronde());
    }



}
