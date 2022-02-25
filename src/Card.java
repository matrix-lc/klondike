import java.awt.Graphics;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.Image;
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

    public void openImage(){
        String s = "Klondike/images/cards/";
        if(!faceUp){
            s+="b1fv.png";
        }
        else{
            s += cardSuit.get(suit) + cardValue.get(value) + ".png";
        }
    }
		


    public int compareTo(Card c){
        return this.value - c.value;
    }




    public void moveTo(Loacation newLoc){
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
}
