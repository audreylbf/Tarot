import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author 33674
 *
 */

public class WindowContainer extends JPanel{
	
	private JButton buttonAdd;
	private JButton buttonSearch;
	private JButton buttonFutur;
	private JLabel welcLabel;
	
	private JFrameAdd panelAdd = new JFrameAdd();
	private JFrameSearch panelSearch = new JFrameSearch();
	private JFrameFutur panelFutur = new JFrameFutur();
	
	public WindowContainer() {
		
		super();
		this.propertiesContainer();
	}
	
	private void propertiesContainer() {

		this.propLabelWelc();
		this.propButtonAdd();
		this.propButtonSearch();
		this.propButtonFutur();
		this.setLayout(null);
	}
	
	private void propLabelWelc() {
		
		welcLabel = new JLabel();
		this.welcLabel.setText("Welcome to the tarot game interface !");
		this.welcLabel.setBounds(180,10,500,50);
		this.add(welcLabel);
		
	}
	
	private void propButtonFutur() {
		
		buttonFutur = new JButton();
		this.buttonFutur.setText("DISCOVER YOUR FUTURE");
		this.buttonFutur.setBounds(200,60,190,50);
		this.add(buttonFutur);
		buttonFutur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                System.out.println("Are you ready to discover your future?");
                panelFutur.setVisible(true);
            }
        });
	}
	
	private void propButtonAdd() {
		
		buttonAdd = new JButton();
		this.buttonAdd.setText("Add a card");
		this.buttonAdd.setBounds(150,140,130,50);
		this.add(buttonAdd);
		buttonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                System.out.println("Add a card !");
                panelAdd.setVisible(true);
            }
        });
		
	}
		
	private void propButtonSearch() {
		
		buttonSearch = new JButton();
		this.buttonSearch.setText("Search a card");
		this.buttonSearch.setBounds(300,140,130,50);
		this.add(buttonSearch);
		buttonSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                System.out.println("Search a card !");
                panelSearch.setVisible(true);
            }
        });
		
	}
	
}
