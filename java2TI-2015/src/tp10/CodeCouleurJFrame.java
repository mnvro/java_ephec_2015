package tp10;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Insets;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author Arnaud Dewulf
 *
 */
public class CodeCouleurJFrame extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JRadioButton rdbtnAnneau1;
	private JRadioButton rdbtnAnneau2;
	private JRadioButton rdbtnAnneau3;
	private JButton buttonNoir;
	private JButton buttonBrun;
	private JButton buttonRouge;
	private JButton btnOrange;
	private JButton buttonVert;
	private JButton buttonBleu;
	private JButton buttonViolet;
	private JButton buttonGris;
	private JButton buttonBlanc;
	private JButton btnJaune;
	private JTextField textFieldChoix1;
	private JButton btnExit;
	private JButton btnGo;
	private CodeCouleurs monCC = new CodeCouleurs();
	private JTextField textFieldResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CodeCouleurJFrame frame = new CodeCouleurJFrame();
					frame.setVisible(true);
					frame.setTitle("Code couleur");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CodeCouleurJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 402, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{10, 10, 10, 10, 10, 10};
		gbl_contentPane.rowHeights = new int[]{30, 30, 30, 30, 0, 0, 0, 0, 10};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		
		buttonNoir = new JButton("");
		buttonNoir.addActionListener(this);
		buttonNoir.setBackground(Color.BLACK);
		monCC.getDicoCouleurs().put(buttonNoir.getBackground(), 0);
		GridBagConstraints gbc_buttonNoir = new GridBagConstraints();
		gbc_buttonNoir.fill = GridBagConstraints.BOTH;
		gbc_buttonNoir.insets = new Insets(0, 0, 5, 5);
		gbc_buttonNoir.gridx = 0;
		gbc_buttonNoir.gridy = 0;
		contentPane.add(buttonNoir, gbc_buttonNoir);
		
		buttonBrun = new JButton("");
		buttonBrun.addActionListener(this);
		buttonBrun.setBackground(new Color(128, 0, 0));
		monCC.getDicoCouleurs().put(buttonBrun.getBackground(), 1);
		GridBagConstraints gbc_buttonBrun = new GridBagConstraints();
		gbc_buttonBrun.fill = GridBagConstraints.BOTH;
		gbc_buttonBrun.insets = new Insets(0, 0, 5, 5);
		gbc_buttonBrun.gridx = 1;
		gbc_buttonBrun.gridy = 0;
		contentPane.add(buttonBrun, gbc_buttonBrun);
		
		buttonRouge = new JButton("");
		buttonRouge.addActionListener(this);
		buttonRouge.setBackground(Color.RED);
		monCC.getDicoCouleurs().put(buttonRouge.getBackground(), 2);
		GridBagConstraints gbc_buttonRouge = new GridBagConstraints();
		gbc_buttonRouge.fill = GridBagConstraints.BOTH;
		gbc_buttonRouge.insets = new Insets(0, 0, 5, 5);
		gbc_buttonRouge.gridx = 2;
		gbc_buttonRouge.gridy = 0;
		contentPane.add(buttonRouge, gbc_buttonRouge);
		
		btnOrange = new JButton("");
		btnOrange.addActionListener(this);
		btnOrange.setBackground(Color.ORANGE);
		monCC.getDicoCouleurs().put(btnOrange.getBackground(), 3);
		GridBagConstraints gbc_btnOrange = new GridBagConstraints();
		gbc_btnOrange.fill = GridBagConstraints.BOTH;
		gbc_btnOrange.insets = new Insets(0, 0, 5, 5);
		gbc_btnOrange.gridx = 3;
		gbc_btnOrange.gridy = 0;
		contentPane.add(btnOrange, gbc_btnOrange);
		
		btnJaune = new JButton();
		btnJaune.addActionListener(this);
		btnJaune.setBackground(Color.YELLOW);
		monCC.getDicoCouleurs().put(btnJaune.getBackground(), 4);
		GridBagConstraints gbc_btnJaune = new GridBagConstraints();
		gbc_btnJaune.insets = new Insets(0, 0, 5, 0);
		gbc_btnJaune.fill = GridBagConstraints.BOTH;
		gbc_btnJaune.gridx = 4;
		gbc_btnJaune.gridy = 0;
		contentPane.add(btnJaune, gbc_btnJaune);
		
		buttonVert = new JButton("");
		buttonVert.addActionListener(this);
		buttonVert.setBackground(new Color(0, 128, 0));
		monCC.getDicoCouleurs().put(buttonVert.getBackground(), 5);
		GridBagConstraints gbc_buttonVert = new GridBagConstraints();
		gbc_buttonVert.fill = GridBagConstraints.BOTH;
		gbc_buttonVert.insets = new Insets(0, 0, 5, 5);
		gbc_buttonVert.gridx = 0;
		gbc_buttonVert.gridy = 1;
		contentPane.add(buttonVert, gbc_buttonVert);
		
		buttonBleu = new JButton("");
		buttonBleu.addActionListener(this);
		buttonBleu.setBackground(Color.BLUE);
		monCC.getDicoCouleurs().put(buttonBleu.getBackground(), 6);
		GridBagConstraints gbc_buttonBleu = new GridBagConstraints();
		gbc_buttonBleu.fill = GridBagConstraints.BOTH;
		gbc_buttonBleu.insets = new Insets(0, 0, 5, 5);
		gbc_buttonBleu.gridx = 1;
		gbc_buttonBleu.gridy = 1;
		contentPane.add(buttonBleu, gbc_buttonBleu);
		
		buttonViolet = new JButton("");
		buttonViolet.addActionListener(this);
		buttonViolet.setBackground(new Color(128, 0, 128));
		monCC.getDicoCouleurs().put(buttonViolet.getBackground(), 7);
		GridBagConstraints gbc_buttonViolet = new GridBagConstraints();
		gbc_buttonViolet.fill = GridBagConstraints.BOTH;
		gbc_buttonViolet.insets = new Insets(0, 0, 5, 5);
		gbc_buttonViolet.gridx = 2;
		gbc_buttonViolet.gridy = 1;
		contentPane.add(buttonViolet, gbc_buttonViolet);
		
		buttonGris = new JButton("");
		buttonGris.addActionListener(this);
		buttonGris.setBackground(Color.GRAY);
		monCC.getDicoCouleurs().put(buttonGris.getBackground(), 8);
		GridBagConstraints gbc_buttonGris = new GridBagConstraints();
		gbc_buttonGris.fill = GridBagConstraints.BOTH;
		gbc_buttonGris.insets = new Insets(0, 0, 5, 5);
		gbc_buttonGris.gridx = 3;
		gbc_buttonGris.gridy = 1;
		contentPane.add(buttonGris, gbc_buttonGris);
		
		buttonBlanc = new JButton("");
		buttonBlanc.addActionListener(this);
		buttonBlanc.setBackground(Color.WHITE);
		monCC.getDicoCouleurs().put(buttonBlanc.getBackground(), 9);
		GridBagConstraints gbc_buttonBlanc = new GridBagConstraints();
		gbc_buttonBlanc.fill = GridBagConstraints.BOTH;
		gbc_buttonBlanc.insets = new Insets(0, 0, 5, 0);
		gbc_buttonBlanc.gridx = 4;
		gbc_buttonBlanc.gridy = 1;
		contentPane.add(buttonBlanc, gbc_buttonBlanc);
		
		rdbtnAnneau1 = new JRadioButton("");
		rdbtnAnneau1.addActionListener(this);
		rdbtnAnneau1.setActionCommand("Anneau1");
		GridBagConstraints gbc_rdbtnAnneau1 = new GridBagConstraints();
		gbc_rdbtnAnneau1.fill = GridBagConstraints.BOTH;
		gbc_rdbtnAnneau1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnAnneau1.gridx = 1;
		gbc_rdbtnAnneau1.gridy = 4;
		contentPane.add(rdbtnAnneau1, gbc_rdbtnAnneau1);
		
		rdbtnAnneau2 = new JRadioButton("");
		rdbtnAnneau2.addActionListener(this);
		rdbtnAnneau2.setActionCommand("Anneau2");
		GridBagConstraints gbc_rdbtnAnneau2 = new GridBagConstraints();
		gbc_rdbtnAnneau2.fill = GridBagConstraints.BOTH;
		gbc_rdbtnAnneau2.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnAnneau2.gridx = 2;
		gbc_rdbtnAnneau2.gridy = 4;
		contentPane.add(rdbtnAnneau2, gbc_rdbtnAnneau2);
		
		rdbtnAnneau3 = new JRadioButton("");
		rdbtnAnneau3.addActionListener(this);
		rdbtnAnneau3.setActionCommand("Anneau3");
		GridBagConstraints gbc_rdbtnAnneau3 = new GridBagConstraints();
		gbc_rdbtnAnneau3.fill = GridBagConstraints.BOTH;
		gbc_rdbtnAnneau3.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnAnneau3.gridx = 3;
		gbc_rdbtnAnneau3.gridy = 4;
		contentPane.add(rdbtnAnneau3, gbc_rdbtnAnneau3);

		
		btnGo = new JButton("Go");
		btnGo.addActionListener(this);
		GridBagConstraints gbc_btnGo = new GridBagConstraints();
		gbc_btnGo.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnGo.gridwidth = 5;
		gbc_btnGo.insets = new Insets(0, 0, 5, 0);
		gbc_btnGo.gridx = 0;
		gbc_btnGo.gridy = 5;
		contentPane.add(btnGo, gbc_btnGo);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(this);
		GridBagConstraints gbc_btnExit = new GridBagConstraints();
		gbc_btnExit.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnExit.gridwidth = 5;
		gbc_btnExit.gridx = 0;
		gbc_btnExit.gridy = 7;
		contentPane.add(btnExit, gbc_btnExit);
		
		textFieldResult = new JTextField();
		textFieldResult.setEditable(false);
		GridBagConstraints gbc_textFieldResult = new GridBagConstraints();
		gbc_textFieldResult.gridwidth = 5;
		gbc_textFieldResult.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldResult.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldResult.gridx = 0;
		gbc_textFieldResult.gridy = 6;
		contentPane.add(textFieldResult, gbc_textFieldResult);
		textFieldResult.setColumns(10);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()){
			case "Anneau1":
				rdbtnAnneau2.setSelected(false);
				rdbtnAnneau3.setSelected(false);
				break;
			case "Anneau2":
				rdbtnAnneau1.setSelected(false);
				rdbtnAnneau3.setSelected(false);	
				break;
			case "Anneau3":
				rdbtnAnneau2.setSelected(false);
				rdbtnAnneau1.setSelected(false);
				break;
			case "Exit":
				this.dispose();
				break;
			case "Go":
				textFieldResult.setText(monCC.calcul(rdbtnAnneau1.getBackground(), rdbtnAnneau2.getBackground(), rdbtnAnneau3.getBackground())+" Ohms");
				break;
			default:
				if(rdbtnAnneau1.isSelected()){
					rdbtnAnneau1.setBackground(((JButton)e.getSource()).getBackground());
				}else if(rdbtnAnneau2.isSelected()){
					rdbtnAnneau2.setBackground(((JButton)e.getSource()).getBackground());
				}else if(rdbtnAnneau3.isSelected()){
					rdbtnAnneau3.setBackground(((JButton)e.getSource()).getBackground());
				}
				break;
		}
	}
}
