import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Draws extends JPanel implements ActionListener {
	
	private final int DELAY = 10;
	private Timer timer; 
	private int size=7;

	public Draws() {

		setPreferredSize(new Dimension(740,740));
			
		timer = new Timer(DELAY, this);
		timer.start();		
	}

	
	private void doDrawing(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		
		for(int i=0; i<Window.lines.size(); i++) {
			g2d.drawLine( Window.lines.get(i).getX()*size, Window.lines.get(i).getY()*size, Window.lines.get(i).getX2()*size, Window.lines.get(i).getY2()*size);
		}
		
	}
	
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		doDrawing(g);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 
		repaint();
	}
	

}
