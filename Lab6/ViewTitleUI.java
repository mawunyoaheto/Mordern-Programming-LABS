package Lab6;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ViewTitleUI extends JPanel{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel viewTitlePanel;
	private JScrollPane mainScroll;
	private DefaultListModel<String> listModel = new DefaultListModel<String>();
	private JList<String> viewTitleList;

	public ViewTitleUI() {
		
		viewTitlePanel=new JPanel();
		viewTitlePanel.setLayout(new BorderLayout());
		viewTitleList = createJList();
		viewTitleList.setFixedCellWidth(70);
		mainScroll = new JScrollPane(viewTitleList);
//		mainScroll.setPreferredSize(
//			new Dimension(mainScroll.getWidth() + 1, mainScroll.getHeight()));
		
		JPanel labelTitle = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel titleLabel = new JLabel("View Titles");
		labelTitle.add(titleLabel);
		
		JPanel jListPanel = new JPanel();
		jListPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		jListPanel.add(mainScroll);
		
		viewTitlePanel.add(jListPanel, BorderLayout.CENTER);
		viewTitlePanel.add(titleLabel,BorderLayout.NORTH);
	}

	
	private void initializeModel(List<String> vals) {
		for(String s : vals){
			listModel.addElement(s);
		}
	}

	private JList<String> createJList() {
		JList<String> ret = new JList<String>(listModel);
		ret.setVisibleRowCount(4);
		return ret;
	}


	public JPanel getViewTitlePanel() {
		return viewTitlePanel;
	}
	
	
}
