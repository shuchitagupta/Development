//mdm

package matchState.entities.Interfaces;

import gui.MyPanel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import matchState.entities.CoOrdinates;
import matchState.entities.Player;

public interface AttackerLine {
	public void drawLine(Graphics2D g2d);
	public CoOrdinates getStart();
	public void drawPlayer(Graphics g, BufferedImage img , MyPanel panel);
	public void moveDown();
	public void moveUp();
	public int getNoOfPlayers();
	public void setDy(double d);
	public ArrayList<Player> getPlayers();
}
