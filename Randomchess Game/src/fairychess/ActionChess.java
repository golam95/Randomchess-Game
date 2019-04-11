package fairychess;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ActionChess extends LogicJava implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		int n;
		if (e.getSource() == btnnewgame) {
			this.getBoard().dispose();
			ActionChess MainBoard = new ActionChess();
		

		}
      if (e.getSource() == btnquit) {

			n = JOptionPane.showConfirmDialog(null, "Do you want to Exit  ?");

			if (n == 0) {

				System.exit(1);
		}

		} else if (e.getSource() == btnabout) {
			JOptionPane.showMessageDialog(null, "Author : Md. Golam " + "Nobi Sheikh." + "\n"
					+ "Create Game : 25/04/2016. " + "\n" + "Uneversity :" + " Daffodil Internation Academy. " + "\n");

		} else if (e.getSource() == btnaboutplayer) {
			JOptionPane.showMessageDialog(null, "First Player : White." + "\n" + "Second Player :" + " Black." + "\n"
					+ "First Turn For The First Player : White." + "\n" + "After First  Click Than The Turn For "
					+ "The Second Player : Black." + "\n" + "Enjoy The " + "Fairy Chess Game." + "\n");

		} else if (e.getSource() == btnAboutgame) {

			JOptionPane.showMessageDialog(null, "At First The Piece " + "Random and Add Fairy Chess piecess");

		}
		//
	}

}
