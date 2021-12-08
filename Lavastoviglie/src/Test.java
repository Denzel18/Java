public class Test {
	public static void main(String[] args) {
		
		Lavastoviglie samsung = new Lavastoviglie ("SAMSUNG");
		Lavastoviglie sony = new Lavastoviglie ("SONY");
		
		System.out.println("sony : \n"+sony.toString());
		System.out.println("samsung : \n"+samsung.toString());
		
		System.out.println("seleziona lavaggio\n");
		
		if(!sony.selezionaLavaggio65()){
			System.out.println("errore : "+sony.getErrore());
		}
		if(!samsung.selezionaLavaggioEco()){
			System.out.println("errore : "+samsung.getErrore());
		}
		
		System.out.println("sony : \n"+sony.toString());
		System.out.println("samsung : \n"+samsung.toString());
		
		System.out.println("accensione lavastoviglie\n");
		samsung.accendi();
		sony.accendi();
		
		System.out.println("sony : \n"+sony.toString());
		System.out.println("samsung : \n"+samsung.toString());
		
		System.out.println("lavaggio\n");
		if(!sony.lavaggio()){
			System.out.println("errore : "+sony.getErrore());
		}
		else
			System.out.println("lavaggio eseguito\n");
		
		System.out.println("sony : \n"+sony.toString());
		int i;
		for(i=0 ; i<11 ; i++){
			if(!samsung.lavaggio()){
				System.out.println("errore : "+samsung.getErrore());
			}
			else
				System.out.println("lavaggio eseguito\n");
		}
		System.out.println("samsung : \n"+samsung.toString());
		
		System.out.println("fine lavaggio\n");
		sony.fineLavaggio();
		samsung.fineLavaggio();
		System.out.println("sony : \n"+sony.toString());
		System.out.println("samsung : \n"+samsung.toString());
		
		
		System.out.println("ricarica serbatoio\n");
		if(!sony.ricaricaSerbatoio()){
			System.out.println("errore : "+sony.getErrore());
		}
		if(!sony.ricaricaSerbatoioSale()){
			System.out.println("errore : "+sony.getErrore());
		}
		
		if(!samsung.ricaricaSerbatoio()){
			System.out.println("errore : "+samsung.getErrore());
		}
		if(!samsung.ricaricaSerbatoioSale()){
			System.out.println("errore : "+samsung.getErrore());
		}
		
		
		
		System.out.println("sony : \n"+sony.toString());
		System.out.println("samsung : \n"+samsung.toString());
	}
}
