import java.awt.Color;
/**
 * Create the block in the framework
 * @author Budnampetch Onmee
 */
public class Block extends Piece {
	/**
	 * Initialize attributes of a Block
	 * @param x position of the block
	 * @param y position of the block
	 * @param m 
	 */
	public Block(int x, int y, Map m){
		super(Piece.BLOCK, m);
		setColor(Color.WHITE);
		setX(x);
		setY(y);
	}
	
	@Override
	public void act() {
		// TODO Auto-generated method stub
	}
	
	/**
	 * @return position of the block
	 */
	public String toString(){
		return getColorWord() + " BLOCK at (" + getX() + ", " + getY() + ")";
	}
}
