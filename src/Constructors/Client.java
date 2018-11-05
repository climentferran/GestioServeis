package Constructors;

public class Client extends Persona {
	
	private String idClient;
	private String tipusClient;
	private String targeta;
	
	public Client() {
		super();
	}

	public String getIdClient() { return idClient; }

	public String getTipusClient() {
		return tipusClient;
	}

	public String getTargeta() {
		return targeta;
	}



	public void setIdClient(String clientID) {
		idClient = clientID;
	}

	public void setTipusClient(String tipus) {
		tipusClient = tipus;
	}

	public void setTargeta(String targeta_client) {
		targeta = targeta_client;
	}

	@Override
	public String toString() {
		String imprimir = getNom();
		return imprimir;
	}
	
	
}
