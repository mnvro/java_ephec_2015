package be.ephec.tp7;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MaJFrame4 extends JFrame {
	private static final long serialVersionUID = 1L;
	public static int NBOUTONS = 5 ;
	private JButton boutons[] ;

	public MaJFrame4 (){ 
		setTitle ("Exemple BorderLayout") ;
		setBounds (400, 500, 300, 180) ;
		setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		Container contenu = getContentPane() ;
		boutons = new JButton[NBOUTONS] ;
		for (int i=0 ; i<NBOUTONS ; i++) boutons[i] = new JButton ("Bouton " + i) ;
		contenu.add(boutons[0]) ; // au centre par defaut
		contenu.add(boutons[1], BorderLayout.NORTH) ;
		contenu.add(boutons[2], BorderLayout.SOUTH) ;
		contenu.add(boutons[3], BorderLayout.WEST) ;
		contenu.add(boutons[4], BorderLayout.EAST) ;
	}

	public static void main(String[] args) {
		MaJFrame4 mjf1 = new MaJFrame4();
	}
}
