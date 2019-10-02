package gamepackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Board extends JPanel implements KeyListener{

    private final int B_WIDTH = 400;
    private final int B_HEIGHT = 300;
    private final int DELAY = 15;
	private Player player;
	private boolean ingame;
	public Board() {
		initBoard();
	}
	private void initBoard() {
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
		addKeyListener(new TAdapter());
		setFocusable(true);
        setBackground(Color.BLACK);
        ingame = true;
    	player = new Player(10,10);
	}
	
	private void drawObjects(Graphics g) {

        if (player.isVisible()) {
            g.drawImage(player.getImage(), player.getX(), player.getY(),
                    this);
        }
        g.setColor(Color.WHITE);
        g.drawString("Allen was here", 5, 15);

        
	}
	public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (ingame) {
            drawObjects(g);
        } 

        Toolkit.getDefaultToolkit().sync();
    }
	
	public void keyTyped(KeyEvent e) {
		setBackground(Color.GREEN);
	}
	
	public void keyPressed(KeyEvent e) {
		setBackground(Color.WHITE);
	}
	
	public void keyReleased(KeyEvent e) {
		
	}
	
	/*public void actionPerformed(KeyEvent e) {
        //updatePlayer();
        //repaint();
		setBackground(Color.WHITE);
	}
	
     
    private void updatePlayer() {

        if (player.isVisible()) {
            player.move();
        }
    }
	*/
    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            player.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            player.keyPressed(e);
        }
        
    }

}