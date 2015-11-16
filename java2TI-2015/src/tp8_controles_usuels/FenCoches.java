package tp8_controles_usuels;

import java.awt.* ; import java.awt.event.* ; 
import javax.swing.* ;
/**
 * @author Livre "Programmer en java"
 *
 */
class FenCoches extends JFrame implements ActionListener, ItemListener{ 
	public FenCoches ()
	{ setTitle ("Exemple de cases a cocher") ;
	setSize (400, 100) ;
	Container contenu = getContentPane() ;
	contenu.setLayout (new FlowLayout()) ;
	coche1 = new JCheckBox ("case 1") ;
	contenu.add(coche1) ;
	coche1.addActionListener (this) ;
	coche1.addItemListener(this);
	coche2 = new JCheckBox ("case 2") ;
	contenu.add(coche2) ;
	coche2.addItemListener(this);
	coche2.addActionListener (this) ;
	�tat = new JButton ("�tat") ;
	contenu.add(�tat) ;
	�tat.addActionListener (this) ;
	}
	public void actionPerformed (ActionEvent ev){ 
		Object source = ev.getSource() ;
		if (source == coche1) System.out.println ("action case 1") ;
		if (source == coche2) System.out.println ("action case 2") ;
		if (source == �tat)
			System.out.println ("�tat CASES : " + coche1.isSelected() + " "
					+ coche2.isSelected()) ;
	}
	private JCheckBox coche1, coche2 ;
	private JButton �tat ;
	@Override
	public void itemStateChanged(ItemEvent ie) {
		Object source = ie.getSource() ;
		if (source == coche1) System.out.println ("changement case 1") ;
		if (source == coche2) System.out.println ("changement case 2") ;
		System.out.println ("�tat CASES : " + coche1.isSelected() + " "
				+ coche2.isSelected()) ;
		
	}
}
