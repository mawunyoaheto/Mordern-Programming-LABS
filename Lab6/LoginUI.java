package Lab6;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginUI extends JPanel{
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel loginPanel;
	private JLabel lblLogin;
	private JTextField txtUserName;
	private JTextField txtPassword;
	private JLabel labelUserName;
	private JLabel labelPassword;
	private JButton btnLogin;
	private JPanel textPanel;
	
	
	
	public LoginUI() {
		
		
		loginPanel = new JPanel(new GridBagLayout());

		GridBagConstraints c = new GridBagConstraints();
		c.weightx = 5;
		c.weighty = 30;
		c.ipadx=50;
		c.ipady=10;
		//c.anchor=1;
		//c.fill = GridBagConstraints.HORIZONTAL;

		lblLogin = new JLabel("Login");
		c.gridx = 0;
		c.gridwidth = 1;
		c.gridy = 0;
//		c.ipadx=0;
//				c.ipady=0;
//				
		loginPanel.add(lblLogin, c);


		txtUserName = new JTextField(10);
		c.gridx = 0;
		c.gridwidth = 1;
		c.gridy = 1;
		loginPanel.add(txtUserName, c);

		txtPassword = new JTextField(10);
		c.gridx = 1;
		c.gridwidth = 1;
		c.gridy = 1;
		loginPanel.add(txtPassword, c);	


		labelUserName = new JLabel("Username");
		c.gridx = 0;
		c.gridwidth = 1;
		c.gridy = 2;
		loginPanel.add(labelUserName, c);

		labelPassword = new JLabel("Password");
		c.gridx = 1;
		c.gridwidth = 1;
		c.gridy = 2;
		loginPanel.add(labelPassword, c);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new LoginButtonListener());
		c.gridx = 1;
		c.gridwidth = 1;
		c.gridy = 3;
		loginPanel.add(btnLogin, c);


		labelUserName.setFont(Util.makeSmallFont(labelUserName.getFont()));
		labelPassword.setFont(Util.makeSmallFont(labelPassword.getFont()));


		textPanel = new JPanel();
		textPanel.setLayout(new BorderLayout());
		textPanel.add(loginPanel,BorderLayout.NORTH);
		//textPanel.add(bottomText,BorderLayout.CENTER);
	}

class LoginButtonListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		String userName = txtUserName.getText();
		String pass = txtPassword.getText();
		User login = new User(userName, pass, null);
		if(Data.logins.contains(login))
		{
			for(User u : Data.logins) {
				if (u.equals(login)) {
					System.out.println("Login successful!");
					
				}
					
			}
		}else{
			
			
			System.out.println("Login failed!");
		}
		
		
	}
	
}

	public JPanel getLoginPanel() {
		return loginPanel;
	}



	public JTextField getTxtUserName() {
		return txtUserName;
	}



	public JTextField getTxtPassword() {
		return txtPassword;
	}



	public JPanel getTextPanel() {
		return textPanel;
	}

	
	
}
