package be.ephec.application;
import be.ephec.interfaceGraphique.client.InterfaceGraphiqueClient;
import be.ephec.network.ClientSocket;

public class ApplicationClient {
	private InterfaceGraphiqueClient interfaceGraphiqueClient;
	private ClientSocket socket;
	private int num;
	private static int nbClients = 0;
	public ApplicationClient(){
		interfaceGraphiqueClient = new InterfaceGraphiqueClient(this);
		nbClients++;
	}

	public static void main(String[] args) {
		ApplicationClient appliClient = new ApplicationClient();
	}
	
	// Les m�thodes utiles
	public void traiteConnexionR�ussieAuServeur(){
		interfaceGraphiqueClient.ajouteDansLaConsole(Console.getInviteDeCommande()+
				"Le client est connect� au serveur\n");
	}
	
	public void traiteObjetRecu(Object o){
		interfaceGraphiqueClient.ajouteDansLaConsole(Console.getInviteDeCommande()+o.toString()+"\n");
	}
	
	public void setTitle(String s){
		interfaceGraphiqueClient.setTitle(s);
	}
	
	public void traiteObjetAEnvoyer(Object o){
		socket.ecrire(o);
	}
	
	// Les getteurs et les setteurs
	public InterfaceGraphiqueClient getInterfaceGraphiqueClient() {
		return interfaceGraphiqueClient;
	}
	public void setInterfaceGraphiqueClient
	 (InterfaceGraphiqueClient interfaceGraphiqueClient) {
		this.interfaceGraphiqueClient = interfaceGraphiqueClient;
	}

	public ClientSocket getSocket() {
		return socket;
	}

	public void setSocket(ClientSocket socket) {
		this.socket = socket;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	public static int getNbClients() {
		return nbClients;
	}
	public static void setNbClients(int nbClients) {
		ApplicationClient.nbClients = nbClients;
	}	
}

