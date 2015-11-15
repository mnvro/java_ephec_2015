package be.ephec.interfaceGraphique.serveur;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;

import be.ephec.application.ApplicationServeur;
import be.ephec.application.Console;
import be.ephec.network.ClientCoteServeur;

import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class JPanelPrincipalServeur extends JPanel implements ActionListener {
	private JTextField jTextFieldMessage;
	private ApplicationServeur ma;
	private JTextArea jTextAreaConsoleServeur;
	private JComboBox comboBox ;

	public void ajouteDansLaConsole(String s){
		jTextAreaConsoleServeur.append(s);
	}

	public void ajouteClientJComboBox(ClientCoteServeur client){
		comboBox.addItem(client);
	}
	
	public void supprimeClientJComboBox(ClientCoteServeur client){
		comboBox.removeItem(client);
	}

	public JPanelPrincipalServeur(ApplicationServeur ma) {
		this.ma = ma;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0,Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblConsoleDuServeur = new JLabel("Console du serveur :");
		GridBagConstraints gbc_lblConsoleDuServeur = new GridBagConstraints();
		gbc_lblConsoleDuServeur.insets = new Insets(0, 0, 5, 5);
		gbc_lblConsoleDuServeur.anchor = GridBagConstraints.WEST;
		gbc_lblConsoleDuServeur.gridx = 0;
		gbc_lblConsoleDuServeur.gridy = 0;
		add(lblConsoleDuServeur, gbc_lblConsoleDuServeur);

		jTextFieldMessage = new JTextField();
		jTextFieldMessage.setText("Message � envoyer");
		GridBagConstraints gbc_jTextFieldMessage = new GridBagConstraints();
		gbc_jTextFieldMessage.insets = new Insets(0, 0, 5, 0);
		gbc_jTextFieldMessage.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFieldMessage.gridx = 1;
		gbc_jTextFieldMessage.gridy = 0;
		add(jTextFieldMessage, gbc_jTextFieldMessage);
		jTextFieldMessage.setColumns(10);

		JButton btnEnvoyerAuClient = new JButton("Envoyer au client");
		btnEnvoyerAuClient.addActionListener(this);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridheight = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		add(scrollPane, gbc_scrollPane);

		jTextAreaConsoleServeur = new JTextArea();
		scrollPane.setViewportView(jTextAreaConsoleServeur);
		jTextAreaConsoleServeur.setText(Console.getInviteDeCommande()+
				"Le serveur �coute sur le port :"+ma.getServeurSocket().getLocalPort()+"\n");
		GridBagConstraints gbc_btnEnvoyerAuClient = new GridBagConstraints();
		gbc_btnEnvoyerAuClient.anchor = GridBagConstraints.NORTH;
		gbc_btnEnvoyerAuClient.gridx = 1;
		gbc_btnEnvoyerAuClient.gridy = 2;
		add(btnEnvoyerAuClient, gbc_btnEnvoyerAuClient);

		comboBox = new JComboBox();
		comboBox.addItem("Tous les clients");
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.anchor = GridBagConstraints.NORTH;
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 1;
		add(comboBox, gbc_comboBox);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String message = jTextFieldMessage.getText();
		if (comboBox.getSelectedItem().toString().compareToIgnoreCase("Tous les clients") == 0){
			ma.traiteObjetAEnvoyerATousLesClients(message);		
		} else{
			ClientCoteServeur ccs = (ClientCoteServeur)(comboBox.getSelectedItem());
			ma.traiteObjetAEnvoyer(ccs, message);
		}
	}

}
