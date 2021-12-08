
/**
 * Aggiungi qui una descrizione della classe Telecomando
 * 
 * Mirco Morazzini 4c/in 
 * 17/01/19
 */
public class Telecomando
{
    private Robot robot1;
    private Robot robot2;
    private Robot robot3;

public Telecomando(Robot Robot1,Robot Robot2,Robot Robot3)
    {
      setRobot1(robot1);
      setRobot2(robot2);
      setRobot3(robot3);
    }
    private void setRobot1(Robot robot1)
    {
        this.robot1=robot1;
    }
    private void setRobot2(Robot robot2)
    {
        this.robot2=robot2;
    }
    private void setRobot3(Robot robot3)
    {
        this.robot3=robot3;
    }
    //se ti dico accendi uno, non ti ho detto che devi spegnere anche gli altri !!! 
    //se ti dico che si chiama accendiUno, tu lo devi chiamare così
    public void accendiUno()
    {
        robot1.On();
    }
    public void accendiDue()
    {
        robot1.On();
        robot2.On();
    }
    public void accendiTutti()
    {
        robot1.On();
        robot2.On();
        robot3.On();
    }
    public void spegni()
    {
        robot1.Off();
        robot2.Off();
        robot3.Off();
    }
    public String toString(){
        String telecomando="";
        telecomando += "il primo robot : "+robot1.toString()+";";
        telecomando += "il secondo robot : "+robot2.toString()+";";
        telecomando += "il terzo robot : "+robot3.toString()+";";
        return telecomando;
    }
}   
