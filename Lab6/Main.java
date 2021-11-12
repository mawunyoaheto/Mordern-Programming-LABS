package Lab6;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> 
		{
			JFrame frame = new BookClubFrame();
			frame.setTitle("Book Club");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//frame.setResizable(false);
			centerFrameOnDesktop(frame);
			frame.setVisible(true);
		});

	}

	public static void centerFrameOnDesktop(Component f) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int height = toolkit.getScreenSize().height;
		int width = toolkit.getScreenSize().width;
		int frameHeight = f.getSize().height;
		int frameWidth = f.getSize().width;
		int xpos = (width - frameWidth) / 2;
		int ypos = (height - frameHeight) / 3;
		f.setLocation(xpos, ypos);
	}
}
