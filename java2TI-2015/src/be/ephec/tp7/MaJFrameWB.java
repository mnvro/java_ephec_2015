package be.ephec.tp7;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MaJFrameWB extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField jTextFieldNom;
	private JTextField jTextFieldPrenom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		MaJFrameWB frame = new MaJFrameWB();
		frame.setVisible(true);

	}

	/**
	 * Create the frame.
	 */
	public MaJFrameWB() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel jLabelNom = new JLabel("Nom :");
		GridBagConstraints gbc_jLabelNom = new GridBagConstraints();
		gbc_jLabelNom.anchor = GridBagConstraints.EAST;
		gbc_jLabelNom.insets = new Insets(0, 0, 5, 5);
		gbc_jLabelNom.gridx = 0;
		gbc_jLabelNom.gridy = 0;
		contentPane.add(jLabelNom, gbc_jLabelNom);
		
		jTextFieldNom = new JTextField();
		jTextFieldNom.setText("Vroman");
		GridBagConstraints gbc_jTextFieldNom = new GridBagConstraints();
		gbc_jTextFieldNom.insets = new Insets(0, 0, 5, 0);
		gbc_jTextFieldNom.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFieldNom.gridx = 1;
		gbc_jTextFieldNom.gridy = 0;
		contentPane.add(jTextFieldNom, gbc_jTextFieldNom);
		jTextFieldNom.setColumns(10);
		
		JLabel jLabelPrenom = new JLabel("Pr\u00E9nom :");
		GridBagConstraints gbc_jLabelPrenom = new GridBagConstraints();
		gbc_jLabelPrenom.anchor = GridBagConstraints.EAST;
		gbc_jLabelPrenom.insets = new Insets(0, 0, 5, 5);
		gbc_jLabelPrenom.gridx = 0;
		gbc_jLabelPrenom.gridy = 1;
		contentPane.add(jLabelPrenom, gbc_jLabelPrenom);
		
		jTextFieldPrenom = new JTextField();
		jTextFieldPrenom.setText("Marie-No\u00EBl");
		GridBagConstraints gbc_jTextFieldPrenom = new GridBagConstraints();
		gbc_jTextFieldPrenom.insets = new Insets(0, 0, 5, 0);
		gbc_jTextFieldPrenom.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFieldPrenom.gridx = 1;
		gbc_jTextFieldPrenom.gridy = 1;
		contentPane.add(jTextFieldPrenom, gbc_jTextFieldPrenom);
		jTextFieldPrenom.setColumns(10);
		
		JButton jButtonOK = new JButton("OK");
		jButtonOK.addActionListener(this);
		GridBagConstraints gbc_jButtonOK = new GridBagConstraints();
		gbc_jButtonOK.insets = new Insets(0, 0, 0, 5);
		gbc_jButtonOK.gridx = 0;
		gbc_jButtonOK.gridy = 2;
		contentPane.add(jButtonOK, gbc_jButtonOK);
		
		JButton jButtonCancel = new JButton("Cancel");
		jButtonCancel.addActionListener(this);
		
		GridBagConstraints gbc_jButtonCancel = new GridBagConstraints();
		gbc_jButtonCancel.gridx = 1;
		gbc_jButtonCancel.gridy = 2;
		contentPane.add(jButtonCancel, gbc_jButtonCancel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()){
		case "Cancel" : 
			jTextFieldNom.setText("");
			jTextFieldPrenom.setText("");
			break;
		case "OK":
			System.out.println("bonjour " + jTextFieldNom.getText()+" "+jTextFieldPrenom.getText()+" !");
		}
		
	}

}
