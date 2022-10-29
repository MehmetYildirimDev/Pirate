package levels;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import main.Game;
import utilz.LoadSave;

public class levelManager {

	private Game game;
	private BufferedImage[] levelSprite;
	private level levelOne;

	public levelManager(Game game) {
		this.game = game;	
		importOutsideSprites();
		levelOne = new level(LoadSave.GetLevelData());

	}


	private void importOutsideSprites() {
		BufferedImage img = LoadSave.GetSpriteAtlas(LoadSave.LEVEL_ATLAS);
		levelSprite = new BufferedImage[48];//4x12 oldugundan
		for (int j = 0; j < 4; j++) 
			for (int i = 0; i < 12; i++) {
				int index = j*12 + i;
				levelSprite[index] = img.getSubimage(i*32, j *32, 32, 32);//32px oldufundan
			}


	}


	public void draw(Graphics g) {

		for(int j=0; j<Game.TILES_IN_HEIGHT;j++)
			for(int i=0; i<Game.TILES_IN_WIDTH; i++) {
				int index = levelOne.getSpriteIndex(i, j);
				g.drawImage(levelSprite[index], Game.TILES_SIZE*i, Game.TILES_SIZE *j,Game.TILES_SIZE,Game.TILES_SIZE, null);		
			}


	}

	public void update() {

	}

}
