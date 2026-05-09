package utilz;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class loadsave {
	public static final String[] PLAYER_ATLAS = { "sakura.png", "naruto_new_sheet.png", "sasuke.png" };
	public static final String GROUND = "konoha-ground.jpg";
	public static final String SNAKE = "snake_v2.png";
	public static final String WOLF = "worf_sprite.png";
	public static final String Background = "konoha_main_street_map_by_zazycki_diprwk9-fullview.jpg";
	public static final String MENU_BUTTON = "button_atlas.png";
	public static final String BACKGROUD_MENU_BUTTON = "menu_background.png";
	public static final String URM_BUTTONS = "urm_buttons.png";

	public static final String NUMBER = "number.png";
	public static final String GAME_OVER = "Game-Over-1-20-2025.png";
	public static final String TIME = "time-1-20-2025.png";
	public static final String SCORE = "score-1-20-2025.png";
	public static final String TOP_SCORE = "top-score-1-20-2025.png";
	public static final String MENU_NARUTO = "menu-1-20-2025.png";
	public static final String PAUSE_IMAGE = "Game_pause.png";

	public static final String WOLF_GIF_1 = "worf1.gif";
	public static final String WOLF_GIF_2 = "wolf2.gif";

	public static BufferedImage Getsprite(String filename) {
		BufferedImage img = null;
		
		// 1. Try loading as resource from classpath
		try (InputStream is = loadsave.class.getResourceAsStream("/" + filename)) {
			if (is != null) {
				return ImageIO.read(is);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 2. Fallback: Try loading from 'rsc' folder directly
		try {
			File file = new File("rsc/" + filename);
			if (file.exists()) {
				return ImageIO.read(file);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.err.println("Could not find resource: " + filename);
		return null;
	}

	public static ImageIcon getGIF(String filename) {
		ImageIcon img = null;
		// Try resources first
		java.net.URL url = loadsave.class.getResource("/" + filename);
		if (url != null) {
			return new ImageIcon(url);
		}
		// Fallback to file system
		File file = new File("rsc/" + filename);
		if (file.exists()) {
			return new ImageIcon(file.getAbsolutePath());
		}
		return null;
	}
}
