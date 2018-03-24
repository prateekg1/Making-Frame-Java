import javax.swing.JFrame;

public class Frame extends JFrame implements GameConstants {
	
	public Frame() {
		
		
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle(TITLE);
		Board board = new Board();
		add(board);
		setSize(GWIDTH,GHEIGHT);
		setVisible(true);
	}

	public static void main(String[] args) {
		Frame frame = new Frame();
		

	}

}