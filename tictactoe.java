import java.awt.*;
import java.awt.event.*;

class Fdemo extends Frame implements ActionListener{
	
	
	Fdemo(){
			
			setLayout(null);
			setVisible(true);
			setSize(800,600);
			setLocation(400,100);
			setBackground(Color.black);
			setForeground(Color.white);		

		
	}
	
	public void actionPerformed(ActionEvent e){
		
	}
}		
public class tictactoe{

	public static void main (String ar[]){
	
		Fdemo f = new Fdemo();
	}
}