import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

/**
 * 
 * @author 33674
 *
 */

public class JFrameAdd extends JFrame{

	JFrameAddContainer panel;
	 
    /**
     * Create the frame.
     */
    
	public JFrameAdd() {
		super();
		propertiesWindow();
	}
	
	private void propertiesWindow() {
		this.setSize(500,610);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		setTitle("ADD A CARD");
		panel = new JFrameAddContainer();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        panel.setLayout(new BorderLayout(0, 0));
		this.setContentPane(panel);
	}
	
}
