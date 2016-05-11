import java.awt.Color;
/**
 * Create the pillar and random color in the framework
 * @author Budnampetch Onmee
 * 
 */
public class Pillar extends Piece {
	
	public Pillar (int x, int y, int c, Map m){
		/**
		 * Initialize attributes of a Pillar
		 * @param x position of the pillar
		 * @param y position of the pillar
		 * @param m 
		 */
		super(Piece.PILLAR,m);
		setX(x);
		setY(y);
		setColor(c);
	}
	
	/**
	 * Check color of pillar
	 * @param c
	 */
	public void setColor(int c){
		if (c == 0)
			setColor(Color.RED);
		else if (c == 1)
			setColor(Color.GREEN);
		else 
			setColor(Color.YELLOW);
	}
	
	@Override
	public void act() {
		setActed(true);
		if (Piece.rand(0, 2) < 1)
			setColor(Piece.rand(0, 2));
	}
	
	/**
	 * @return position of the pillar
	 */
	public String toString(){
		return getColorWord() + " PILLAR at (" + getX() + ", " + getY() + ")";
	}
}
