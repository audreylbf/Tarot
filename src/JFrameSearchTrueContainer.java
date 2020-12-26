import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * 
 * @author 33674
 *
 */
public class JFrameSearchTrueContainer extends JPanel {

	private JLabel nameCard;
	private JLabel descriptionCard;
	private Image imageCard;
	private JButton buttonEdit;
	private JButton buttonDelete;
	
	public JFrameSearchTrueContainer() {
		
		super();
		this.propertiesJFrameSearchTrueContainer();
	}
	
	private void propertiesJFrameSearchTrueContainer() {
		
		this.propNameCard();
		this.propDescriptionCard();
		this.propImageCard();
		this.propButtonEdit();
		this.propButtonDelete();
	}
	
	private void propNameCard() {
		
		nameCard = new JLabel();
		this.nameCard.setText(JFrameSearchContainer.nameOfCard);
		this.nameCard.setBounds(190,40,500,30);
		this.add(nameCard);		
	}
	
	private void propDescriptionCard() {
		
		descriptionCard = new JLabel();
		this.descriptionCard.setText(JFrameSearchContainer.descriptionOfCard);
		this.descriptionCard.setBounds(190,240,500,30);
		this.add(descriptionCard);		
	}
	
	private void propImageCard() {	
	}
	
	private void propButtonEdit() {
		
		buttonEdit = new JButton();
		this.buttonEdit.setText("Edit this card");
		this.buttonEdit.setBounds(190,400,130,50);
		this.add(buttonEdit);
		
	}
	
	private void propButtonDelete() {
		
		buttonDelete = new JButton();
		this.buttonDelete.setText("Delete this card");
		this.buttonDelete.setBounds(190,500,130,50);
		this.add(buttonDelete);
	}
}
