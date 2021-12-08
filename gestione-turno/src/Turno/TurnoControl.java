package Turno ;
import Turno.*;
import java.awt.*;
import java.awt.event.*;

public class TurnoControl extends Panel implements ActionListener {
	private TurnoCalculator tc;
	private TurnoInterfaceView turnoVista;
	private Button turnoButton;
	public TurnoControl(TurnoCalculator tc, TurnoInterfaceView turnoVista){   
		super(new FlowLayout());            
		this.tc = tc;
		this.turnoVista = turnoVista;
		turnoButton = new Button("Turno");    
		add(turnoButton);         
		turnoButton.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){  
		try {
			String answer = "Turno: ";
			answer += tc.getTurno(turnoVista.getInput());
			turnoVista.setAnswer(answer);
		} catch(RuntimeException err){
			turnoVista.setError(err.getMessage()); 
		}
		turnoVista.updateView();
	}
}












































