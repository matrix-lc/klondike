import java.awt.Graphics;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/** represents a playing card that can draw itself. */
public class Card implements Drawable, Updateable{
    //Card getLocationX(), getLocationY();
		//move(Pile p) --> moves a Card to a Pile;
		//faceUp(); --> returns whether the card is face up or face down;
    private int value, suit;
    private boolean faceUp, selected;
    private Image frontImage;
    private Location loc;
    private static Image backImage;
    private static ArrayList<String> cardSuit = new ArrayList<String>(List.of("", "Hearts", "Diamonds", "Clubs", "Spades"));
    private static ArrayList<String> cardValue = new ArrayList<>(List.of("1","2","3","4","5","6","7","8","9","10","Jack","Queen","King"));


    public Card(int s, int v){
        this.suit = s;
        this.value = v;
        this.loc = new Location (0,0);
        openImage();
    }

    public Card(int s, int v, int x, int y){
        this.suit = s;
        this.value = v;
        this.loc = new Location (x,y);
        openImage();
    }

    public int getValue(){
        return value;
    }

    public int getSuit(){
        return suit;
    }

    public boolean colorCompare(Card c){}
    public void openImage(){
        String st = "Klondike/images/cards/";
        if(!faceUp){
            st+="b1fv.png";
        }
        else{
            st += cardSuit.get(suit) + cardValue.get(value) + ".png";
        }
    }
		


    public int compareTo(Card c){
        return this.value - c.value;
    }




    public void moveTo(Location newLoc){
        loc = newLoc;

    }

    @Override
    public String toString(){
        String s = "";
        if(value < 11) {
            s += value;
        }
        else{
            s+= cardSuit.get(value - 6);
        }
        return s + "of" + cardSuit.get(suit);
    }

    @Override
    public void update(ActionEvent a) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void draw(Graphics g) {
        // TODO Auto-generated method stub
        
    }
}
