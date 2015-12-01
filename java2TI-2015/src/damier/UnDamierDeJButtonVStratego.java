package damier;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class UnDamierDeJButtonVStratego extends JFrame {

	private JPanel contentPane;
	private int nbLignes=10;
	private int nbColonnes=10;
	private int largeurcolonnePixel = 50;
	private int hauterLignePixel = 50;
	private int pixelsEnPlusHauteur = 41;
	private int pixelsEnPlusLargeur = 19;
	private JButton tabJButton[][] = new JButton[nbLignes][nbLignes];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UnDamierDeJButtonVStratego frame = new UnDamierDeJButtonVStratego();
					
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
	public UnDamierDeJButtonVStratego() {
		this.setIconImage(new ImageIcon(".\\images\\StrategoIcon.jpg").getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(nbColonnes*largeurcolonnePixel + pixelsEnPlusLargeur, 
				nbLignes*hauterLignePixel + pixelsEnPlusHauteur)
		);
		
		contentPane = new JPanel();
		setTitle("Stratego");
		GridBagConstraints gbc = new GridBagConstraints();
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[nbColonnes];
		gbl_contentPane.rowHeights = new int[nbLignes];
		gbl_contentPane.columnWeights = new double[nbColonnes];
		gbl_contentPane.rowWeights = new double[nbLignes];
		contentPane.setLayout(gbl_contentPane);
		
		for (int l = 0; l < nbLignes; l++) {
			for (int c = 0; c < nbColonnes; c++) {
				tabJButton[l][c] = new JButton();
				String image = ".\\images\\PlateauStratego\\StrategoBackground_"+l+c+".gif";
				tabJButton[l][c].setIcon(new ImageIcon(image));
				tabJButton[l][c].setPreferredSize(new Dimension(largeurcolonnePixel,hauterLignePixel));
				tabJButton[l][c].setMinimumSize(new Dimension(largeurcolonnePixel,hauterLignePixel));
				gbc.gridx = c;
				gbc.gridy = l;
				contentPane.add(tabJButton[l][c], gbc);
			}	
		}
		
		setBounds(100, 100, nbColonnes*largeurcolonnePixel+pixelsEnPlusLargeur, nbLignes*hauterLignePixel+pixelsEnPlusHauteur);
	}

}
