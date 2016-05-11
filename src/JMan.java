import java.awt.*;

/** An instance of this class is a J*Man.
 There should at most one J*Man in a game board at a time*/
public class JMan extends Piece {
    
    /** Constructor: a new J*Man at position (x, y) on Map m
     with color red if c = 0, green if c = 1, and yellow if c = 2. */
    public JMan(int x, int y, int c, Map m){
        super(Piece.JMAN, m);
        // Complete this
        if (c == 0)
        	setColor(Color.RED);
        else if (c == 1)
        	setColor(Color.GREEN);
        else if (c == 2)
        	setColor(Color.YELLOW);
        setX(x);
        setY(y);
    }
    
    /** Constructor: a new J*Man at position (x, y) on Map m
     with color c. Precondition: c is one of
     Color.RED, Color.GREEN, and Color.YELLOW.*/
    public JMan(int x, int y, Color c, Map m){
        super(Piece.JMAN, m);
        // Complete this;
        setColor(c);
        setX(x);
        setY(y);
    }
    
    /** J*Man should move based on what button is pushed.
     This method is not used. */
    public void act(){
        return;
    }
    /**
     * Check piece color to eat
     * @param piece
     * @return true if jMan can eat
     */
    public boolean checkCanEat(Piece piece){
    	if (this.getColor().equals(Color.GREEN) && piece.getColor().equals(Color.RED)){
    		this.setColor(Color.RED);
    		return true;
    	}
    	else if (this.getColor().equals(Color.RED) && piece.getColor().equals(Color.YELLOW)){
    		this.setColor(Color.YELLOW);
    		return true;
    	}
    	else if (this.getColor().equals(Color.YELLOW) && piece.getColor().equals(Color.GREEN)){
    		this.setColor(Color.GREEN);
    		return true;
    	}
    	else 
    		return false;
    }
    
    /** Move J*Man one step based on the value of i:
        0 = up, 1 = down, 2 = left, 3 = right. */
    public void step(int i){
        setActed(true);
        if (i == 0 && this.getMap().isInGrid(this.getX(), this.getY()-1)){
        	Piece piece = this.getMap().pieceAt(this.getX(), this.getY()-1);
        	if (piece == null || checkCanEat(piece) == true){
        		this.getMap().move(this.getX(), this.getY(), this.getX(), this.getY()-1);
        	}
        }
        else if (i == 1 && this.getMap().isInGrid(this.getX(), this.getY()+1)){
        	Piece piece = this.getMap().pieceAt(this.getX(), this.getY()+1);
        	if (piece == null || checkCanEat(piece) == true){
        		this.getMap().move(this.getX(), this.getY(), this.getX(), this.getY()+1);
        	}
        }
        else if (i == 2 && this.getMap().isInGrid(this.getX()-1, this.getY())){
        	Piece piece = this.getMap().pieceAt(this.getX()-1, this.getY());
        	if (piece == null || checkCanEat(piece) == true){
        		this.getMap().move(this.getX(), this.getY(), this.getX()-1, this.getY());
        	}
        }
        else if (i == 3 && this.getMap().isInGrid(this.getX()+1, this.getY())){
        	Piece piece = this.getMap().pieceAt(this.getX()+1, this.getY());
        	if (piece == null || checkCanEat(piece) == true){
        		this.getMap().move(this.getX(), this.getY(), this.getX()+1, this.getY());
        	}
        }
    }
    
    /** = representation of this piece */
    public String toString() {
        String color= "";
        return getColorWord() + " J*Man at (" + getX() + ", " + getY() + ")";
    }
}
