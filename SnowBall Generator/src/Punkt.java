import java.awt.*;

public class Punkt {

	private Boolean empty=true;
	private int direction;
	
	public Boolean isEmpty() {
		return empty;
	}
	
	public void ocupie() {
		empty=false; 
	}
	
}
