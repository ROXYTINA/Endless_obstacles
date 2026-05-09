package Menu;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import UI.MenuButton;

import platform2D.game;
import utilz.loadsave;

public class MenuState extends State implements Statemethod {
	private MenuButton[] button = new MenuButton[3];
	private BufferedImage backgroundImg, BG;

	private int BG_w;
	private int BG_H;
	private BufferedImage menu, naruto_pic, sasuke_pic, sakura_pic;
	private int menu_w, menu_h, naruto_w, naruto_h;

	public MenuState(game gme) {
		super(gme);
		loadbuttton();
		loadBackground();
	}

	private void loadBackground() {
		menu = loadsave.Getsprite(loadsave.MENU_NARUTO);
		// backgroundImg = loadsave.Getsprite(loadsave.BACKGROUD_MENU_BUTTON);
		BG = loadsave.Getsprite(loadsave.Background);
		naruto_pic = loadsave.Getsprite("naruto_pic.png");
		sakura_pic = loadsave.Getsprite("Sakura_for_menu.png");
		sasuke_pic = loadsave.Getsprite("Sasuke_for_menu.png");
		
		if (naruto_pic != null) {
			naruto_w = naruto_pic.getWidth();
			naruto_h = naruto_pic.getHeight();
		}
		
		if (BG != null) {
			BG_w = BG.getWidth();
			BG_H = BG.getHeight();
		}
		
		if (menu != null) {
			menu_w = menu.getWidth() / 4;
			menu_h = menu.getHeight() / 4;
		}

		// menuWidth = (int) (backgroundImg.getWidth());
		// menuHeight = (int) (backgroundImg.getHeight());
		// menuX = 1200 / 2 - menuWidth / 2;
		// menuY = 5;

	}

	private void loadbuttton() {
		button[0] = new MenuButton(1200 / 2, 100, 0, GameState.PLAYING);
		button[1] = new MenuButton(1200 / 2, 200, 1, GameState.OPTION);
		button[2] = new MenuButton(1200 / 2, 290, 2, GameState.QUIT);

	}

	@Override
	public void update() {
		for (MenuButton mb : button) {
			mb.update();
		}

	}

	@Override
	public void draw(Graphics g) {
		if (BG != null) g.drawImage(BG, 0, 0, BG_w, BG_H, null);
		if (naruto_pic != null) g.drawImage(naruto_pic, 100, -55, naruto_w, naruto_h, null);

		// g.drawImage(backgroundImg, menuX, menuY, menuWidth, menuHeight, null);

		for (MenuButton mb : button) {
			mb.draw(g);
		}
		if (menu != null) g.drawImage(menu, 480, 0, menu_w, menu_h, null);
		if (sasuke_pic != null) g.drawImage(sasuke_pic, 700, 0, 420, 594, null);
		if (sakura_pic != null) g.drawImage(sakura_pic, 650, 50, 216, 512, null);

	}

	@Override
	public void mousePressed(MouseEvent e) {

		for (MenuButton mb : button) {
			if (isIn(e, mb)) {
				mb.setMousePressed(true);
				break;
			}
		}

	}

	public void mouseReleased(MouseEvent e) {

		for (MenuButton mb : button) {
			if (isIn(e, mb)) {
				if (mb.isMousePressed())
					mb.applyGamestate();
				if (mb.getGameState() == GameState.PLAYING)
					gme.getAudioPlayer().playingSong();
				if (mb.getGameState() == GameState.OPTION)
					// gme.getAudioPlayer().plaEffects(0, 1);
					break;
			}
		}

		resetButtons();

	}

	private void resetButtons() {
		for (MenuButton mb : button)
			mb.resetBools();

	}

	public void mouseMoved(MouseEvent e) {
		for (MenuButton mb : button)
			mb.setMouseOver(false);

		for (MenuButton mb : button)
			if (isIn(e, mb)) {
				mb.setMouseOver(true);
				break;
			}

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER)
			GameState.state = GameState.PLAYING;
		if (e.getKeyCode() == KeyEvent.VK_Q) {
			GameState.state = GameState.QUIT;

		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		for (MenuButton mb : button)
			mb.setMouseOver(false);

	}

}
