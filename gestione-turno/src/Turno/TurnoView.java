package Turno ;
import Turno.*;
import java.awt.*;

public class TurnoView extends Panel implements TurnoInterfaceView {
	public TurnoView(TurnoCalculator tc){
		super(new BorderLayout()); 
		
		Panel panelNorth = new Panel(new FlowLayout());
		panelNorth.add(new Label("Inserire login: st+"));
		inputText = new TextField("", 8);  
		panelNorth.add(inputText);
		add(panelNorth, BorderLayout.NORTH);
		
		label = new Label("             No input ...            ");
		Panel panelCenter = new Panel(new FlowLayout());   
		panelCenter.add(label);   
		add(panelCenter, BorderLayout.CENTER); 
		
		bottoniControllo = new TurnoControl(tc, this);
		Panel panelSouth = new Panel(new FlowLayout());    
		panelSouth.add(bottoniControllo);  
		add(panelSouth, BorderLayout.SOUTH);  
		setAnswer("             No input ...            ");
		updateView();
	}
	public void updateView(){      
		label.setText(answer);
	}
	public String getInput(){  
		return inputText.getText();
	}
	public void setAnswer(String val){ 
		answer = val;
	}  
	public void setError(String err){
		answer = err;
	}
	private Label label;
	private TurnoControl bottoniControllo;
	private TextField inputText;
	private String answer;
}






































