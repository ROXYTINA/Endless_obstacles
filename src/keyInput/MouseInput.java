package keyInput;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import Menu.GameState;
import platform2D.gamepanel;

public class MouseInput implements MouseListener, MouseMotionListener {
	private gamepanel gamePanel;

	public MouseInput(gamepanel gamePanel) {
		this.gamePanel = gamePanel;

	}

	@Override

	public void mouseDragged(MouseEvent e) {

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		switch (GameState.state) {
			case MENU:
				gamePanel.getGame().getMenu().mouseMoved(e);
				break;
			case PLAYING:
				gamePanel.getGame().getplaying().mouseMoved(e);
				break;
			default:
				break;

		}

	}

	@Override
	public void mouseClicked(MouseEvent e) {

		switch (GameState.state) {

			case PLAYING:
				gamePanel.getGame().getplaying().mouseClicked(e);
				break;
			default:
				break;

		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		switch (GameState.state) {
			case MENU:
				gamePanel.getGame().getMenu().mousePressed(e);

				break;
			case PLAYING:
				gamePanel.getGame().getplaying().mousePressed(e);
				break;
			case OPTION:
				gamePanel.getGame().getOption().mousePressed(e);
			default:
				break;

		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		switch (GameState.state) {
			case MENU:
				gamePanel.getGame().getMenu().mouseReleased(e);
				break;
			case PLAYING:
				gamePanel.getGame().getplaying().mouseReleased(e);
				break;
			default:
				break;

		}

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
