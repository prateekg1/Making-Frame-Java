import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements GameConstants{
private int x = 10;
int speed ;
	public Board() {
	setSize(GWIDTH,GHEIGHT);
	setBackground(Color.BLACK);
}

}