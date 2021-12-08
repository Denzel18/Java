
/**
 * Aggiungi qui una descrizione della classe Test
 * 
 * Mirco Morazzini 4c/in 
 * 17/01/19
 */

public class Test
{
    public static void main(String[] args) 
    {
     Robot robot1 = new Robot("samsung","ee30se","ROSSO",50,400,200);
     Robot robot2 = new Robot("bimbi","ee355","blu",50,400,200);
     Robot robot3 = new Robot("epson","ee605","giallo",50,400,200);
     System.out.println(robot1.toString());
     System.out.println(robot2.toString());
     System.out.println(robot3.toString());
     robot1.On();
     robot2.On();
     robot3.On();
     System.out.println(robot1.toString());
     System.out.println(robot2.toString());
     System.out.println(robot3.toString());
     robot1.velocita(true);
     robot2.temperatura(true);
     robot3.temperatura(true);

     System.out.println(robot1.toString());
     System.out.println(robot2.toString());
     System.out.println(robot3.toString());
    }
}
