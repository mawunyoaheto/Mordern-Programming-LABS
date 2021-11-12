package Lab6;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ViewStatusUI extends JPanel{
	
	private JPanel botPanel;
	private JTextArea txtStatus;


	public ViewStatusUI() {
		
		botPanel=new JPanel();
		botPanel.setLayout(new GridLayout(1,1));
		System.out.println(this.getWidth());
		botPanel.setSize(this.getWidth(), 50);
		txtStatus = new JTextArea();
		txtStatus.setText("Welcome to the Book Club");
		botPanel.add(txtStatus);
		
	}
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public JPanel getBotPanel() {
		return botPanel;
	}



	public JTextArea getTxtStatus() {
		return txtStatus;
	}

	
	
	
}
