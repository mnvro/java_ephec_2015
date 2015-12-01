package damier;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;

public class UnDamierDeJButton extends JFrame {

	private JPanel contentPane;
	private int nbLignes=10;
	private int nbColonnes=10;
	private int largeurLignePixel = 100;
	private int hauterLignePixel = 30;
	private JButton tabJButton[][] = new JButton[nbLignes][nbLignes];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UnDamierDeJButton frame = new UnDamierDeJButton();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UnDamierDeJButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		setTitle("Damier");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[nbColonnes];//{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[nbLignes];//{0, 0, 0, 0, 0, 0};
		//gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		//gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		for (int i = 0; i < nbLignes; i++) {
			for (int j = 0; j < nbColonnes; j++) {
				tabJButton[i][j] = new JButton("button ("+i+","+j+")");
				GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
				gbc_btnNewButton.gridx = j;
				gbc_btnNewButton.gridy = i;
				contentPane.add(tabJButton[i][j], gbc_btnNewButton);
			}
			
		}
		setBounds(100, 100, nbColonnes*largeurLignePixel, nbLignes*hauterLignePixel);
	}

}
