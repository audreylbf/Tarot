import javax.swing.JFrame;

/**
 * 
 * @author 33674
 *
 */

public class Window extends JFrame{
	
	WindowContainer panel;
	
	public Window() {
		super();
		propertiesWindow();
	}
	
	private void propertiesWindow() {
		this.setSize(600,350);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		setTitle("TAROT GAME");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new WindowContainer();
		this.setContentPane(panel);
	}
}
