import java.awt.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class GivenPile extends Pile{

    private Image testImage, backImage;

    @Override
    public void update(ActionEvent a) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean canAddCard(Card c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void draw(Graphics g) {
        // TODO Auto-generated method stub
        
        try {
			testImage = ImageIO.read(new File("images/cards/dj.png"));
			backImage = ImageIO.read(new File("images/cards/b1fv.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

        // g.drawImage(testImage, 30, 80, null);
		// g.drawImage(backImage, 100, 80, null);
		// g.drawImage(backImage, 105, 100, null);

        for (Card x: cards){
            g.drawImage(backImage, x.getLoc().getXLoc(), x.getLoc().getYLoc(), null);
        }
    }

    @Override
    public double getxLoc() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double getyLoc() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
