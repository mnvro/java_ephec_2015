package be.ephec.network;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;

import be.ephec.application.ApplicationServeur;
import be.ephec.application.Param;

public class ServeurSocket extends ServerSocket implements Runnable {
	private ApplicationServeur ma;
	private ArrayList<ClientCoteServeur> listeClients = new ArrayList<ClientCoteServeur>();
	private int nbClients = 0;
	/**
	 * Constructeur qui permet de d�marrer un serveur TCP sur un num�ro de port donn�
	 * @param numPort le num�ro de port sur lequel le serveur va �couter
	 * @throws IOException
	 */
	public ServeurSocket(int numPort,ApplicationServeur ma) throws IOException {
		super(numPort);
		this.ma = ma;
		//System.out.println("le serveur �coute sur "+this.getLocalPort());
		acceptePlusieursClients();
	}
	/**
	 * Constructeur qui permet de d�marrer un serveur TCP sur le num�ro de port se trouvant 
	 * dans la classe Param
	 * @throws IOException
	 */
	public ServeurSocket(ApplicationServeur ma) throws IOException {
		super(Param.NUM_PORT_DE_BASE);
		this.ma = ma;
		//System.out.println("le serveur �coute sur "+this.getLocalPort());
		acceptePlusieursClients();
	}
	/**
	 * M�thode qui permet de cr�er un serveur TCP sur un num�ro de port libre � partir du 
	 * num�ro de port indiqu� dans la classe Param
	 * Tous les num�ros de port sont test�s � partir de Param.NUMPORTDEBASE jusqu'� 65535
	 * @return le serveur TCP
	 */
	public static ServeurSocket getServeurPortLibre(ApplicationServeur ma){
		ServeurSocket ms = null;
		for (int numPort = Param.NUM_PORT_DE_BASE ; numPort<=65535 ; numPort++){
			try{
				ms = new ServeurSocket(numPort,ma);
				ms.acceptePlusieursClients();
				break;
			}catch (IOException ioe){
			}
		}
		return ms;
	}
	/**
	 * M�thode qui permet de cr�er un serveur TCP sur un num�ro de port libre � partir du 
	 * num�ro de port re�u en param�tre
	 * Tous les num�ros de port sont test�s � partir de Param.NUMPORTDEBASE jusqu'� 65535
	 * @param numPortDepart un entier compris entre 1 et 65536. Ce sera le num�ro de port 
	 * � partir duquel on cherche un port libre pour notre application
	 * @return le serveur TCP
	 * 
	 */
	public static ServeurSocket getServeurPortLibreAPartirDUnNum(ApplicationServeur ma,int numPortDepart){
		ServeurSocket ms = null;
		for (int numPort = numPortDepart ; numPort<=65535 ; numPort++){
			try{
				ms = new ServeurSocket(numPort,ma);
				ms.acceptePlusieursClients();
				break;
			}catch (IOException ioe){
			}
		}
		return ms;
	}
	/**
	 * M�thode qui attend des clients pour les ajouter � la liste des clients connect�s
	 */
	public void acceptePlusieursClients(){
		// le code �tait ici
		Thread t = new Thread(this);
		t.start();
	}
	/**
	 * Juste pour tester en console que �a fonctionne
	 * Normalement on ex�cute la m�thode main de la classe MonApplication
	 * @param args pas utilis�
	 */
	public static void main(String[] args) {
		ServeurSocket ms = ServeurSocket.getServeurPortLibre(null);
		
	}
	public void ecrireSurUnClient(ClientCoteServeur ccs, Object o){
		ccs.ecrire(o);
	}
	public void ecrirSurTousLesClients(Object o){
		for (ClientCoteServeur clientCoteServeur : listeClients) {
			clientCoteServeur.ecrire(o);
		}
	}
	public Object lireSurUnClient(int num){
		return listeClients.get(num).lire();
	}
	@Override
	public void run() {
		while (!this.isClosed()){
			try {
				ClientCoteServeur ccs = new ClientCoteServeur(this.accept(),++nbClients,ma);
				this.listeClients.add(ccs);
				ma.traiteClientConnecte(ccs);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}

