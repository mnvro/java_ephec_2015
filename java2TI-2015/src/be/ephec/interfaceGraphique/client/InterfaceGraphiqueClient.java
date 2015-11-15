package be.ephec.interfaceGraphique.client;
import javax.swing.JFrame;
import javax.swing.JPanel;

import be.ephec.application.ApplicationClient;
import be.ephec.application.Param;

public class InterfaceGraphiqueClient extends JFrame {
	private ApplicationClient applicationClient;
	private JPanel jPanelClient;

	/**
	 * Cr�e l'interface graphique correspondant au client
	 * @param applicationClient r�f�rence vers l'application cliente qui permet
	 *  d'acc�der � cette JFrame et au socket
	 */
	public InterfaceGraphiqueClient(ApplicationClient applicationClient) {
		this.applicationClient = applicationClient;
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new JPanelAccueilClient(applicationClient));
		// astuce pour que toutes les JFrame ne se supperposent pas
		int x = Param.COIN_SUP_GAUCHE_CLIENT_X+ ((ApplicationClient.getNbClients())%Param.NB_COLONNES_AFFICHAGE)*Param.LARGEUR_JFRAME_ACCUEIL_CLIENT;
		int y = Param.COIN_SUP_GAUCHE_CLIENT_Y+((ApplicationClient.getNbClients())/Param.NB_COLONNES_AFFICHAGE)*Param.HAUTEUR_JFRAME_PINC_CLIENT;
		setBounds(
				x, y,  
				Param.LARGEUR_JFRAME_ACCUEIL_CLIENT, 
				Param.HAUTEUR_JFRAME_ACCUEIL_CLIENT
		);	
	}
	
	/**
	 * ajoute dans le jTextArea correspondant � la console du client
	 * @param s la chaine de caract�res
	 */
	public void ajouteDansLaConsole(String s){
		((JPanelPrincipalClient)jPanelClient).ajouteDansLaConsole(s);;
	}

	public JPanel getjPanelClient() {
		return jPanelClient;
	}

	/**
	 * Permet de charger un jPanel dans la JFrame
	 * @param jPanelClient le nouveau jPanel
	 */
	public void setjPanelClient(JPanel jPanelClient) {
		this.jPanelClient = jPanelClient;
		this.setContentPane(jPanelClient);
	}
}
