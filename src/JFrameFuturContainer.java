import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
/**
 * 
 * @author 33674
 *
 */
public class JFrameFuturContainer extends JPanel {

	private JLabel welcFutur;
	private JButton buttonFirstCard;
	
	public JFrameFuturContainer() {
		
		super();
		this.propertiesJFrameFuturContainer();
	}
	
	private void propertiesJFrameFuturContainer() {
		
		this.propWelcFutur();
		this.propButtonFirstCard();
	}
	
	private void propWelcFutur() {
		
		welcFutur = new JLabel();
		this.welcFutur.setText("Are you ready to discover your future?");
		this.welcFutur.setBounds(190,30,500,30);
		this.add(welcFutur);		
	}
	
	private void propButtonFirstCard() {
		
		buttonFirstCard = new JButton();
		this.buttonFirstCard.setText("Draw the first card");
		this.buttonFirstCard.setBounds(197,70,200,30);
		this.add(buttonFirstCard);	
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		this.buttonFirstCard.setBorder(BorderFactory.createCompoundBorder(border, 
		      BorderFactory.createEmptyBorder(10, 10, 10, 10))); 
		this.add(buttonFirstCard);
	}
}
