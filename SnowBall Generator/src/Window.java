import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Window extends JFrame{

	private Matrix map;
	private Code num;
	private Draws draw;
	
	static ArrayList<Lines> lines = new ArrayList();
	
	private int x=100;
	private int y=100;
	private int dlugosc=20000;
	
	private int lastX=50;
	private int lastY=50;
	private	int curtX=50;
	private int curtY=50;
	
	private int d=0;
	
	Window()
	{
		map = new Matrix(x,y); 
		num = new Code(dlugosc);
		map.ocupie(lastX,lastY);
		
		draw = new Draws();
		getContentPane().add(draw, BorderLayout.LINE_START);
		
		
		run();
		
	}
	void run() {
		
		for(int i=0; i<dlugosc; i++) {
			
			//System.out.printf("\nPunkt:" + curtX + " " + curtY + ">" + lastX + " " + lastY + " " + d);
			
			if(num.giveNr(i) == 1) testDir(curtX,curtY,d,1);
			else if(num.giveNr(i) == 0) testDir(curtX,curtY,d,7);		
			
			if(curtX == lastX && curtY == lastY+1) d=4;
			else if(curtX == lastX+1 && curtY == lastY+1) d=5;
			else if(curtX == lastX+1 && curtY == lastY) d=6;
			else if(curtX == lastX+1 && curtY+1 == lastY) d=7;
			else if(curtX == lastX && curtY+1 == lastY) d=0;
			else if(curtX+1 == lastX && curtY+1 == lastY) d=1;
			else if(curtX+1 == lastX && curtY == lastY) d=2;
			else if(curtX+1 == lastX && curtY == lastY+1) d=3;
			
			lines.add(new Lines(curtX,curtY,lastX,lastY));
			
		}
		
	}	
	
	void testDir(int x,int y,int d,int max) { 
		
		int i = 0;
		
		if(max ==7) i=0;
		if(max ==1) i=8;
		
		while(i != max)
		{
			
			if((i+d)%8==0) {
				if( testPoint(x,y+1) ) {
					nextPoint(x,y+1);
					break;
				}
			}

			if((i+d)%8==1) {
				if( testPoint(x+1,y+1) ) {
					nextPoint(x+1,y+1);
					break;
				}
			}
			
			if((i+d)%8==2) {
				if( testPoint(x+1,y) ) {
					nextPoint(x+1,y);
					break;
				}
			}
			
			if((i+d)%8==3) {
				if( testPoint(x+1,y-1) ) {
					nextPoint(x+1,y-1);
					break;
				}
			}
			
			if((i+d)%8==4) {
				if( testPoint(x,y-1) ) {
					nextPoint(x,y-1);
					break;
				}
			}
			
			if((i+d)%8==5) {
				if( testPoint(x-1,y-1) ) {
					nextPoint(x-1,y-1);
					break;
				}
			}
			
			if((i+d)%8==6) {
				if( testPoint(x-1,y) ) {
					nextPoint(x-1,y);
					break;
				}
			}
			
			if((i+d)%8==7) {
				if( testPoint(x-1,y+1) ) {
					nextPoint(x-1,y+1);
					break;
				}
			}	
			
			if(max ==7) i++;
			if(max ==1) i--;
			
		}	
		
	}
	
	Boolean testPoint(int x,int y) {
		return map.isEmpty(x, y);
	}
	
	void nextPoint(int x,int y) {
		lastX=curtX;
		lastY=curtY;
		curtX=x;
		curtY=y;
		
		map.ocupie(lastX,lastY);
	}	
	
}
