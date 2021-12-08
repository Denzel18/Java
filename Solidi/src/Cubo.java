public class Cubo extends Solido { 
    private double lato; 
    Cubo(double lato, double pesoSpecifico){ 
       super(pesoSpecifico);
       this.lato = lato; 
    } 
    public double volume(){ return Math.pow(lato,3); } 
    public double superficie(){return 6*Math.pow(lato,2); } 
}