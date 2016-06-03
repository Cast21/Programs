package by.cast;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class Image extends JPanel {
	 java.awt.Image img = new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\da.jpg").getImage();
	 public void paint(Graphics g) {
		  g = (Graphics2D) g;
		  g.drawImage(img, 0, 0, null);
	 }
} 
 