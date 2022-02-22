import java.awt.Graphics;
import java.awt.event.*;

import javax.imageio.ImageIO;

/** represents a playing card that can draw itself. */
public class Card implements Drawable, Updateable{
    //Card getLocationX(), getLocationY();
		//move(Pile p) --> moves a Card to a Pile;
		//faceUp(); --> returns whether the card is face up or face down;

    private int xLoc, yLoc;
    private boolean faceUp;
    private Image frontImage;
    static private Image backImage;



    public Card(int x, int y, boolean up){
        this.xLoc = x;
        this.yLoc = y;
        this.faceUp = up;
    }


    public int getLocationX(){
        return xLoc;
    }

    public int getLocationY(){
        return yLoc;
    }



    public void draw(Graphics g){

    }

    public void update(ActionEvent e){

    }
}
