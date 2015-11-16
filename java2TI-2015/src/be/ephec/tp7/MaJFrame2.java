package be.ephec.tp7;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MaJFrame2 extends JFrame  {
	private int positionXJFrame = 500;
	private int positionYJFrame = 400;
	private int largeurJFrame = 300;
	private int hauterJFrame = 200;
	private JButton jBoutonOK;
	public MaJFrame2(){
		this.setTitle("Ma première JFrame");
		this.setVisible(true);
		this.setBounds(positionXJFrame, positionYJFrame, 
				largeurJFrame, hauterJFrame);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		jBoutonOK = new JButton("OK");
		this.getContentPane().add(jBoutonOK);
		
	}

	public static void main(String[] args) {
		MaJFrame2 mjf  = new MaJFrame2();

	}

	

}
