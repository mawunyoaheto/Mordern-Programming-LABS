package Lab6;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddBook extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField txtFirstName = new JTextField(15);
	private JTextField txtLastName = new JTextField(15);
	private JTextField txtBookTitle = new JTextField(15);
	
	private JFrame parentFrame;

	public AddBook() {
	
	
	setLayout(new BorderLayout());
	JLabel lblTitle = new JLabel("Add Book Title");
	add(lblTitle, BorderLayout.NORTH);

	JPanel pnlAdd = new JPanel(); 
	pnlAdd.setLayout(new GridBagLayout());  

	GridBagConstraints c = new GridBagConstraints();
	c.gridwidth = 1;
	
	c.weightx = 0.5;
	//c.weighty = 0.1;
	
//	c.ipadx=1;
//	c.ipady=1;
	
	
	//left 
	c.gridx=1;
	c.gridy=0;
	pnlAdd.add(new JLabel("Author First Name"), c);
	
	c.gridy=1;
	pnlAdd.add(new JLabel("Author Last Name"), c);
	
	c.gridy=2;
	pnlAdd.add(new JLabel("Book Title"), c);
	
	c.gridx=2;
	c.gridy=0;
	pnlAdd.add(txtFirstName, c);
	
	c.gridy=1;
	pnlAdd.add(txtLastName, c);

	
	c.gridy=2;
	pnlAdd.add(txtBookTitle, c);

	
	c.gridx=2;
	c.gridy=3;
	JButton btnAdd = new JButton("Add Author");
	btnAdd.addActionListener(new AddAuthorButtonListener());
	pnlAdd.add(btnAdd, c);

	//pnlNorth.add(pnlAdd, BorderLayout.NORTH);
	add(pnlAdd, BorderLayout.CENTER);
	
	}
	
	
	class AddAuthorButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String fName = txtFirstName.getText();
			String lName = txtLastName.getText();
			String bkTitle = txtBookTitle.getText();

			if(fName.trim().length() == 0 || 
					lName.trim().length() == 0 ||
					bkTitle.trim().length() == 0 )
					
				JOptionPane.showMessageDialog(parentFrame, "Each author information should not be empty", "Message",  JOptionPane.WARNING_MESSAGE);
			else
			{
				try {
					
					JOptionPane.showMessageDialog(parentFrame,"Successful added", "Message",  JOptionPane.INFORMATION_MESSAGE);
					
					clearAllText();
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(parentFrame, ex.getMessage(), "Message",  JOptionPane.ERROR_MESSAGE);
					ex.printStackTrace();
				}
			}
		}
		
		
	}

	
	private void clearAllText() {
		txtFirstName.setText("");
		txtLastName.setText("");
		txtBookTitle.setText("");
	}
}
