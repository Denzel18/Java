public abstract class Solido{ 
    private double pesoSpecifico;
    public Solido(double pesoSpecifico){
      this.pesoSpecifico = pesoSpecifico;  
    }
    public abstract double volume(); 
    public abstract double superficie();
    public double peso(){return pesoSpecifico * volume(); } 
} 