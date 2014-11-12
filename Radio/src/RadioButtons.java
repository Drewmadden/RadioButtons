import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ButtonGroup;
import java.awt.EventQueue;

public class RadioButtons {

	private JFrame MainFrame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private void initialize() {
		MainFrame = new JFrame();
		MainFrame.setBounds(100, 100, 250, 250);
		MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainFrame.getContentPane().setLayout(null);
		
		JPanel MainPanel = new JPanel();
		MainPanel.setBounds(100, 50, 100, 75);
		MainFrame.getContentPane().add(MainPanel);
		MainPanel.setLayout(null);
		JRadioButton Small = new JRadioButton("Small");
		buttonGroup.add(Small);
		Small.setBounds(0, 0, 85, 20);
		MainPanel.add(Small);
		Small.setSelected(true);
		JRadioButton Medium = new JRadioButton("Medium");
		buttonGroup.add(Medium);
		Medium.setBounds(0, 20, 85, 20);
		MainPanel.add(Medium);
		JRadioButton Large = new JRadioButton("Large");
		buttonGroup.add(Large);
		Large.setBounds(0, 40, 85, 20);
		MainPanel.add(Large);
	}
	public RadioButtons() {
		initialize();
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButtons window = new RadioButtons();
					window.MainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
