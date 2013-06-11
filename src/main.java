import java.awt.*;

import javax.swing.*;


public class main extends JFrame {

	main(){
		setTitle("Test window 0.1");
		setLayout(new BoxLayout(getContentPane(),BoxLayout.X_AXIS));
		setPreferredSize(new Dimension(500,500));
		setVisible(true);
		pack();
	}
	
	
	
	
	
	public static void main(String[] args) {
		new main();

	}

}
