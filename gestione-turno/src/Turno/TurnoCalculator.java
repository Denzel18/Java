package Turno ;
import Turno.*;
public class TurnoCalculator {
    public String getTurno(String login) {
        //String st = login.trim().substring(0,2);
        //System.out.println(st);
        //if (st.compareToIgnoreCase("st") != 0) 
        //    throw new RuntimeException("Login non corretto");
        if (login.trim().equals("")) 
            throw new RuntimeException("Login non corretto");
        try {
        //    System.out.println(
        //    Integer.parseInt(login.trim().substring(2)));
            //return (Integer.parseInt(login.trim().substring(2)) % 4) + "";
            return (Integer.parseInt(login.trim()) % 4) + "";
        }
        catch (NumberFormatException err) {
            throw new RuntimeException("Login non corretto");
        }    
    }
}


