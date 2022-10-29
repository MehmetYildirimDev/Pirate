package utilz;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class LoadSave {

	public static final String PLAYER_ATLAS = "player_sprites.png";
	
	public static BufferedImage GetSpriteAtlas(String FileName){//gonderdigimiz isme gore sprite donucek
		BufferedImage img =null;//null degerini vermesek hata ile karsilarsa deger alamaz ve hata aliriz
		
		InputStream is = LoadSave.class.getResourceAsStream("/" + FileName);
		try {
			img = ImageIO.read(is);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	  	}
		
		return img;
	}
	
}
