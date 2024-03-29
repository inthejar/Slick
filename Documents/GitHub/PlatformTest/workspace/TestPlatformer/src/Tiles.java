
import org.newdawn.slick.*;

public class Tiles {

	Image block = null; //test block image
	int x;
	int y;
	
	int width;
	int height;
	
	float scale;
	
	Tiles()
	{
		x = 0;
		y = 400;
		scale = 0.1f;
	}
	
	public void loadImage(String file) throws SlickException
	{
		block = new Image(file);
		width = (int) (block.getWidth()*scale);
		height = (int) (block.getHeight()*scale);
	}
	
	public void copyImage(Tiles t)
	{
		block = t.block;
	}
	
	public void draw()
	{
		block.draw(x, y, scale);
	}
}
