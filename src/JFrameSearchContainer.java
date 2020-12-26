import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
/**
 * 
 * @author 33674
 *
 */
public class JFrameSearchContainer extends JPanel {
	
	public static String nameOfCard;
	public static String descriptionOfCard;
	public static String imageOfCard;
	private JLabel searchSentence;
	private JTextField searchName;
	private JButton searchResults;
	
	private JFrameSearchTrue panelSearchTrue = new JFrameSearchTrue();

	public JFrameSearchContainer() {
		
		super();
		this.propertiesJFrameSearchContainer();
	}
	
	private void propertiesJFrameSearchContainer() {
		
		this.propSearchName();
		this.propSearchSentence();
		this.propSearchResults();
	}
	
	private void propSearchSentence() {
		
		searchSentence = new JLabel();
		this.searchSentence.setText("Enter the name of the card you want to search for. ");
		this.searchSentence.setBounds(190,40,500,30);
		this.add(searchSentence);		
	}
	
	private void propSearchName() {
		
		searchName = new JTextField();
		this.searchName.setBounds(200,80,270,40);
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		this.searchName.setBorder(BorderFactory.createCompoundBorder(border, 
		      BorderFactory.createEmptyBorder(10, 10, 10, 10)));   
		this.add(searchName);		
	}
	
	
	private void propSearchResults() {
		
		searchResults = new JButton();
		this.searchResults.setText("SEARCH");
		this.searchResults.setBounds(300,130,70,35);
		this.add(searchResults);
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		this.searchResults.setBorder(BorderFactory.createCompoundBorder(border, 
		      BorderFactory.createEmptyBorder(10, 10, 10, 10))); 
		this.add(searchResults);
		/*
		 * By clicking on the button, a window will open with the card features and two buttons:
		 * Edit this card and Delete this card.
		 */
		searchResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valueOfSearch = searchName.getText();
				/*
				 * We will look for the card in the package whose name is the one entered by the user.
				 */
				for(Cards card : Deck.getDeck()) {
					nameOfCard =card.getName();
					descriptionOfCard = card.getDescription();
					imageOfCard = card.getImage();
					@SuppressWarnings("unused")
					boolean nameValid;
					if(nameOfCard.equalsIgnoreCase(valueOfSearch)) {
						nameValid = true;

						System.out.println("This card exists !");
						@SuppressWarnings("unused")
						Cards matchedCard = card;
						panelSearchTrue.setVisible(true);
					} else {
						nameValid = false;
						System.out.println("This card doesn't exist. Try another name.");
					}
				}
            }
        });		
	}
	
	

}
