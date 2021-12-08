public class Sfera extends Solido{ 
    double raggio; 
    Sfera(double raggio, double pesoSpecifico) { 
        super(pesoSpecifico);
        this.raggio = raggio; 
    }  
    public double volume(){ return 4/3 * Math.PI * Math.pow(raggio,3); } 
    public double superficie () { return 4 * Math.PI * raggio * raggio;}  
} 