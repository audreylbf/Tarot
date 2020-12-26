import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

/**
 * 
 * @author 33674
 *
 */

public class JFrameFutur extends JFrame {
	
	JFrameFuturContainer panel;

	/**
     * Create the frame.
     */
    
	public JFrameFutur() {
		super();
		propertiesWindow();
	}
	
	private void propertiesWindow() {
		this.setSize(600,500);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		setTitle("DISCOVER YOUR FUTUR");
		panel = new JFrameFuturContainer();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        panel.setLayout(new BorderLayout(0, 0));
		this.setContentPane(panel);
	}
}
