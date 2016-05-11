import java.awt.Color;
/**
 * Create the walker and move in the framework
 * @author Budnampetch Onmee
 * 
 */
public class Walker extends Piece {
	public Walker (int x, int y, int c, Map m){
		/**
		 * Initialize attributes of a Walker
		 * @param x position of the walker
		 * @param y position of the walker
		 * @param m 
		 */
		super(Piece.WALKER,m);
		setX(x);
		setY(y);
		setColor(c);
	}
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
		int check = this.rand(0,3);
		if (this.rand(0,2) < 1){
			if (check == 0 && this.getMap().isEmpty(this.getX(), this.getY()-1))
				this.getMap().move( this.getX(), this.getY(), this.getX(), this.getY()-1 );
			else if (check == 1 && this.getMap().isEmpty(this.getX(), this.getY()+1))
				this.getMap().move( this.getX(), this.getY(), this.getX(), this.getY()+1 );
			else if (check == 2 && this.getMap().isEmpty(this.getX()-1, this.getY()))
				this.getMap().move( this.getX(), this.getY(), this.getX()-1, this.getY() );
			else if (check == 3 && this.getMap().isEmpty(this.getX()+1, this.getY()))
				this.getMap().move( this.getX(), this.getY(), this.getX()+1, this.getY() );
		}
	}
	
	/**
	 * @return position of the walker
	 */
	public String toString(){
		return getColorWord() + " WALKER at (" + getX() + ", " + getY() + ")";
	}
}
