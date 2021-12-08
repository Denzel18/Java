package Turno ;
import Turno.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class TurnoApplet extends Applet {  
	public void init(){
		tcModello = new TurnoCalculator();     
		tcVista = new TurnoView(tcModello);
		setLayout(new BorderLayout()); 
		add(tcVista, BorderLayout.CENTER);
	}
	private TurnoCalculator tcModello;
	private TurnoView tcVista;
} 












