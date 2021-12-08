public class TestSolidi {
    public static void main(String[] args) {
        Sfera s1=new Sfera(1.0,0.5);
        Cubo c1=new Cubo(3.0,1.1);
        System.out.println("Sfera   s1--> Superficie: " + s1.superficie());
        System.out.println("Sfera   s1--> Volume....: " +s1.volume());
        System.out.println("Sfera   s1--> Peso......: " +s1.peso());
        
        System.out.println("Cubo    c1--> Superficie: " +c1.superficie());
        System.out.println("Cubo    c1--> Volume....: "+ c1.volume());
        System.out.println("Cubo    c1--> Peso......: "+c1.peso());
        
        Solido sd1=s1;
        System.out.println("Solido  sd1-> Volume....: "+sd1.volume());
        
        Solido sd2=c1;
        System.out.println("Solido  sd2-> Volume....: "+sd2.volume());               
    }
}