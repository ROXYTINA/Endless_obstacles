package Menu;

import java.awt.event.MouseEvent;

import UI.MenuButton;
import audio.AudioPlayer;
import platform2D.game;

public class State {
	protected game gme;

	public State(game gme) {
		this.gme = gme;
	}

	public boolean isIn(MouseEvent e, MenuButton mb) {
		return mb.getBounds().contains(e.getX(), e.getY());
	}

	public game getGame() {
		return gme;
	}

	public void mousePressed(MouseEvent e) {
		switch (GameState.state) {
			case MENU:
				gme.getMenu().mousePressed(e);
				break;
			case PlAYING:
				gme.getplaying().mousePressed(e);
				break;
			case OPTION:
				gme.getOption().mousePressed(e);
				break;
			default:
				break;

		}

	}

	public void mouseClicked(MouseEvent e) {
		// No state currently needs click-only handling.
	}

	public void mouseReleased(MouseEvent e) {
		switch (GameState.state) {
			case MENU:
				gme.getMenu().mouseReleased(e);
				break;
			case PlAYING:
				gme.getplaying().mouseReleased(e);
				break;
			case OPTION:
				gme.getOption().mouseReleased(e);
				break;
			default:
				break;

		}

	}

	public void setGameState(GameState state) {
		switch (state) {
			case MENU -> gme.getAudioPlayer().playSong(AudioPlayer.MENU);
			case PlAYING -> gme.getAudioPlayer().playSong(AudioPlayer.PLAYING);
			case OPTION -> gme.getAudioPlayer().playSong(AudioPlayer.PLAYING);

		}
		GameState.state = state;

	}
}
