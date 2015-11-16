package be.ephec.tp7;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MaJFrame3 extends JFrame {
	private JButton jButtonOK;
	private JButton jButtonCancel;
	public MaJFrame3(){
		this.setBounds(500,400,100,50);
		this.setVisible(true);
		this.setTitle("Ma JFrame 3");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		jButtonOK = new JButton("OK");
		jButtonCancel = new JButton("Cancel");
		this.setLayout(new FlowLayout());
		this.getContentPane().add(jButtonOK);
		this.getContentPane().add(jButtonCancel);
		
	}
	public static void main(String[] args) {
		MaJFrame3 mjf1 = new MaJFrame3();
	}
}
