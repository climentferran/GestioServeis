package Menu.Clients;

import Biblioteques.IO;
import Constructors.Client;
import Constructors.Persona;



public class Llistar {
	
public static void llistarArray2(Persona[] arrayClients, int totalClients) {
		
	System.out.println("-------------------------------LLISTA--------------------------");
    IO.imprimirTI("Nom, Cognom1, Cognom2, Identificador");
		for (int i=0;i<totalClients;i++) {

		IO.imprimirTI(arrayClients[i].getNom() + " " + arrayClients[i].getCognom1() + " " + arrayClients[i].getCognom2() + " " + arrayClients[i].getIdentificador() );
			//System.out.println("IdClient, TipusClient, Targeta");
			//System.out.println(arrayClients[i].getIdClient() + " " + arrayClients[i].getTipusClient() + " " + arrayClients[i].getTargeta());
		}
		
	}
}
