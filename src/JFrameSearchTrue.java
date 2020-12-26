import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

public class JFrameSearchTrue extends JFrame {
	JFrameSearchTrueContainer panel;
	
	/**
     * Create the frame.
     */
    
	public JFrameSearchTrue() {
		super();
		propertiesWindow();
	}
	/*A REFAIRE*/
	private void propertiesWindow() {
		this.setSize(800,800);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		setTitle("CARD SOUGHT");
		panel = new JFrameSearchTrueContainer();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        panel.setLayout(new BorderLayout(0, 0));
		this.setContentPane(panel);
	}
}
