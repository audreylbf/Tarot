import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

/**
 * 
 * @author 33674
 *
 */

public class JFrameSearch extends JFrame{

	JFrameSearchContainer panel;
	
	/**
     * Create the frame.
     */
    
	public JFrameSearch() {
		super();
		propertiesWindow();
	}
	
	private void propertiesWindow() {
		this.setSize(700,500);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		setTitle("SEARCH A CARD");
		panel = new JFrameSearchContainer();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        panel.setLayout(new BorderLayout(0, 0));
		this.setContentPane(panel);
	}
}
