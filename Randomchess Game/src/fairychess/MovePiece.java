package fairychess;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class MovePiece extends AbstractChess implements ActionListener  {
	protected String str;
	protected JLabel Value;
	protected Vector<String> vector = new Vector();
	protected JPanel[][] squares = new JPanel[8][8];
	protected ArrayList<Integer> num = new ArrayList();
	private JFrame Board = new JFrame();
	private Container container = this.Board.getContentPane();
	private Container anotercontainer = this.Board.getContentPane();
	protected JPanel boardPanel = new JPanel();
	protected JPanel leftPanel = new JPanel();
	protected JPanel rightPanel = new JPanel();
	protected JPanel upperPanel = new JPanel();
	protected JPanel bottomPanel = new JPanel();
	protected int distX, distY;
	protected int trace;
	protected int a, b, c, d;

	public JFrame getBoard() {// Encapsoluation
		return Board;
	}

	public JPanel getUpperPanel() {
		return upperPanel;
	}

	public void setUpperPanel(JPanel upperPanel) {
		this.upperPanel = upperPanel;
	}

	public void setBoard(JFrame board) {
		Board = board;
	}

	public Container getContainer() {
		return container;
	}

	public void setContainer(Container container) {
		this.container = container;
	}

	public Container getAnotercontainer() {
		return anotercontainer;
	}

	public void setAnotercontainer(Container anotercontainer) {
		this.anotercontainer = anotercontainer;
	}

	public JPanel getBoardPanel() {
		return boardPanel;
	}

	public void setBoardPanel(JPanel boardPanel) {
		this.boardPanel = boardPanel;
	}

	public JPanel getLeftPanel() {
		return leftPanel;
	}

	public void setLeftPanel(JPanel leftPanel) {
		this.leftPanel = leftPanel;
	}

	public JPanel getRightPanel() {
		return rightPanel;
	}

	public void setRightPanel(JPanel rightPanel) {
		this.rightPanel = rightPanel;
	}

	public JPanel getBottomPanel() {
		return bottomPanel;
	}

	public void setBottomPanel(JPanel bottomPanel) {
		this.bottomPanel = bottomPanel;
	}

	JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12, label13,
			label14, label15, label16, blackPrincess, blackEmpress, blackGrashoper;
	JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, lbl10, lbl11, lbl12, lbl13, lbl14, lbl15, lbl16,
			whitePrincess, whiteEmpress, whiteGrashoper;

	Map<Integer, JLabel> FairyPiece;
	Map<Integer, JLabel> FairyPieceWhite;
	Map<Integer, JLabel> BlackChessbox;
	Map<Integer, JLabel> Whitebox;
	Map<String, JLabel> Blacklabels;
	Map<String, JLabel> Whitelabels;

	MovePiece() {
		label1 = new JLabel(new ImageIcon(getClass().getResource("/BlackPawn.png")));
		label2 = new JLabel(new ImageIcon(getClass().getResource("/BlackPawn.png")));
		label3 = new JLabel(new ImageIcon(getClass().getResource("/BlackPawn.png")));
		label4 = new JLabel(new ImageIcon(getClass().getResource("/BlackPawn.png")));
		label5 = new JLabel(new ImageIcon(getClass().getResource("/BlackPawn.png")));
		label6 = new JLabel(new ImageIcon(getClass().getResource("/BlackPawn.png")));
		label7 = new JLabel(new ImageIcon(getClass().getResource("/BlackPawn.png")));
		label8 = new JLabel(new ImageIcon(getClass().getResource("/BlackPawn.png")));
		label9 = new JLabel(new ImageIcon(getClass().getResource("/BlackKnight.png")));
		label10 = new JLabel(new ImageIcon(getClass().getResource("/BlackKnight.png")));
		label11 = new JLabel(new ImageIcon(getClass().getResource("/BlackRook.png")));
		label12 = new JLabel(new ImageIcon(getClass().getResource("/BlackRook.png")));
		label13 = new JLabel(new ImageIcon(getClass().getResource("/BlackBishop.png")));
		label14 = new JLabel(new ImageIcon(getClass().getResource("/BlackBishop.png")));
		label15 = new JLabel(new ImageIcon(getClass().getResource("/BlackKing.png")));
		label16 = new JLabel(new ImageIcon(getClass().getResource("/BlackQueen.png")));
		blackPrincess = new JLabel(new ImageIcon(getClass().getResource("/Chess_adl45.svg.png")));
		blackEmpress = new JLabel(new ImageIcon(getClass().getResource("/44px-Chess_cdl45.svg.png")));
		blackGrashoper = new JLabel((new ImageIcon(getClass().getResource("/45px-Chess_gdt45.svg.png"))));

		lbl1 = new JLabel(new ImageIcon(getClass().getResource("/WhitePawn.png")));
		lbl2 = new JLabel(new ImageIcon(getClass().getResource("/WhitePawn.png")));
		lbl3 = new JLabel(new ImageIcon(getClass().getResource("/WhitePawn.png")));
		lbl4 = new JLabel(new ImageIcon(getClass().getResource("/WhitePawn.png")));
		lbl5 = new JLabel(new ImageIcon(getClass().getResource("/WhitePawn.png")));
		lbl6 = new JLabel(new ImageIcon(getClass().getResource("/WhitePawn.png")));
		lbl7 = new JLabel(new ImageIcon(getClass().getResource("/WhitePawn.png")));
		lbl8 = new JLabel(new ImageIcon(getClass().getResource("/WhitePawn.png")));
		lbl9 = new JLabel(new ImageIcon(getClass().getResource("/WhiteKnight.png")));
		lbl10 = new JLabel(new ImageIcon(getClass().getResource("/WhiteKnight.png")));
		lbl11 = new JLabel(new ImageIcon(getClass().getResource("/WhiteRook.png")));
		lbl12 = new JLabel(new ImageIcon(getClass().getResource("/WhiteRook.png")));
		lbl13 = new JLabel(new ImageIcon(getClass().getResource("/WhiteBishop.png")));
		lbl14 = new JLabel(new ImageIcon(getClass().getResource("/WhiteBishop.png")));
		lbl15 = new JLabel(new ImageIcon(getClass().getResource("/WhiteKing.png")));
		lbl16 = new JLabel(new ImageIcon(getClass().getResource("/WhiteQueen.png")));
		whitePrincess = new JLabel(new ImageIcon(getClass().getResource("/45px-Chess_alt45.svg.png")));
		whiteEmpress = new JLabel(new ImageIcon(getClass().getResource("/44px-Chess_cld45.svg.png")));
		whiteGrashoper = new JLabel((new ImageIcon(getClass().getResource("/45px-Chess_glt45.svg.png"))));

		FairyPiece = new HashMap<Integer, JLabel>();
		FairyPiece.put(1, this.blackPrincess);
		FairyPiece.put(2, this.blackEmpress);
		FairyPiece.put(3, this.blackGrashoper);
		FairyPieceWhite = new HashMap<Integer, JLabel>();
		FairyPieceWhite.put(1, this.whitePrincess);
		FairyPieceWhite.put(2, this.whiteEmpress);
		FairyPieceWhite.put(3, this.whiteGrashoper);

		BlackChessbox = new HashMap<Integer, JLabel>();
		BlackChessbox.put(1, this.label1);
		BlackChessbox.put(2, this.label2);
		BlackChessbox.put(3, this.label3);
		BlackChessbox.put(4, this.label4);
		BlackChessbox.put(5, this.label5);
		BlackChessbox.put(6, this.label6);
		BlackChessbox.put(7, this.label7);
		BlackChessbox.put(8, this.label8);
		BlackChessbox.put(9, this.label9);
		BlackChessbox.put(10, this.label10);
		BlackChessbox.put(11, this.label11);
		BlackChessbox.put(12, this.label12);
		BlackChessbox.put(13, this.label13);
		BlackChessbox.put(14, this.label14);
		BlackChessbox.put(15, this.label15);
		BlackChessbox.put(16, this.label16);
		BlackChessbox.put(17, this.blackEmpress);
		BlackChessbox.put(18, this.blackPrincess);
		BlackChessbox.put(19, this.blackGrashoper);

		this.Whitebox = new HashMap<Integer, JLabel>();
		this.Whitebox.put(1, this.lbl1);
		this.Whitebox.put(2, this.lbl2);
		this.Whitebox.put(3, this.lbl3);
		this.Whitebox.put(4, this.lbl4);
		this.Whitebox.put(5, this.lbl5);
		this.Whitebox.put(6, this.lbl6);
		this.Whitebox.put(7, this.lbl7);
		this.Whitebox.put(8, this.lbl8);
		this.Whitebox.put(9, this.lbl9);
		this.Whitebox.put(10, this.lbl10);
		this.Whitebox.put(11, this.lbl11);
		this.Whitebox.put(12, this.lbl12);
		this.Whitebox.put(13, this.lbl13);
		this.Whitebox.put(14, this.lbl14);
		this.Whitebox.put(15, this.lbl15);
		this.Whitebox.put(16, this.lbl16);
		this.Whitebox.put(17, this.whiteEmpress);
		this.Whitebox.put(18, this.whitePrincess);
		this.Whitebox.put(19, this.whiteGrashoper);

		this.Blacklabels = new HashMap<String, JLabel>();
		this.Blacklabels.put("label", this.label1);
		this.Blacklabels.put("label2", this.label2);
		this.Blacklabels.put("label3", this.label3);
		this.Blacklabels.put("label4", this.label4);
		this.Blacklabels.put("label5", this.label5);
		this.Blacklabels.put("label6", this.label6);
		this.Blacklabels.put("label7", this.label7);
		this.Blacklabels.put("label8", this.label8);
		this.Blacklabels.put("label9", this.label9);
		this.Blacklabels.put("label10", this.label10);
		this.Blacklabels.put("label11", this.label11);
		this.Blacklabels.put("label12", this.label12);
		this.Blacklabels.put("label13", this.label13);
		this.Blacklabels.put("label14", this.label14);
		this.Blacklabels.put("label15", this.label15);
		this.Blacklabels.put("label16", this.label16);
		this.Blacklabels.put("label17", this.blackPrincess);
		this.Blacklabels.put("label18", this.blackEmpress);
		this.Blacklabels.put("label19", this.blackGrashoper);

		this.Whitelabels = new HashMap<String, JLabel>();
		this.Whitelabels.put("label20", this.lbl1);
		this.Whitelabels.put("label21", this.lbl2);
		this.Whitelabels.put("label22", this.lbl3);
		this.Whitelabels.put("label23", this.lbl4);
		this.Whitelabels.put("label24", this.lbl5);
		this.Whitelabels.put("label25", this.lbl6);
		this.Whitelabels.put("label26", this.lbl7);
		this.Whitelabels.put("label27", this.lbl8);
		this.Whitelabels.put("label28", this.lbl9);
		this.Whitelabels.put("label29", this.lbl10);
		this.Whitelabels.put("label30", this.lbl11);
		this.Whitelabels.put("label31", this.lbl12);
		this.Whitelabels.put("label32", this.lbl13);
		this.Whitelabels.put("label33", this.lbl14);
		this.Whitelabels.put("label34", this.lbl15);
		this.Whitelabels.put("label35", this.lbl16);
		this.Whitelabels.put("label36", this.whiteEmpress);
		this.Whitelabels.put("label37", this.whitePrincess);
		this.Whitelabels.put("label38", this.whiteGrashoper);

	}

	public void LabelName() {
		label1.setName("label");
		label2.setName("label2");
		label3.setName("label3");
		label4.setName("label4");
		label5.setName("label5");
		label6.setName("label6");
		label7.setName("label7");
		label8.setName("label8");
		label9.setName("label9");
		label10.setName("label10");
		label11.setName("label11");
		label12.setName("label12");
		label13.setName("label13");
		label14.setName("label14");
		label15.setName("label15");
		label16.setName("label16");
		blackPrincess.setName("label17");
		blackEmpress.setName("label18");
		blackGrashoper.setName("label19");
		lbl1.setName("label20");
		lbl2.setName("label21");
		lbl3.setName("label22");
		lbl4.setName("label23");
		lbl5.setName("label24");
		lbl6.setName("label25");
		lbl7.setName("label26");
		lbl8.setName("label27");
		lbl9.setName("label28");
		lbl10.setName("label29");
		lbl11.setName("label30");
		lbl12.setName("label31");
		lbl13.setName("label32");
		lbl14.setName("label33");
		lbl15.setName("label34");
		lbl16.setName("label35");
		whiteEmpress.setName("label36");
		whitePrincess.setName("label37");
		whiteGrashoper.setName("label38");
	}

	@Override
	public void BlackPawn() {

		squares[distX][distY].setBackground(Color.cyan);
		if (distX == 7) {
			--distX;
		}
		if (PanelContainsBlack(squares[++distX][distY]) == 0 && PanelContainsWhite(squares[distX][distY]) == 0) {

			squares[distX][distY].setBackground(Color.cyan);
			vector.add(squares[distX][distY].getName());

		}
	}

	@Override
	public void WhitePawn() {

		squares[distX][distY].setBackground(Color.cyan);
		if (distX == 0) {
			++distX;

		}
		if (PanelContainsBlack(squares[--distX][distY]) == 0 && PanelContainsWhite(squares[distX][distY]) == 0) {
			squares[distX][distY].setBackground(Color.cyan);
			vector.add(squares[distX][distY].getName());
		}
	}

	@Override
	public void BlackKingMove() {
		boolean t = false;
		boolean r = false;
		if (distX == 0) {
			a = distX + 1;
			c = distY;
		} else if (distX == 7) {
			a = distX - 1;
			c = distY;
		} else {
			a = distX + 1;
			c = distY;
			if (PanelContainsBlack(squares[a][c]) != 1) {
				if (PanelContainsWhite(squares[a][c]) == 1) {
					squares[a][c].setBackground(Color.cyan);
				} else {
					squares[a][c].setBackground(Color.cyan);
					vector.add(squares[a][c].getName());
				}
			}
			a = distX - 1;
			if (PanelContainsBlack(squares[a][c]) != 1) {
				if (PanelContainsWhite(squares[a][c]) == 1) {
					squares[a][c].setBackground(Color.cyan);
					vector.add(squares[a][c].getName());
				} else {
					squares[a][c].setBackground(Color.cyan);
					vector.add(squares[a][c].getName());
				}
			}
			t = true;
		}
		if (distY == 0) {
			b = distX;
			d = distY + 1;
		} else if (distY == 7) {
			b = distX;
			d = distY - 1;
		} else {
			d = distY + 1;
			b = distX;
			if (PanelContainsBlack(squares[b][d]) != 1) {
				if (PanelContainsWhite(squares[b][d]) == 1) {
					squares[b][d].setBackground(Color.cyan);
					vector.add(squares[b][d].getName());
				} else {
					squares[b][d].setBackground(Color.cyan);
					vector.add(squares[b][d].getName());
				}
			}
			d = distY - 1;
			if (PanelContainsBlack(squares[b][d]) != 1) {
				if (PanelContainsWhite(squares[b][d]) == 1) {
					squares[b][d].setBackground(Color.cyan);
					vector.add(squares[b][d].getName());
				} else {
					squares[b][d].setBackground(Color.cyan);
					vector.add(squares[b][d].getName());

				}
				r = true;
			}
			if (!t && PanelContainsBlack(squares[a][c]) != 1) {
				if (PanelContainsWhite(squares[a][c]) == 1) {
					squares[a][c].setBackground(Color.cyan);
					vector.add(squares[a][c].getName());
				} else {
					squares[a][c].setBackground(Color.cyan);
					vector.add(squares[a][c].getName());
				}
			}
			if (!r && PanelContainsBlack(squares[b][d]) != 1) {
				if (PanelContainsWhite(squares[b][d]) == 1) {
					squares[b][d].setBackground(Color.cyan);
					vector.add(squares[b][d].getName());
				} else {
					squares[b][d].setBackground(Color.cyan);
					vector.add(squares[b][d].getName());
				}
			}
			if (distX != 7 && distX != 0 && distY != 7 && distY != 0) {
				a = distX;
				b = distY;
				if (PanelContainsBlack(squares[a - 1][b - 1]) != 1) {
					if (PanelContainsWhite(squares[a - 1][b - 1]) == 1) {
						squares[a - 1][b - 1].setBackground(Color.cyan);
						vector.add(squares[a - 1][b - 1].getName());
					} else {
						squares[a - 1][b - 1].setBackground(Color.cyan);
						vector.add(squares[a - 1][b - 1].getName());
					}
				}
				if (PanelContainsBlack(squares[a + 1][b + 1]) != 1) {
					if (PanelContainsWhite(squares[a + 1][b + 1]) == 1) {
						squares[a + 1][b + 1].setBackground(Color.cyan);
						vector.add(squares[a + 1][b + 1].getName());
					} else {
						squares[a + 1][b + 1].setBackground(Color.cyan);
						vector.add(squares[a + 1][b + 1].getName());
					}
				}
				if (PanelContainsBlack(squares[a - 1][b + 1]) != 1) {
					if (PanelContainsWhite(squares[a - 1][b + 1]) == 1) {
						squares[a - 1][b + 1].setBackground(Color.cyan);
						vector.add(squares[a - 1][b + 1].getName());
					} else {
						squares[a - 1][b + 1].setBackground(Color.cyan);
						vector.add(squares[a - 1][b + 1].getName());
					}
				}
				if (PanelContainsBlack(squares[a + 1][b - 1]) != 1) {
					if (PanelContainsWhite(squares[a + 1][b - 1]) == 1) {
						squares[a + 1][b - 1].setBackground(Color.cyan);
						vector.add(squares[a + 1][b - 1].getName());
					} else {
						squares[a + 1][b - 1].setBackground(Color.cyan);
						vector.add(squares[a + 1][b - 1].getName());
					}
				}
			} else if (distX == 0) {
				if (distY != 0 && distY != 7) {
					if (PanelContainsBlack(squares[distX + 1][distY - 1]) != 1) {
						if (PanelContainsWhite(squares[distX + 1][distY - 1]) == 1) {
							squares[distX + 1][distY - 1].setBackground(Color.cyan);
							vector.add(squares[distX + 1][distY - 1].getName());
						} else {
							squares[distX + 1][distY - 1].setBackground(Color.cyan);
							vector.add(squares[distX + 1][distY - 1].getName());
						}
					}
					if (PanelContainsBlack(squares[distX + 1][distY + 1]) != 1) {
						if (PanelContainsWhite(squares[distX + 1][distY + 1]) == 1) {
							squares[distX + 1][distY + 1].setBackground(Color.cyan);
							vector.add(squares[distX + 1][distY + 1].getName());
						} else {
							squares[distX + 1][distY + 1].setBackground(Color.cyan);
							vector.add(squares[distX + 1][distY + 1].getName());
						}
					}
				} else if (distY == 0) {
					if (PanelContainsBlack(squares[distX + 1][distY + 1]) != 1) {
						if (PanelContainsWhite(squares[distX + 1][distY + 1]) == 1) {
							squares[distX + 1][distY + 1].setBackground(Color.cyan);
							vector.add(squares[distX + 1][distY + 1].getName());
						} else {
							squares[distX + 1][distY + 1].setBackground(Color.cyan);
							vector.add(squares[distX + 1][distY + 1].getName());
						}
					}
				} else if (distY == 7 && PanelContainsBlack(squares[distX + 1][distY - 1]) != 1) {
					if (PanelContainsWhite(squares[distX + 1][distY - 1]) == 1) {
						squares[distX + 1][distY - 1].setBackground(Color.cyan);
						vector.add(squares[distX + 1][distY - 1].getName());
					} else {
						squares[distX + 1][distY - 1].setBackground(Color.cyan);
						vector.add(squares[distX + 1][distY - 1].getName());
					}
				}
			} else if (distX == 7) {
				if (distY != 0 && distY != 7) {
					if (PanelContainsBlack(squares[distX - 1][distY - 1]) != 1) {
						if (PanelContainsWhite(squares[distX - 1][distY - 1]) == 1) {
							squares[distX - 1][distY - 1].setBackground(Color.cyan);
							vector.add(squares[distX - 1][distY - 1].getName());
						} else {
							squares[distX - 1][distY - 1].setBackground(Color.cyan);
							vector.add(squares[distX - 1][distY - 1].getName());
						}
					}
					if (PanelContainsBlack(squares[distX - 1][distY + 1]) != 1) {
						if (PanelContainsWhite(squares[distX - 1][distY + 1]) == 1) {
							squares[distX - 1][distY + 1].setBackground(Color.cyan);
							vector.add(squares[distX - 1][distY + 1].getName());
						} else {
							squares[distX - 1][distY + 1].setBackground(Color.cyan);
							vector.add(squares[distX - 1][distY + 1].getName());
						}
					}
				} else if (distY == 0) {
					if (PanelContainsBlack(squares[distX - 1][distY + 1]) != 1) {
						if (PanelContainsWhite(squares[distX - 1][distY + 1]) == 1) {
							squares[distX - 1][distY + 1].setBackground(Color.cyan);
							vector.add(squares[distX - 1][distY + 1].getName());
						} else {
							squares[distX - 1][distY + 1].setBackground(Color.cyan);
							vector.add(squares[distX - 1][distY + 1].getName());
						}
					}
				} else if (distY == 7 && PanelContainsBlack(squares[distX - 1][distY - 1]) != 1) {
					if (PanelContainsWhite(squares[distX - 1][distY - 1]) == 1) {
						squares[distX - 1][distY - 1].setBackground(Color.cyan);
						vector.add(squares[distX - 1][distY - 1].getName());
					} else {
						squares[distX - 1][distY - 1].setBackground(Color.cyan);
						vector.add(squares[distX - 1][distY - 1].getName());
					}
				}
			} else if (distY == 0) {
				if (distX != 0 && distX != 7) {
					if (PanelContainsBlack(squares[distX - 1][distY + 1]) != 1) {
						if (PanelContainsWhite(squares[distX - 1][distY + 1]) == 1) {
							squares[distX - 1][distY + 1].setBackground(Color.cyan);
							vector.add(squares[distX - 1][distY + 1].getName());
						} else {
							squares[distX - 1][distY + 1].setBackground(Color.cyan);
							vector.add(squares[distX - 1][distY + 1].getName());
						}
					}
					if (PanelContainsBlack(squares[distX + 1][distY + 1]) != 1) {
						if (PanelContainsWhite(squares[distX + 1][distY + 1]) == 1) {
							squares[distX + 1][distY + 1].setBackground(Color.cyan);
							vector.add(squares[distX + 1][distY + 1].getName());
						} else {
							squares[distX + 1][distY + 1].setBackground(Color.cyan);
							vector.add(squares[distX + 1][distY + 1].getName());
						}
					}
				} else if (distX == 0) {
					if (PanelContainsBlack(squares[distX + 1][distY + 1]) != 1) {
						if (PanelContainsWhite(squares[distX + 1][distY + 1]) == 1) {
							squares[distX + 1][distY + 1].setBackground(Color.cyan);
							vector.add(squares[distX + 1][distY + 1].getName());
						} else {
							squares[distX + 1][distY + 1].setBackground(Color.cyan);
							vector.add(squares[distX + 1][distY + 1].getName());
						}
					}
				} else if (distX == 7 && PanelContainsBlack(squares[distX - 1][distY + 1]) != 1) {
					if (PanelContainsWhite(squares[distX - 1][distY + 1]) == 1) {
						squares[distX - 1][distY + 1].setBackground(Color.cyan);
						vector.add(squares[distX - 1][distY + 1].getName());
					} else {
						squares[distX - 1][distY + 1].setBackground(Color.cyan);
						vector.add(squares[distX - 1][distY + 1].getName());
					}
				}
			} else if (distY == 7) {
				if (distX != 0 && distX != 7) {
					if (PanelContainsBlack(squares[distX - 1][distY - 1]) != 1) {
						if (PanelContainsWhite(squares[distX - 1][distY - 1]) == 1) {
							squares[distX - 1][distY - 1].setBackground(Color.cyan);
							vector.add(squares[distX - 1][distY - 1].getName());
						} else {
							squares[distX - 1][distY - 1].setBackground(Color.cyan);
							vector.add(squares[distX - 1][distY - 1].getName());
						}
					}
					if (PanelContainsBlack(squares[distX + 1][distY - 1]) != 1) {
						if (PanelContainsWhite(squares[distX + 1][distY - 1]) == 1) {
							squares[distX + 1][distY - 1].setBackground(Color.cyan);
							vector.add(squares[distX + 1][distY - 1].getName());
						} else {
							squares[distX + 1][distY - 1].setBackground(Color.cyan);
							vector.add(squares[distX + 1][distY - 1].getName());
						}
					}
				} else if (distX == 0) {
					if (PanelContainsBlack(squares[distX + 1][distY - 1]) != 1) {
						if (PanelContainsWhite(squares[distX + 1][distY - 1]) == 1) {
							squares[distX + 1][distY - 1].setBackground(Color.cyan);
							vector.add(squares[distX + 1][distY - 1].getName());
						} else {
							squares[distX + 1][distY - 1].setBackground(Color.cyan);
							vector.add(squares[distX + 1][distY - 1].getName());
						}
					}
				} else if (distX == 7 && PanelContainsBlack(squares[distX - 1][distY - 1]) != 1) {
					if (PanelContainsWhite(squares[distX - 1][distY - 1]) == 1) {
						squares[distX - 1][distY - 1].setBackground(Color.cyan);
						vector.add(squares[distX - 1][distY - 1].getName());
					} else {
						squares[distX - 1][distY - 1].setBackground(Color.cyan);
						vector.add(squares[distX - 1][distY - 1].getName());
					}
				}
			}
		}
	}

	@Override
	public void WhiteKingMove() {
		boolean t = false;
		boolean f = false;
		if (distX == 0) {
			a = distX + 1;
			c = distY;
		} else if (distX == 7) {
			a = distX - 1;
			c = distY;
		} else {
			a = distX + 1;
			c = distY;
			if (PanelContainsWhite(squares[a][c]) != 1) {
				if (PanelContainsBlack(squares[a][c]) == 1) {

					squares[a][c].setBackground(Color.cyan);
					vector.add(squares[a][c].getName());
				} else {

					squares[a][c].setBackground(Color.cyan);
					vector.add(squares[a][c].getName());
				}
			}
			a = distX - 1;
			if (PanelContainsWhite(squares[a][c]) != 1) {
				if (PanelContainsBlack(squares[a][c]) == 1) {

					squares[a][c].setBackground(Color.cyan);
					vector.add(squares[a][c].getName());
				} else {

					squares[a][c].setBackground(Color.cyan);
					vector.add(squares[a][c].getName());
				}
			}
			t = true;
		}
		if (distY == 0) {
			b = distX;
			d = distY + 1;
		} else if (distY == 7) {
			b = distX;
			d = distY - 1;
		} else {
			d = distY + 1;
			b = distX;
			if (PanelContainsWhite(squares[b][d]) != 1) {
				if (PanelContainsBlack(squares[b][d]) == 1) {

					squares[b][d].setBackground(Color.cyan);
					vector.add(squares[b][d].getName());
				} else {

					squares[b][d].setBackground(Color.cyan);
					vector.add(squares[b][d].getName());
				}
			}
			d = distY - 1;
			if (PanelContainsWhite(squares[b][d]) != 1) {
				if (PanelContainsBlack(squares[b][d]) == 1) {

					squares[b][d].setBackground(Color.cyan);
					vector.add(squares[b][d].getName());
				} else {

					squares[b][d].setBackground(Color.cyan);
					vector.add(squares[b][d].getName());
				}
			}
			f = true;
		}
		if (!t && PanelContainsWhite(squares[a][c]) != 1) {
			if (PanelContainsBlack(squares[a][c]) == 1) {

				squares[a][c].setBackground(Color.cyan);
				vector.add(squares[a][c].getName());
			} else {

				squares[a][c].setBackground(Color.cyan);
				vector.add(squares[a][c].getName());
			}
		}
		if (!f && PanelContainsWhite(squares[b][d]) != 1) {
			if (PanelContainsBlack(squares[b][d]) == 1) {

				squares[b][d].setBackground(Color.cyan);
				vector.add(squares[b][d].getName());
			} else {

				squares[b][d].setBackground(Color.cyan);
				vector.add(squares[b][d].getName());
			}
		}
		if (distX != 7 && distX != 0 && distY != 7 && distY != 0) {
			a = distX;
			b = distY;
			if (PanelContainsWhite(squares[a - 1][b - 1]) != 1) {
				if (PanelContainsBlack(squares[a - 1][b - 1]) == 1) {

					squares[a - 1][b - 1].setBackground(Color.cyan);
					vector.add(squares[a - 1][b - 1].getName());
				} else {

					squares[a - 1][b - 1].setBackground(Color.cyan);
					vector.add(squares[a - 1][b - 1].getName());
				}
			}
			if (PanelContainsWhite(squares[a + 1][b + 1]) != 1) {
				if (PanelContainsBlack(squares[a + 1][b + 1]) == 1) {
					squares[a + 1][b + 1].setBackground(Color.cyan);
					vector.add(squares[a + 1][b + 1].getName());
				} else {
					squares[a + 1][b + 1].setBackground(Color.cyan);
					vector.add(squares[a + 1][b + 1].getName());
				}
			}
			if (PanelContainsWhite(squares[a - 1][b + 1]) != 1) {
				if (PanelContainsBlack(squares[a - 1][b + 1]) == 1) {
					squares[a - 1][b + 1].setBackground(Color.cyan);
					vector.add(squares[a - 1][b + 1].getName());
				} else {
					squares[a - 1][b + 1].setBackground(Color.cyan);
					vector.add(squares[a - 1][b + 1].getName());
				}
			}
			if (PanelContainsWhite(squares[a + 1][b - 1]) != 1) {
				if (PanelContainsBlack(squares[a + 1][b - 1]) == 1) {
					squares[a + 1][b - 1].setBackground(Color.cyan);
					vector.add(squares[a + 1][b - 1].getName());
				} else {
					squares[a + 1][b - 1].setBackground(Color.cyan);
					vector.add(squares[a + 1][b - 1].getName());
				}
			}
		} else if (distX == 0) {
			if (distY != 0 && distY != 7) {
				if (PanelContainsWhite(squares[distX + 1][distY - 1]) != 1) {
					if (PanelContainsBlack(squares[distX + 1][distY - 1]) == 1) {
						squares[distX + 1][distY - 1].setBackground(Color.cyan);
						vector.add(squares[distX + 1][distY - 1].getName());
					} else {
						squares[distX + 1][distY - 1].setBackground(Color.cyan);
						vector.add(squares[distX + 1][distY - 1].getName());
					}
				}
				if (PanelContainsWhite(squares[distX + 1][distY + 1]) != 1) {
					if (PanelContainsBlack(squares[distX + 1][distY + 1]) == 1) {
						squares[distX + 1][distY + 1].setBackground(Color.cyan);
						vector.add(squares[distX + 1][distY + 1].getName());
					} else {
						squares[distX + 1][distY + 1].setBackground(Color.cyan);
						vector.add(squares[distX + 1][distY + 1].getName());
					}
				}
			} else if (distY == 0) {
				if (PanelContainsWhite(squares[distX + 1][distY + 1]) != 1) {
					if (PanelContainsBlack(squares[distX + 1][distY + 1]) == 1) {
						squares[distX + 1][distY + 1].setBackground(Color.cyan);
						vector.add(squares[distX + 1][distY + 1].getName());
					} else {
						squares[distX + 1][distY + 1].setBackground(Color.cyan);
						vector.add(squares[distX + 1][distY + 1].getName());
					}
				}
			} else if (distY == 7 && PanelContainsWhite(squares[distX + 1][distY - 1]) != 1) {
				if (PanelContainsBlack(squares[distX + 1][distY - 1]) == 1) {
					squares[distX + 1][distY - 1].setBackground(Color.cyan);
					vector.add(squares[distX + 1][distY - 1].getName());
				} else {
					squares[distX + 1][distY - 1].setBackground(Color.cyan);
					vector.add(squares[distX + 1][distY - 1].getName());
				}
			}
		} else if (distX == 7) {
			if (distY != 0 && distY != 7) {
				if (PanelContainsWhite(squares[distX - 1][distY - 1]) != 1) {
					if (PanelContainsBlack(squares[distX - 1][distY - 1]) == 1) {
						squares[distX - 1][distY - 1].setBackground(Color.cyan);
						vector.add(squares[distX - 1][distY - 1].getName());
					} else {
						squares[distX - 1][distY - 1].setBackground(Color.cyan);
						vector.add(squares[distX - 1][distY - 1].getName());
					}
				}
				if (PanelContainsWhite(squares[distX - 1][distY + 1]) != 1) {
					if (PanelContainsBlack(squares[distX - 1][distY + 1]) == 1) {
						squares[distX - 1][distY + 1].setBackground(Color.cyan);
						vector.add(squares[distX - 1][distY + 1].getName());
					} else {
						squares[distX - 1][distY + 1].setBackground(Color.cyan);
						vector.add(squares[distX - 1][distY + 1].getName());
					}
				}
			} else if (distY == 0) {
				if (PanelContainsWhite(squares[distX - 1][distY + 1]) != 1) {
					if (PanelContainsBlack(squares[distX - 1][distY + 1]) == 1) {
						squares[distX - 1][distY + 1].setBackground(Color.cyan);
						vector.add(squares[distX - 1][distY + 1].getName());
					} else {
						squares[distX - 1][distY + 1].setBackground(Color.cyan);
						vector.add(squares[distX - 1][distY + 1].getName());
					}
				}
			} else if (distY == 7 && PanelContainsWhite(squares[distX - 1][distY - 1]) != 1) {
				if (PanelContainsBlack(squares[distX - 1][distY - 1]) == 1) {
					squares[distX - 1][distY - 1].setBackground(Color.cyan);
					vector.add(squares[distX - 1][distY - 1].getName());
				} else {
					squares[distX - 1][distY - 1].setBackground(Color.cyan);
					vector.add(squares[distX - 1][distY - 1].getName());
				}
			}
		} else if (distY == 0) {
			if (distX != 0 && distX != 7) {
				if (PanelContainsWhite(squares[distX - 1][distY + 1]) != 1) {
					if (PanelContainsBlack(squares[distX - 1][distY + 1]) == 1) {
						squares[distX - 1][distY + 1].setBackground(Color.cyan);
						vector.add(squares[distX - 1][distY + 1].getName());
					} else {
						squares[distX - 1][distY + 1].setBackground(Color.cyan);
						vector.add(squares[distX - 1][distY + 1].getName());
					}
				}
				if (PanelContainsWhite(squares[distX + 1][distY + 1]) != 1) {
					if (PanelContainsBlack(squares[distX + 1][distY + 1]) == 1) {
						squares[distX + 1][distY + 1].setBackground(Color.cyan);
						vector.add(squares[distX + 1][distY + 1].getName());
					} else {
						squares[distX + 1][distY + 1].setBackground(Color.cyan);
						vector.add(squares[distX + 1][distY + 1].getName());
					}
				}
			} else if (distX == 0) {
				if (PanelContainsWhite(squares[distX + 1][distY + 1]) != 1) {
					if (PanelContainsBlack(squares[distX + 1][distY + 1]) == 1) {
						squares[distX + 1][distY + 1].setBackground(Color.cyan);
						vector.add(squares[distX + 1][distY + 1].getName());
					} else {
						squares[distX + 1][distY + 1].setBackground(Color.cyan);
						vector.add(squares[distX + 1][distY + 1].getName());
					}
				}
			} else if (distX == 7 && PanelContainsWhite(squares[distX - 1][distY + 1]) != 1) {
				if (PanelContainsBlack(squares[distX - 1][distY + 1]) == 1) {
					squares[distX - 1][distY + 1].setBackground(Color.cyan);
					vector.add(squares[distX - 1][distY + 1].getName());
				} else {
					squares[distX - 1][distY + 1].setBackground(Color.cyan);
					vector.add(squares[distX - 1][distY + 1].getName());
				}
			}
		} else if (distY == 7) {
			if (distX != 0 && distX != 7) {
				if (PanelContainsWhite(squares[distX - 1][distY - 1]) != 1) {
					if (PanelContainsBlack(squares[distX - 1][distY - 1]) == 1) {
						squares[distX - 1][distY - 1].setBackground(Color.cyan);
						vector.add(squares[distX - 1][distY - 1].getName());
					} else {
						squares[distX - 1][distY - 1].setBackground(Color.cyan);
						vector.add(squares[distX - 1][distY - 1].getName());
					}
				}
				if (PanelContainsWhite(squares[distX + 1][distY - 1]) != 1) {
					if (PanelContainsBlack(squares[distX + 1][distY - 1]) == 1) {
						squares[distX + 1][distY - 1].setBackground(Color.cyan);
						vector.add(squares[distX + 1][distY - 1].getName());
					} else {
						squares[distX + 1][distY - 1].setBackground(Color.cyan);
						vector.add(squares[distX + 1][distY - 1].getName());
					}
				}
			} else if (distX == 0) {
				if (PanelContainsWhite(squares[distX + 1][distY - 1]) != 1) {
					if (PanelContainsBlack(squares[distX + 1][distY - 1]) == 1) {
						squares[distX + 1][distY - 1].setBackground(Color.cyan);
						vector.add(squares[distX + 1][distY - 1].getName());
					} else {
						squares[distX + 1][distY - 1].setBackground(Color.cyan);
						vector.add(squares[distX + 1][distY - 1].getName());
					}
				}
			} else if (distX == 7 && PanelContainsWhite(squares[distX - 1][distY - 1]) != 1) {
				if (PanelContainsBlack(squares[distX - 1][distY - 1]) == 1) {
					squares[distX - 1][distY - 1].setBackground(Color.cyan);
					vector.add(squares[distX - 1][distY - 1].getName());
				} else {
					squares[distX - 1][distY - 1].setBackground(Color.cyan);
					vector.add(squares[distX - 1][distY - 1].getName());
				}
			}
		}
	}

	public void BlackBishopMove() {
		int j;
		int i;
		i = 0;
		j = 0;
		squares[distX][distY].setBackground(Color.cyan);
		if (distX < distY) {
			i = distX;
			j = distY;
			while (j < 7) {
				if (PanelContainsBlack(squares[i + 1][j + 1]) == 1)
					break;
				if (PanelContainsWhite(squares[i + 1][j + 1]) == 1) {
					squares[i + 1][j + 1].setBackground(Color.cyan);
					vector.add(squares[i + 1][j + 1].getName());
					break;
				}
				squares[i + 1][j + 1].setBackground(Color.cyan);
				vector.add(squares[i + 1][j + 1].getName());
				++i;
				++j;
			}
			j = distY;
			i = distX;
			while (i > 0) {
				if (PanelContainsBlack(squares[i - 1][j - 1]) == 1)
					break;
				if (PanelContainsWhite(squares[i - 1][j - 1]) == 1) {
					squares[i - 1][j - 1].setBackground(Color.cyan);
					vector.add(squares[i - 1][j - 1].getName());
					break;
				}
				squares[i - 1][j - 1].setBackground(Color.cyan);
				vector.add(squares[i - 1][j - 1].getName());
				--j;
				--i;
			}
		} else {
			i = distX;
			j = distY;
			while (i < 7) {
				if (PanelContainsBlack(squares[i + 1][j + 1]) == 1)
					break;
				if (PanelContainsWhite(squares[i + 1][j + 1]) == 1) {
					squares[i + 1][j + 1].setBackground(Color.cyan);
					vector.add(squares[i + 1][j + 1].getName());
					break;
				}
				squares[i + 1][j + 1].setBackground(Color.cyan);
				vector.add(squares[i + 1][j + 1].getName());
				++j;
				++i;
			}
			i = distX;
			j = distY;
			while (j > 0) {
				if (PanelContainsBlack(squares[i - 1][j - 1]) == 1)
					break;
				if (PanelContainsWhite(squares[i - 1][j - 1]) == 1) {
					squares[i - 1][j - 1].setBackground(Color.cyan);
					vector.add(squares[i - 1][j - 1].getName());
					break;
				}
				squares[i - 1][j - 1].setBackground(Color.cyan);
				vector.add(squares[i - 1][j - 1].getName());
				--i;
				--j;
			}
		}
		if (distX + distY < 7) {
			i = distX;
			j = distY;
			while (i > 0) {
				if (PanelContainsBlack(squares[i - 1][j + 1]) == 1)
					break;
				if (PanelContainsWhite(squares[i - 1][j + 1]) == 1) {
					squares[i - 1][j + 1].setBackground(Color.cyan);
					vector.add(squares[i - 1][j + 1].getName());
					break;
				}
				squares[i - 1][j + 1].setBackground(Color.cyan);
				vector.add(squares[i - 1][j + 1].getName());
				++j;
				--i;
			}
			i = distX;
			j = distY;
			while (j > 0) {
				if (PanelContainsBlack(squares[i + 1][j - 1]) == 1)
					break;
				if (PanelContainsWhite(squares[i + 1][j - 1]) == 1) {
					squares[i + 1][j - 1].setBackground(Color.cyan);
					vector.add(squares[i + 1][j - 1].getName());
					break;
				}
				squares[i + 1][j - 1].setBackground(Color.cyan);
				vector.add(squares[i + 1][j - 1].getName());
				++i;
				--j;
			}
		} else {
			i = distX;
			j = distY;
			while (i < 7) {
				if (PanelContainsBlack(squares[i + 1][j - 1]) == 1)
					break;
				if (PanelContainsWhite(squares[i + 1][j - 1]) == 1) {
					squares[i + 1][j - 1].setBackground(Color.cyan);
					vector.add(squares[i + 1][j - 1].getName());
					break;
				}
				squares[i + 1][j - 1].setBackground(Color.cyan);
				vector.add(squares[i + 1][j - 1].getName());
				--j;
				++i;
			}
			i = distX;
			j = distY;
			while (j < 7) {
				if (PanelContainsBlack(squares[i - 1][j + 1]) == 1)
					break;
				if (PanelContainsWhite(squares[i - 1][j + 1]) == 1) {
					squares[i - 1][j + 1].setBackground(Color.cyan);
					vector.add(squares[i - 1][j + 1].getName());
					break;
				}
				squares[i - 1][j + 1].setBackground(Color.cyan);
				vector.add(squares[i - 1][j + 1].getName());
				--i;
				++j;

				System.out.println(squares[distX][distY]);
			}
		}
	}

	@Override
	public void WhiteBishopMove() {
		int j;
		int i;
		i = 0;
		j = 0;
		squares[distX][distY].setBackground(Color.cyan);
		if (distX < distY) {
			i = distX;
			j = distY;
			while (j < 7) {
				if (PanelContainsWhite(squares[i + 1][j + 1]) == 1)
					break;
				if (PanelContainsBlack(squares[i + 1][j + 1]) == 1) {
					squares[i + 1][j + 1].setBackground(Color.cyan);
					vector.add(squares[i + 1][j + 1].getName());
					break;
				}
				squares[i + 1][j + 1].setBackground(Color.cyan);
				vector.add(squares[i + 1][j + 1].getName());
				++i;
				++j;
			}
			j = distY;
			i = distX;
			while (i > 0) {
				if (PanelContainsWhite(squares[i - 1][j - 1]) == 1)
					break;
				if (PanelContainsBlack(squares[i - 1][j - 1]) == 1) {
					squares[i - 1][j - 1].setBackground(Color.cyan);
					vector.add(squares[i - 1][j - 1].getName());
					break;
				}
				squares[i - 1][j - 1].setBackground(Color.cyan);
				vector.add(squares[i - 1][j - 1].getName());
				--j;
				--i;
			}
		} else {
			i = distX;
			j = distY;
			while (i < 7) {
				if (PanelContainsWhite(squares[i + 1][j + 1]) == 1)
					break;
				if (PanelContainsBlack(squares[i + 1][j + 1]) == 1) {
					squares[i + 1][j + 1].setBackground(Color.cyan);
					vector.add(squares[i + 1][j + 1].getName());
					break;
				}
				squares[i + 1][j + 1].setBackground(Color.cyan);
				vector.add(squares[i + 1][j + 1].getName());
				++j;
				++i;
			}
			i = distX;
			j = distY;
			while (j > 0) {
				if (PanelContainsWhite(squares[i - 1][j - 1]) == 1)
					break;
				if (PanelContainsBlack(squares[i - 1][j - 1]) == 1) {
					squares[i - 1][j - 1].setBackground(Color.cyan);
					vector.add(squares[i - 1][j - 1].getName());
					break;
				}
				squares[i - 1][j - 1].setBackground(Color.cyan);
				vector.add(squares[i - 1][j - 1].getName());
				--i;
				--j;
			}
		}
		if (distX + distY < 7) {
			i = distX;
			j = distY;
			while (i > 0) {
				if (PanelContainsWhite(squares[i - 1][j + 1]) == 1)
					break;
				if (PanelContainsBlack(squares[i - 1][j + 1]) == 1) {
					squares[i - 1][j + 1].setBackground(Color.cyan);
					vector.add(squares[i - 1][j + 1].getName());
					break;
				}
				squares[i - 1][j + 1].setBackground(Color.cyan);
				vector.add(squares[i - 1][j + 1].getName());
				++j;
				--i;
			}
			i = distX;
			j = distY;
			while (j > 0) {
				if (PanelContainsWhite(squares[i + 1][j - 1]) == 1)
					break;
				if (PanelContainsBlack(squares[i + 1][j - 1]) == 1) {
					squares[i + 1][j - 1].setBackground(Color.cyan);
					vector.add(squares[i + 1][j - 1].getName());
					break;
				}
				squares[i + 1][j - 1].setBackground(Color.cyan);
				vector.add(squares[i + 1][j - 1].getName());
				++i;
				--j;
			}
		} else {
			i = distX;
			j = distY;
			while (i < 7) {
				if (PanelContainsWhite(squares[i + 1][j - 1]) == 1)
					break;
				if (PanelContainsBlack(squares[i + 1][j - 1]) == 1) {
					squares[i + 1][j - 1].setBackground(Color.cyan);
					vector.add(squares[i + 1][j - 1].getName());
					break;
				}
				squares[i + 1][j - 1].setBackground(Color.cyan);
				vector.add(squares[i + 1][j - 1].getName());
				--j;
				++i;
			}
			i = distX;
			j = distY;
			while (j < 7) {
				if (PanelContainsWhite(squares[i - 1][j + 1]) == 1)
					break;
				if (PanelContainsBlack(squares[i - 1][j + 1]) == 1) {
					squares[i - 1][j + 1].setBackground(Color.cyan);
					vector.add(squares[i - 1][j + 1].getName());
					break;
				}
				squares[i - 1][j + 1].setBackground(Color.cyan);
				vector.add(squares[i - 1][j + 1].getName());
				--i;
				++j;
				System.out.println(squares[distX][distY]);
			}

		}
	}

	@Override
	public void BlackRookMove() {
		squares[distX][distY].setBackground(Color.cyan);
		int i = distX;
		while (i < 7) {
			if (PanelContainsBlack(squares[i + 1][distY]) == 1)
				break;
			if (PanelContainsWhite(squares[i + 1][distY]) == 1) {
				squares[i + 1][distY].setBackground(Color.cyan);
				vector.add(squares[i + 1][distY].getName());
				break;
			}
			squares[i + 1][distY].setBackground(Color.cyan);
			vector.add(squares[i + 1][distY].getName());
			++i;
		}
		i = distX;
		while (i > 0) {
			if (PanelContainsBlack(squares[i - 1][distY]) == 1)
				break;
			if (PanelContainsWhite(squares[i - 1][distY]) == 1) {
				squares[i - 1][distY].setBackground(Color.cyan);
				vector.add(squares[i - 1][distY].getName());
				break;
			}
			squares[i - 1][distY].setBackground(Color.cyan);
			vector.add(squares[i - 1][distY].getName());
			--i;
		}
		i = distY;
		while (i < 7) {
			if (PanelContainsBlack(squares[distX][i + 1]) == 1)
				break;
			if (PanelContainsWhite(squares[distX][i + 1]) == 1) {
				squares[distX][i + 1].setBackground(Color.cyan);
				vector.add(squares[distX][i + 1].getName());
				break;
			}
			squares[distX][i + 1].setBackground(Color.cyan);
			vector.add(squares[distX][i + 1].getName());
			++i;
		}
		i = distY;
		while (i > 0) {
			if (PanelContainsBlack(squares[distX][i - 1]) == 1)
				break;
			if (PanelContainsWhite(squares[distX][i - 1]) == 1) {
				squares[distX][i - 1].setBackground(Color.cyan);
				vector.add(squares[distX][i - 1].getName());
				break;
			}
			squares[distX][i - 1].setBackground(Color.cyan);
			vector.add(squares[distX][i - 1].getName());
			--i;
		}
		System.out.println(squares[distX][distY]);
	}

	@Override
	public void WhiteRookMove() {
		squares[distX][distY].setBackground(Color.cyan);
		int i = distX;
		while (i < 7) {
			if (PanelContainsWhite(squares[i + 1][distY]) == 1)
				break;
			if (PanelContainsBlack(squares[i + 1][distY]) == 1) {
				squares[i + 1][distY].setBackground(Color.cyan);
				vector.add(squares[i + 1][distY].getName());
				break;
			}
			squares[i + 1][distY].setBackground(Color.cyan);
			vector.add(squares[i + 1][distY].getName());
			++i;
		}
		i = distX;
		while (i > 0) {
			if (PanelContainsWhite(squares[i - 1][distY]) == 1)
				break;
			if (PanelContainsBlack(squares[i - 1][distY]) == 1) {
				squares[i - 1][distY].setBackground(Color.cyan);
				vector.add(squares[i - 1][distY].getName());
				break;
			}
			squares[i - 1][distY].setBackground(Color.cyan);
			vector.add(squares[i - 1][distY].getName());
			--i;
		}
		i = distY;
		while (i < 7) {
			if (PanelContainsWhite(squares[distX][i + 1]) == 1)
				break;
			if (PanelContainsBlack(squares[distX][i + 1]) == 1) {
				squares[distX][i + 1].setBackground(Color.cyan);
				vector.add(squares[distX][i + 1].getName());
				break;
			}
			squares[distX][i + 1].setBackground(Color.cyan);
			vector.add(squares[distX][i + 1].getName());
			++i;
		}
		i = distY;
		while (i > 0) {
			if (PanelContainsWhite(squares[distX][i - 1]) == 1)
				break;
			if (PanelContainsBlack(squares[distX][i - 1]) == 1) {
				squares[distX][i - 1].setBackground(Color.cyan);
				vector.add(squares[distX][i - 1].getName());
				break;
			}
			squares[distX][i - 1].setBackground(Color.cyan);
			vector.add(squares[distX][i - 1].getName());
			--i;
		}
		System.out.println(squares[distX][distY]);
	}

	@Override
	public void BlackKnightMove() {
		int i = distX;
		int j = distY;
		squares[i][j].setBackground(Color.cyan);
		if (i - 1 >= 0 && j - 2 >= 0 && PanelContainsBlack(squares[i - 1][j - 2]) != 1) {
			squares[i - 1][j - 2].setBackground(Color.cyan);
			vector.add(squares[i - 1][j - 2].getName());
		}
		if (i - 1 >= 0 && j + 2 <= 7 && PanelContainsBlack(squares[i - 1][j + 2]) != 1) {
			squares[i - 1][j + 2].setBackground(Color.cyan);
			vector.add(squares[i - 1][j + 2].getName());
		}
		if (i + 1 <= 7 && j - 2 >= 0 && PanelContainsBlack(squares[i + 1][j - 2]) != 1) {
			squares[i + 1][j - 2].setBackground(Color.cyan);
			vector.add(squares[i + 1][j - 2].getName());
		}
		if (i + 1 <= 7 && j + 2 <= 7 && PanelContainsBlack(squares[i + 1][j + 2]) != 1) {
			squares[i + 1][j + 2].setBackground(Color.cyan);
			vector.add(squares[i + 1][j + 2].getName());
		}
		if (i - 2 >= 0 && j - 1 >= 0 && PanelContainsBlack(squares[i - 2][j - 1]) != 1) {
			squares[i - 2][j - 1].setBackground(Color.cyan);
			vector.add(squares[i - 2][j - 1].getName());
		}
		if (i - 2 >= 0 && j + 1 <= 7 && PanelContainsBlack(squares[i - 2][j + 1]) != 1) {
			squares[i - 2][j + 1].setBackground(Color.cyan);
			vector.add(squares[i - 2][j + 1].getName());
		}
		if (i + 2 <= 7 && j - 1 >= 0 && PanelContainsBlack(squares[i + 2][j - 1]) != 1) {
			squares[i + 2][j - 1].setBackground(Color.cyan);
			vector.add(squares[i + 2][j - 1].getName());
		}
		if (i + 2 <= 7 && j + 1 <= 7 && PanelContainsBlack(squares[i + 2][j + 1]) != 1) {
			squares[i + 2][j + 1].setBackground(Color.cyan);
			vector.add(squares[i + 2][j + 1].getName());
		}
	}

	@Override
	public void WhiteKnightMove() {
		try {
			int i = distX;
			int j = distY;
			squares[i][j].setBackground(Color.cyan);
			if (i - 1 >= 0 && j - 2 >= 0 && PanelContainsWhite(squares[i - 1][j - 2]) != 1) {
				squares[i - 1][j - 2].setBackground(Color.cyan);
				vector.add(squares[i - 1][j - 2].getName());
			}
			if (i - 1 >= 0 && j + 2 <= 7 && PanelContainsWhite(squares[i - 1][j + 2]) != 1) {
				squares[i - 1][j + 2].setBackground(Color.cyan);
				vector.add(squares[i - 1][j + 2].getName());
			}
			if (i + 1 <= 7 && j - 2 >= 0 && PanelContainsWhite(squares[i + 1][j - 2]) != 1) {
				squares[i + 1][j - 2].setBackground(Color.cyan);
				vector.add(squares[i + 1][j - 2].getName());
			}
			if (i + 1 <= 7 && j + 2 <= 7 && PanelContainsWhite(squares[i + 1][j + 2]) != 1) {
				squares[i + 1][j + 2].setBackground(Color.cyan);
				vector.add(squares[i + 1][j + 2].getName());
			}
			if (i - 2 >= 0 && j - 1 >= 0 && PanelContainsWhite(squares[i - 2][j - 1]) != 1) {
				squares[i - 2][j - 1].setBackground(Color.cyan);
				vector.add(squares[i - 2][j - 1].getName());
			}
			if (i - 2 >= 0 && j + 1 <= 7 && PanelContainsWhite(squares[i - 2][j + 1]) != 1) {
				squares[i - 2][j + 1].setBackground(Color.cyan);
				vector.add(squares[i - 2][j + 1].getName());
			}
			if (i + 2 <= 7 && j - 1 >= 0 && PanelContainsWhite(squares[i + 2][j - 1]) != 1) {
				squares[i + 2][j - 1].setBackground(Color.cyan);
				vector.add(squares[i + 2][j - 1].getName());
			}
			if (i + 2 <= 7 && j + 1 <= 7 && PanelContainsWhite(squares[i + 2][j + 1]) != 1) {
				squares[i + 2][j + 1].setBackground(Color.cyan);
				vector.add(squares[i + 2][j + 1].getName());
			}
		} catch (ArrayIndexOutOfBoundsException e) {

		}

	}

	private int PanelContainsBlack(JPanel panel) {
		for (Map.Entry<Integer, JLabel> entry : BlackChessbox.entrySet()) {
			Value = entry.getValue();
			if (panel != Value.getParent())
				continue;
			return 1;
		}
		return 0;
	}

	private int PanelContainsWhite(JPanel panel) {
		for (Map.Entry<Integer, JLabel> entry : Whitebox.entrySet()) {
			Value = entry.getValue();
			if (panel != Value.getParent())
				continue;
			return 1;
		}
		return 0;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
	}


	
}