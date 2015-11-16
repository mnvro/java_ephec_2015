package be.ephec.tp7;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MaJFrame extends JFrame implements MouseListener {
	private int positionXJFrame = 500;
	private int positionYJFrame = 400;
	private int largeurJFrame = 300;
	private int hauterJFrame = 200;
	public MaJFrame(){
		this.setTitle("Ma première JFrame");
		this.setVisible(true);
		this.setBounds(positionXJFrame, positionYJFrame, 
				largeurJFrame, hauterJFrame);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.addMouseListener(this);
	}

	public static void main(String[] args) {
		MaJFrame mjf  = new MaJFrame();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("on a cliqué en (" + e.getX() + ", " + e.getY()+")");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
