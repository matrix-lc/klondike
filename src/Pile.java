import java.util.ArrayList;
import java.awt.*;

/** A Pile is a collection of cards.  This needs to be
 * Drawable because it will be shown on the GUI. Put code
 * here that ALL Piles share.  The ways in which Piles are 
 * different belong in the subclasses.  The draw method should 
 * be implemented here.  Updateable may have empty implementation.
 * You WILL write subclasses of Pile
 */
public abstract class Pile implements Drawable, Updateable {
    private ArrayList<Card> cards = new ArrayList<>();

    public abstract double getxLoc();
    public abstract double getyLoc();

    public abstract boolean canAddCard(Card c);
    
    public abstract boolean removeTopCard();

    public void draw(Graphics g) {
        if (cards.size() == 0) {
            return;
        }
        for (Card x : cards) {
            x.draw(g);
        }
    }

    public void addCard(Card c){
        cards.add(c);
    }

    public int getSize() {
        return cards.size();
    }

    public ArrayList<Card> getList() {
        return cards;
    }

    public Card getTopCard() {
        if (cards.size() > 0) {
            return cards.get(1);
        }
        return null;
    }

    //public void removeCard(); --> better to leave for subclasses
    // for suitpiles, draw only last card bc loc is same as piles loc
}
