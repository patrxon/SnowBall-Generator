import java.awt.*;

public class Matrix {
	
	private Punkt tab[][];
	
	Matrix (int x, int y){
		
		tab = new Punkt[x][y];
		
		for(int i=0; i<x; i++)
		{
			for(int j=0; j<y; j++)
			{
				tab[i][j] = new Punkt();
			}
		}
		
	}
	
	public Boolean isEmpty(int x,int y) throws ArrayIndexOutOfBounds {
		return tab[x][y].isEmpty(); 
	}
	
	public void ocupie(int x,int y) {
		tab[x][y].ocupie();
	}
	
	
}
