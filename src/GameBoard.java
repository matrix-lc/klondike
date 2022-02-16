import java.awt.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class GameBoard implements Drawable, Updateable {
	

	Image testImage, backImage;
	public static final int OFFSET_X = 40, OFFSET_Y = 20;
	
	 
	private int numdraws=0;
	
	
	
	public GameBoard() {
		try {
			testImage = ImageIO.read(new File("images/cards/dj.png"));
			backImage = ImageIO.read(new File("images/cards/b1fv.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	/** @param g Graphics context onto which all Objects in the game
	 * draw themselves.  This should NOT change the Objects
	 */
	public void draw(Graphics g) {
		numdraws++;
		g.setColor(new Color(40, 155, 70));
		g.fillRect(0, 0, 3000, 2000);
		
		// this is just to test drawing a card
		g.drawImage(testImage, 30, 80, null);
		g.drawImage(backImage, 100, 80, null);
		g.drawImage(backImage, 105, 100, null);
	}


	/**
	 * This method is called by the game when a click has been made 
	 * on the panel.  Must determine if the click makes sense (is it 
	 * a valid location, If it is the first click, then note it and
	 * the next click will attempt a move (maybe).
	 * @param me
	 */
	public void justClicked(MouseEvent me) {
		Point p = me.getPoint();
		System.out.println("You just clicked "+p);
		
		//Step 1: Check if the player selected a card
			//Get location
			//Check Pile Locations
				//If DrawPile getLocationX() and getLocationY() --> DrawPile draw();
					//ThreeCardPile --> addThreeCards(draw());
				//else if ColumnPile and ThreeCardPile getLocationX() and getLocationY();
					//Check what Card is selected: ColumnPile --> Card getLocationY() to check the card and for ThreeCardPile -- Card getLocationX() to check the card
						//Card faceUp() --> if true then faceUp if false then faceDown;
					//Save Card
					//Instance --> Card selectedCard;
					//Instance --> firstClick == true;
		//Second Click if(firstClick == true)
			//Get location
			//Check if it valid, if so then move
				//Pile getLocationX() and getLocationY();
				//Pile checkMove(selectedCard); --> if true then Pile move(Card C, Pile p);
			//if checkMove(selectedCard) is false then go to step 1;
				//Instance --> firstClick == false;

		//Methods:
			//Card getLocationX(), getLocationY(), newLocationX(), newLocationY();
				//setFacing(boolean facing) --> changes the facing of the card according to the boolean value of "facing";
				//faceUp(); --> returns whether the card is face up or face down;
			//Pile getLocationX(), getLocationY(),
				//checkMove(Card c); --> checks if the selectedCard can move to "this" Pile;
				//move(Card C, Pile p); --> moves Card C from Pile p to this Pile, and changes the location of the Card;
			//DrawPile draw(); --> returns an ArrayList of the top three cards
			//ThreeCardPile addThreeCards(ArrayList<Cards>);

	}

	@Override
	// this update will be called each time the timer in the KlondikeGame
	// goes off.  This will be convenient for animating.
	public void update(ActionEvent a) {
		
		
	}

}
