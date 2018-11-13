import java.awt.Font;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		Window frame = new Window();
		
		frame.setBounds (400 ,200 ,740 ,740);
		frame.setFont ( new Font ( Font . SANS_SERIF , Font . PLAIN ,20));
		frame.setTitle("SnowBall");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
	}

}
