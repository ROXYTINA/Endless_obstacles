package Menu;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import javax.swing.SwingUtilities;

import UI.MenuButton;
import entities.Player;
import platform2D.game;
import utilz.loadsave;

public class MenuState extends State implements Statemethod {
	private MenuButton[] button = new MenuButton[3];
	private BufferedImage backgroundImg, BG;

	private int menuWidth;
	private int menuHeight;
	private int menuY;
	private int menuX;
	private int BG_w;
	private int BG_H;
	private BufferedImage menu, naruto_pic;
	private int menu_w, menu_h, naruto_w, naruto_h;

	public MenuState(game gme) {
		super(gme);
		loadbuttton();
		loadBackground();
	}

	private void loadBackground() {
		menu = loadsave.Getsprite(loadsave.MENU_NARUTO);
		backgroundImg = loadsave.Getsprite(loadsave.BACKGROUD_MENU_BUTTON);
		BG = loadsave.Getsprite(loadsave.Background);
		naruto_pic = loadsave.Getsprite("naruto_pic.png");
		naruto_w = naruto_pic.getWidth();
		naruto_h = naruto_pic.getHeight();
		BG_w = BG.getWidth();
		BG_H = BG.getHeight();
		menu_w = menu.getWidth() / 4;
		menu_h = menu.getHeight() / 4;

		menuWidth = (int) (backgroundImg.getWidth());
		menuHeight = (int) (backgroundImg.getHeight());
		menuX = 1200 / 2 - menuWidth / 2;
		menuY = 5;

	}

	private void loadbuttton() {
		button[0] = new MenuButton(1200 / 2, 100, 0, GameState.PlAYING);
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
		g.drawImage(BG, 0, 0, BG_w, BG_H, null);
		g.drawImage(naruto_pic, 100, -55, naruto_w, naruto_h, null);

		// g.drawImage(backgroundImg, menuX, menuY, menuWidth, menuHeight, null);

		for (MenuButton mb : button) {
			mb.draw(g);
		}
		g.drawImage(menu, 480, 0, menu_w, menu_h, null);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (!SwingUtilities.isLeftMouseButton(e)) {
			return;
		}

		for (MenuButton mb : button) {
			if (isIn(e, mb)) {
				mb.setMousePressed(true);
				break;
			}
		}

	}

	public void mouseReleased(MouseEvent e) {
		if (!SwingUtilities.isLeftMouseButton(e)) {
			resetButtons();
			return;
		}

		for (MenuButton mb : button) {
			if (isIn(e, mb) && mb.isMousePressed()) {
				mb.applyGamestate();
				if (mb.getGameState() == GameState.PlAYING) {
					gme.getAudioPlayer().playingSong();
				}
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
			GameState.state = GameState.PlAYING;
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
