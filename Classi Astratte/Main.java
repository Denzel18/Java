public class Main{
    public static void main(String[] args) {
		Villa v1 = new Villa ("rossi","fano",10, 400, 3,1000,true); 
		Villa v2 = new Villa ("rossi","fano",10, 400, 3,1000,true);
		
		Appartamento a1 = new Appartamento ("verdi","marotta",3,100,4,10,false);
		Appartamento a2 = new Appartamento ("verdi","marotta",3,100,4,10,false);
		
		
		System.out.println("VILLA 1) "+v1.toString()); 
		System.out.println(v1.equals(v2)); 
	}
	
}
