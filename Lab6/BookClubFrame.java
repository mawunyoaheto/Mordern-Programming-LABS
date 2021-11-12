package Lab6;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSplitPane;


public class BookClubFrame extends JFrame{
	String[] links;
	JList<String> linkList;
	//context for CardLayout



	JPanel cards;
	JPanel buttonBar;
	private JPanel loginPan, viewTitlePanel, addBookPanel;
	private JPanel botPanel;


	public BookClubFrame() {
		setSize(600, 450);

		//		String[] items = {"Item 1", "Item 2", "Item 3"};
		String[] items = {"Login", "View Titles", "Add Book"};
		linkList = new JList<String>(items);				
		createPanels();	
		
		// set up split panes
		JSplitPane splitPane = new JSplitPane(
				JSplitPane.HORIZONTAL_SPLIT, linkList, cards);
		splitPane.setDividerLocation(180);
		//default layout for JFrame is BorderLayout; add method adds to contentpane

		botPanel = new ViewStatusUI().getBotPanel();
		add(splitPane, BorderLayout.CENTER);
		add(botPanel,BorderLayout.SOUTH);
		linkList.setEnabled(false);
		
	}
	


	public void initializeWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Book Club");
		setResizable(false);
	}



	/* Organize panels into a CardLayout */
	public void createPanels() {

		loginPan = new LoginUI().getTextPanel();
		viewTitlePanel = new ViewTitleUI().getViewTitlePanel();
		JPanel panel1 = new JPanel();
		panel1.add(loginPan);

		JPanel panel2 = new JPanel();
		panel2.add(viewTitlePanel);

		JPanel panel3 = new JPanel();
		JLabel label3 = new JLabel("Item 3 Panel");
		panel3.add(label3);


		addBookPanel = new AddBook();

		cards = new JPanel(new CardLayout());
		cards.add(panel1, "Login");
		cards.add(panel2, "View Titles");
		cards.add(addBookPanel, "Add Book");

		//connect JList elements to CardLayout panels
		linkList.addListSelectionListener(event -> {
			String value = linkList.getSelectedValue().toString();
			CardLayout cl = (CardLayout) (cards.getLayout());
			cl.show(cards, value);
		});

	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 8723851416625314922L;

}
