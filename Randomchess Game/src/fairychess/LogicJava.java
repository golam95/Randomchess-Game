package fairychess;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Collections;
import java.util.Map;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogicJava extends MovePiece implements MouseListener {
	protected JLabel lbltextplayer, lbltext, lblturn, lblplayerturn, lbltime;
	protected JButton btnnewgame, btnquit, btnabout, btnaboutplayer, btnAboutgame;
	int Player = 0;
	static int hh = 0, mm = 0, ss = 0;
	int ClickCount = 1;
	int flag;
	String strompnentName, labelName;
	private int i = 0, j = 0;

	public LogicJava() {
		this.getBoard().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getBoard().setLayout(null);
		this.getAnotercontainer().setBackground(new Color(128, 0, 0));
		this.getBoard().setSize(980, 580);
		this.getBoardPanel().setSize(470, 445);
		this.getBoardPanel().setLocation(250, 50);
		this.getBoardPanel().setLayout(null);
		this.getBoardPanel().setBackground(Color.black);
		this.getBoardPanel().addMouseListener(this);
		this.getLeftPanel().setSize(244, 543);
		this.getLeftPanel().setLocation(5, 5);
		this.getLeftPanel().setLayout(null);
		this.getLeftPanel().setBackground(new Color(153, 153, 255));

		lbltime = new JLabel();
		lbltime.setSize(130, 100);
		lbltime.setFont(new Font("Calibri", Font.BOLD, 40));
		lbltime.setForeground(Color.green);
		lbltime.setLocation(60, 40);
		lblturn = new JLabel("Turn");
		lblturn.setSize(80, 60);
		lblturn.setLocation(80, 105);
		lblturn.setFont(new Font("Arail", Font.BOLD, 20));
		lblturn.setForeground(Color.RED);
		lblplayerturn = new JLabel();
		lblplayerturn.setSize(200, 60);
		lblplayerturn.setLocation(50, 150);
		lblplayerturn.setFont(new Font("Arail", Font.BOLD, 20));
		lblplayerturn.setForeground(Color.RED);
		this.getLeftPanel().add(lbltime);
		this.getLeftPanel().add(lblturn);
		this.getLeftPanel().add(lblplayerturn);
		// second.add(lbl6);
		// LEFT
		this.getRightPanel().setSize(248, 543);
		this.getRightPanel().setLocation(721, 5);
		this.getRightPanel().setLayout(null);
		this.getRightPanel().setBackground(new Color(153, 153, 255));

		btnnewgame = new JButton("New Game");
		btnnewgame.setSize(150, 45);
		btnnewgame.setLocation(50, 50);
		btnnewgame.setFont(new Font("Arail", Font.BOLD, 18));
		btnnewgame.setBackground(new Color(51, 51, 0));
		btnnewgame.setForeground(Color.white);
		btnnewgame.addActionListener(this);

		btnabout = new JButton("About");
		btnabout.setSize(150, 45);
		btnabout.setLocation(50, 150);
		btnabout.setFont(new Font("Arail", Font.BOLD, 18));
		btnabout.setBackground(new Color(51, 51, 0));
		btnabout.setForeground(Color.white);
		btnabout.addActionListener(this);

		btnquit = new JButton("Quit");
		btnquit.setSize(150, 45);
		btnquit.setLocation(50, 250);
		btnquit.setFont(new Font("Arail", Font.BOLD, 18));
		btnquit.setBackground(new Color(51, 51, 0));
		btnquit.setForeground(Color.white);
		btnquit.addActionListener(this);

		btnaboutplayer = new JButton("About Player");
		btnaboutplayer.setSize(150, 45);
		btnaboutplayer.setLocation(50, 350);
		btnaboutplayer.setFont(new Font("Arail", Font.BOLD, 18));
		btnaboutplayer.setBackground(new Color(51, 51, 0));
		btnaboutplayer.setForeground(Color.white);
		btnaboutplayer.addActionListener(this);

		btnAboutgame = new JButton("About Game");
		btnAboutgame.setSize(150, 45);
		btnAboutgame.setLocation(50, 450);
		btnAboutgame.setFont(new Font("Arail", Font.BOLD, 18));
		btnAboutgame.setBackground(new Color(51, 51, 0));
		btnAboutgame.setForeground(Color.white);
		btnAboutgame.addActionListener(this);

		this.getRightPanel().add(btnAboutgame);
		this.getRightPanel().add(btnaboutplayer);
		this.getRightPanel().add(btnquit);
		this.getRightPanel().add(btnnewgame);
		this.getRightPanel().add(btnabout);

		this.getUpperPanel().setSize(473, 44);
		this.getUpperPanel().setLocation(248, 5);
		this.getUpperPanel().setLayout(null);
		this.getUpperPanel().setBackground(new Color(153, 153, 255));

		lbltext = new JLabel("Random Fairy Chess Game");
		lbltext.setFont(new Font("Arail", Font.BOLD, 25));
		lbltext.setForeground(new Color(153, 0, 153));
		lbltext.setSize(330, 45);
		lbltext.setLocation(60, 5);
		this.getUpperPanel().add(lbltext);

		this.getBottomPanel().setSize(473, 52);
		this.getBottomPanel().setLocation(248, 495);
		this.getBottomPanel().setLayout(null);
		this.getBottomPanel().setBackground(new Color(153, 153, 255));

		lbltextplayer = new JLabel("Two Player");
		lbltextplayer.setFont(new Font("Magncita", Font.BOLD, 25));
		lbltextplayer.setForeground(new Color(153, 0, 153));
		lbltextplayer.setSize(330, 45);
		lbltextplayer.setLocation(165, 5);
		this.getBottomPanel().add(lbltextplayer);
		this.getBoard().setVisible(true);
		this.getAnotercontainer().add(this.getUpperPanel());
		this.getAnotercontainer().add(this.getBottomPanel());
		this.getAnotercontainer().add(this.getRightPanel());
		this.getAnotercontainer().add(this.getLeftPanel());
		this.getAnotercontainer().add(this.getBoardPanel());
		this.getAnotercontainer().addMouseListener(this);
		this.getBoard().setResizable(false);
		this.getBoard().setLocationRelativeTo(null);
		this.getBoard().setTitle("Random Fairy Chess");

	}

	public void showTime() {
		while (true) {
			try {
				Thread.sleep(1000);
				ss++;
				if (ss == 60) {
					mm++;
					ss = 0;
					if (mm == 60) {
						hh++;
						mm = 0;
					}
				}
				//
				this.lbltime.setText("" + hh + ":" + mm + ":" + ss);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.toString());

			}
		}

	}

	public void showBoard() {
		this.getBoard().setVisible(true);
		this.lblplayerturn.setForeground(Color.WHITE);
		this.lblplayerturn.setText("First Player");
	}

	//
	public void createBoard() {
		int x = 0;
		LabelName();
		this.getBoardPanel().setLayout(new GridLayout(8, 8));

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				JPanel panel = new JPanel();
				panel.addMouseListener(this);
				getContainer().add(panel);
				squares[i][j] = panel;
				if (i == 0 && j == 0) {
					squares[i][j].setName("Bord");
				} else {
					squares[i][j].setName("Bord" + x);
				}
				++x;

			}

		}
		panelboard();
	}

	public void Random() {
		int n;
		int x = 0;
		Random rand = new Random();

		for (int i = 0; i < 16; i++) {
			num.add(i + 1);

		}
		Collections.shuffle(num);
		int randNum = rand.nextInt(15) + 1;
		int fairyNum = rand.nextInt(3) + 1;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 8; j++) {
				if (x == randNum) {
					((JLabel) FairyPiece.get(fairyNum)).addMouseListener(this);
					squares[i][j].add((Component) FairyPiece.get(fairyNum));
					squares[i][j].add((Component) FairyPiece.get(fairyNum));

				} else {
					n = (Integer) num.get(x);
					((JLabel) BlackChessbox.get(n)).addMouseListener(this);
					squares[i][j].add((Component) BlackChessbox.get(n));
					squares[i][j].add((Component) BlackChessbox.get(n));
				}
				++x;

			}

		}
		Collections.shuffle(this.num);
		randNum = rand.nextInt(15) + 1;
		fairyNum = rand.nextInt(3) + 1;

		x = 0;
		for (int i = 6; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (x == randNum) {
					((JLabel) this.FairyPieceWhite.get(fairyNum)).addMouseListener(this);
					this.squares[i][j].add((Component) this.FairyPieceWhite.get(fairyNum));

				} else {
					n = (Integer) num.get(x);
					((JLabel) Whitebox.get(n)).addMouseListener(this);
					squares[i][j].add((Component) Whitebox.get(n));

				}
				++x;

			}

		}
	}

	private void panelboard() {

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if ((i + j) % 2 == 0) {
					this.squares[i][j].setBackground(Color.gray);

				} else {
					this.squares[i][j].setBackground(new Color(165, 42, 42));
				}

				this.getBoardPanel().add(squares[i][j]);

			}

		}

	}

	//
	public void Check() {
		boolean t = false;

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (this.str == this.squares[i][j].getName()) {
					distX = i;
					distY = j;
					t = true;
					break;
				}

			}
			if (t)
				break;

		}
	}

	//
	@Override
	public void mouseClicked(MouseEvent e) {
		this.str = null;
		this.trace = 0;
		if (this.ClickCount == 1) {
			this.labelName = ((Component) e.getSource()).getName();

		} else {
			this.strompnentName = ((Component) e.getSource()).getName();
		}
		panelboard();
		if (this.ClickCount == 1) {
			this.str = ((Component) e.getSource()).getParent().getName();
			if (this.Player == 1) {
				System.out.println("Player 2");
				if (e.getSource() == this.label16) {
					ClickCount = 0;
					Check();
					BlackKingMove();
					squares[distX][distY].setBackground(Color.blue);
				} else if (e.getSource() == label15) {
					ClickCount = 0;
					Check();
					BlackBishopMove();
					BlackRookMove();
				} else if (e.getSource() == label13 || e.getSource() == label14) {
					ClickCount = 0;
					Check();
					BlackBishopMove();
				} else if (e.getSource() == label11 || e.getSource() == label12) {
					ClickCount = 0;
					Check();
					BlackRookMove();
				} else if (e.getSource() == label9 || e.getSource() == label10) {
					ClickCount = 0;
					Check();
					BlackKnightMove();
				} else if (e.getSource() == this.blackPrincess) {
					ClickCount = 0;
					Check();
					BlackBishopMove();
					BlackKnightMove();
				} else if (e.getSource() == this.blackEmpress) {
					ClickCount = 0;
					Check();
					BlackRookMove();
					BlackKnightMove();
				} else if (e.getSource() == blackGrashoper) {
					ClickCount = 0;
					Check();
					WhiteKnightMove();
					BlackBishopMove();

				} else if (e.getSource() == label1 || e.getSource() == label2 || e.getSource() == label3
						|| e.getSource() == label4 || e.getSource() == label5 || e.getSource() == label6
						|| e.getSource() == label7 || e.getSource() == label8) {
					ClickCount = 0;
					Check();
					BlackPawn();

				}
			} else if (e.getSource() == this.lbl16) {
				ClickCount = 0;
				Check();
				WhiteKingMove();
				squares[distX][distY].setBackground(Color.blue);
			} else if (e.getSource() == lbl15) {
				ClickCount = 0;
				Check();
				WhiteBishopMove();
				WhiteRookMove();
			} else if (e.getSource() == this.lbl13 || e.getSource() == this.lbl14) {
				ClickCount = 0;
				Check();
				WhiteBishopMove();
			} else if (e.getSource() == this.lbl11 || e.getSource() == this.lbl12) {
				ClickCount = 0;
				Check();
				WhiteRookMove();
			} else if (e.getSource() == this.lbl9 || e.getSource() == this.lbl10) {
				ClickCount = 0;
				Check();
				WhiteKnightMove();
			} else if (e.getSource() == this.whitePrincess) {
				ClickCount = 0;
				Check();
				WhiteBishopMove();
				WhiteKnightMove();
			} else if (e.getSource() == this.whiteEmpress) {
				ClickCount = 0;
				Check();
				WhiteRookMove();
				WhiteKnightMove();
			} else if (e.getSource() == whiteGrashoper) {
				ClickCount = 0;
				Check();
				WhiteKnightMove();
				BlackBishopMove();
			} else if (e.getSource() == this.lbl1 || e.getSource() == this.lbl2 || e.getSource() == this.lbl3
					|| e.getSource() == this.lbl4 || e.getSource() == this.lbl5 || e.getSource() == this.lbl6
					|| e.getSource() == this.lbl7 || e.getSource() == this.lbl8) {
				ClickCount = 0;
				Check();
				WhitePawn();
			}
		} else {
			str = ((Component) e.getSource()).getParent().getName();
			flag = 0;
			Value = null;
			if (Player == 0) {
				BlackPiece();
				if (flag == 1) {
					Remove();

					for (int i = 0; i < this.vector.size(); i++) {
						if (str == vector.get(i)) {
							squares[distX][distY].add((Component) this.Whitelabels.get(this.labelName));
							Player();
							break;
						}

					}
				} else {

					for (int x = 0; x < 8; x++) {
						for (int y = 0; y < 8; y++) {
							if (this.squares[x][y].getName() == this.strompnentName) {
								this.distX = x;
								this.distY = y;
								break;
							}

						}

					}
					this.ReplaceWhite();
				}
			} else {
				this.WhitePiece();
				if (this.flag == 1) {
					this.Remove();
					for (int i = 0; i < this.vector.size(); i++) {
						if (this.str == this.vector.get(i)) {
							this.squares[this.distX][this.distY].add((Component) this.Blacklabels.get(this.labelName));
							this.Player();
							break;
						}

					}

				} else {

					for (int x = 0; x < 8; x++) {
						for (int y = 0; y < 8; y++) {
							if (squares[x][y].getName() == strompnentName) {
								distX = x;
								distY = y;
								break;
							}

						}

					}
					ReplaceBlack();
				}
			}

			ClickCount = 1;

			vector.clear();
			distX = 0;
			distY = 0;
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {

	}

	@Override
	public void mousePressed(MouseEvent arg0) {

	}

	@Override
	public void mouseExited(MouseEvent arg0) {

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {

	}

	private void BlackPiece() {
		for (Map.Entry entry : Blacklabels.entrySet()) {
			String key = (String) entry.getKey();
			Value = (JLabel) entry.getValue();
			if (strompnentName != key)
				continue;
			this.flag = 1;
			break;
		}
	}

	private void WhitePiece() {
		for (Map.Entry entry : Whitelabels.entrySet()) {
			String key = (String) entry.getKey();
			Value = (JLabel) entry.getValue();
			if (strompnentName != key)
				continue;
			flag = 1;
			break;
		}
	}

	private void Remove() {

		for (int x = 0; x < 8; x++) {
			for (int y = 0; y < 8; y++) {
				if (squares[x][y].getName() == str) {
					distX = x;
					distY = y;
					squares[distX][distY].remove(Value);

					break;
				}

			}

		}
	}

	private void ReplaceWhite() {

		for (int i = 0; i < vector.size(); i++) {
			if (strompnentName == vector.get(i)) {
				squares[distX][distY].add((Component) Whitelabels.get(labelName));
				Player();
				break;
			}

		}
	}

	private void ReplaceBlack() {
		for (int i = 0; i < vector.size(); i++) {
			if (strompnentName == vector.get(i)) {
				squares[distX][distY].add((Component) Blacklabels.get(labelName));
				Player();
				break;
			}

		}
	}

	private void Player() {

		if (Player == 1) {
			Player = 0;
			lblplayerturn.setForeground(Color.WHITE);
			lblplayerturn.setText("First Player");

		} else {
			Player = 1;
			lblplayerturn.setForeground(Color.BLACK);
			lblplayerturn.setText("Second Player");
		}
	}

	public void run() {
		// TODO Auto-generated method stub

	}

}
