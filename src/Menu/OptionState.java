package Menu;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import platform2D.game;
import utilz.loadsave;

public class OptionState extends State implements Statemethod {
    public int Char_option = 0;
    private Image Naruto, Sakura, Sasuke, BG, left_Arrow, Right_Arrow, N_Naruto, N_Sakura, N_Sasuke;
    private Rectangle leftArrowBounds, rightArrowBounds;

    public OptionState(game gme) {
        super(gme);
        LoadImage();
        initializeBounds();
    }

    private void initializeBounds() {
        if (left_Arrow != null) {
            int arrow_size = left_Arrow.getWidth(null) / 7;
            leftArrowBounds = new Rectangle(400, 200, arrow_size, arrow_size);
            rightArrowBounds = new Rectangle(700, 200, arrow_size, arrow_size);
        } else {
            leftArrowBounds = new Rectangle(400, 200, 50, 50);
            rightArrowBounds = new Rectangle(700, 200, 50, 50);
        }
    }

    //player characters
    public void LoadImage() {
        Naruto = safeLoadGIF("/Naruto-GIF.gif");
        Sasuke = safeLoadGIF("/Sasuke-GIF.gif");
        Sakura = safeLoadGIF("/Sakura-GIF.gif");
        BG = safeLoadGIF("/BackGround_Office.png");
        left_Arrow = safeLoadGIF("/Left.png");
        Right_Arrow = safeLoadGIF("/Right.png");
        N_Naruto = safeLoadGIF("/Naruto-Uzumaki.png");
        N_Sasuke = safeLoadGIF("/sasuke-Uchiha.png");
        N_Sakura = safeLoadGIF("/sakura-Haruno.png");
    }

    //gif
    private Image safeLoadGIF(String filename) {
        ImageIcon icon = loadsave.getGIF(filename);
        if (icon != null) {
            return icon.getImage();
        }
        System.err.println("OptionState: Failed to load " + filename);
        return null;
    }

    public void update() {
    }

    @Override
    public void draw(Graphics g) {
        if (BG != null) {
            g.drawImage(BG, -100, 0, 736 * 2, 400, null);
        }
        int arrow_size = 50;
        if (left_Arrow != null) {
            arrow_size = left_Arrow.getWidth(null) / 7;
            g.drawImage(left_Arrow, 400, 200, arrow_size, arrow_size, null);
        }
        if (Right_Arrow != null) {
            g.drawImage(Right_Arrow, 700, 200, arrow_size, arrow_size, null);
        }
        Image currentCharImg = null;
        Image currentNameImg = null;
        if (Char_option == 1) {
            currentCharImg = Naruto;
            currentNameImg = N_Naruto;
        } else if (Char_option == 2) {
            currentCharImg = Sasuke;
            currentNameImg = N_Sasuke;
        } else {
            currentCharImg = Sakura;
            currentNameImg = N_Sakura;
        }
        if (currentCharImg != null) {
            int width = currentCharImg.getWidth(null) * 2;
            int height = currentCharImg.getHeight(null) * 2;
            g.drawImage(currentCharImg, 500, 120, width, height, null);
        }
        if (currentNameImg != null) {
            g.drawImage(currentNameImg, 455, 50, 256, 68, null);
        }
    }

    //keyboard events
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            Char_option++;
            if (Char_option > 2) Char_option = 0;
            updateCharacter();
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            Char_option--;
            if (Char_option < 0) Char_option = 2;
            updateCharacter();
        }
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            gme.getAudioPlayer().stopEffects();
            setGameState(GameState.MENU);
        }
    }

    private void updateCharacter() {
        gme.getAudioPlayer().stopEffects();
        gme.getplaying().getPlayer().updateCharOption(Char_option);
        gme.getAudioPlayer().plaEffects(Char_option, 1);
    }


    @Override public void keyReleased(KeyEvent e) {}
    @Override public void mouseMoved(MouseEvent e) {}
    @Override public void mousePressed(MouseEvent e) {
        if (leftArrowBounds != null && leftArrowBounds.contains(e.getPoint())) {
            Char_option++;
            if (Char_option > 2) Char_option = 0;
            updateCharacter();
        } else if (rightArrowBounds != null && rightArrowBounds.contains(e.getPoint())) {
            Char_option--;
            if (Char_option < 0) Char_option = 2;
            updateCharacter();
        }
    }

    public void mouseReleased(MouseEvent e) {}
    public int getCharOption() { return Char_option; }
}
