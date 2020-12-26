import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 * 
 * @author 33674
 *
 */

public class JFrameAddContainer extends JPanel {
	
	private JLabel lNameAdd;
	private JLabel lDescriptionAdd;
	private JLabel lPastAdd;
	private JLabel lPresentAdd;
	private JLabel lFuturAdd;
	private JLabel lPictureAdd;
	
	private JTextField textNameAdd;
	
	private JTextArea textDescriptionAdd;
	private JTextArea textPastAdd;
	private JTextArea textPresentAdd;
	private JTextArea textFuturAdd;
	private JTextArea textPictureAdd;
	
	private JButton btnSave;
	
	
	public JFrameAddContainer() {
		
		super();
		this.propertiesJFrameAddContainer();
	}
	
	private void propertiesJFrameAddContainer() {

		this.propLNameAdd();
		this.propLDescriptionAdd();
		this.propLPastAdd();
		this.propLPresentAdd();
		this.propLFuturAdd();
		this.propLPictureAdd();
		
		this.propTextNameAdd();
		this.propTextDescriptionAdd();
		this.propTextPastAdd();
		this.propTextPresentAdd();
		this.propTextFuturAdd();
		this.propTextPictureAdd();
		
		this.propbtnSave();
		
		this.setLayout(null);
	}
	
	
	private void propLNameAdd() {
		
		lNameAdd = new JLabel();
		this.lNameAdd.setText("Name of the card : ");
		this.lNameAdd.setBounds(20,40,200,30);
		this.add(lNameAdd);
		
	}
	
	private void propLDescriptionAdd() {
		
		lDescriptionAdd = new JLabel();
		this.lDescriptionAdd.setText("Description of the card : ");
		this.lDescriptionAdd.setBounds(20,100,200,30);
		this.add(lDescriptionAdd);
		
	}
	
	private void propLPastAdd() {
		
		lPastAdd = new JLabel();
		this.lPastAdd.setText("Past signification : ");
		this.lPastAdd.setBounds(20,160,200,30);
		this.add(lPastAdd);
		
	}
	
	private void propLPresentAdd() {
		
		lPresentAdd = new JLabel();
		this.lPresentAdd.setText("Present signification : ");
		this.lPresentAdd.setBounds(20,220,200,30);
		this.add(lPresentAdd);
		
	}
	
	private void propLFuturAdd() {
		
		lFuturAdd = new JLabel();
		this.lFuturAdd.setText("Futur signification : ");
		this.lFuturAdd.setBounds(20,280,200,30);
		this.add(lFuturAdd);
		
	}
	
	private void propLPictureAdd() {
		
		lPictureAdd = new JLabel();
		this.lPictureAdd.setText("Url de l'image : ");
		this.lPictureAdd.setBounds(20,340,200,30);
		this.add(lPictureAdd);
		
	}
	
	private void propTextNameAdd() {
		
		textNameAdd = new JTextField();
		this.textNameAdd.setBounds(200,40,270,40);
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		this.textNameAdd.setBorder(BorderFactory.createCompoundBorder(border, 
		      BorderFactory.createEmptyBorder(10, 10, 10, 10)));   
		this.add(textNameAdd);
		
	}
	
	private void propTextDescriptionAdd() {
		
		textDescriptionAdd = new JTextArea();
		this.textDescriptionAdd.setBounds(200,110,270,50);
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		this.textDescriptionAdd.setBorder(BorderFactory.createCompoundBorder(border, 
		      BorderFactory.createEmptyBorder(10, 10, 10, 10))); 
		this.add(textDescriptionAdd);
		
	}
	
	private void propTextPastAdd() {
		
		textPastAdd = new JTextArea();
		this.textPastAdd.setBounds(200,170,270,50);
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		this.textPastAdd.setBorder(BorderFactory.createCompoundBorder(border, 
		      BorderFactory.createEmptyBorder(10, 10, 10, 10))); 
		this.add(textPastAdd);
		
	}
	
	private void propTextPresentAdd() {
		
		textPresentAdd = new JTextArea();
		this.textPresentAdd.setBounds(200,230,270,50);
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		this.textPresentAdd.setBorder(BorderFactory.createCompoundBorder(border, 
		      BorderFactory.createEmptyBorder(10, 10, 10, 10))); 
		this.add(textPresentAdd);
		
	}
	
	private void propTextFuturAdd() {
		
		textFuturAdd = new JTextArea();
		this.textFuturAdd.setBounds(200,290,270,50);
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		this.textFuturAdd.setBorder(BorderFactory.createCompoundBorder(border, 
		      BorderFactory.createEmptyBorder(10, 10, 10, 10))); 
		this.add(textFuturAdd);
		
	}
	
	private void propTextPictureAdd() {
		
		textPictureAdd = new JTextArea();
		this.textPictureAdd.setBounds(200,350,270,40);
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		this.textPictureAdd.setBorder(BorderFactory.createCompoundBorder(border, 
		      BorderFactory.createEmptyBorder(10, 10, 10, 10))); 
		this.add(textPictureAdd);
		
	}
	
	private void propbtnSave() {
		
		btnSave = new JButton();
		this.btnSave.setText("SAVE");
		this.btnSave.setBounds(150,450,190,40);
		this.add(btnSave);
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		this.btnSave.setBorder(BorderFactory.createCompoundBorder(border, 
		      BorderFactory.createEmptyBorder(10, 10, 10, 10))); 
		this.add(btnSave);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                System.out.println("Registered card ! You can close the window.");
            }
        });		
	}
	
}
