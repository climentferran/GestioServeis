package Menu.Clients;

import Constructors.Client;
import Constructors.Persona;
import Biblioteques.IO;


public class Alta {
public static int ingresardades(Persona[] arrayPersones, int totalPersones) {


		for (int i=0;i<arrayPersones.length;i++) {

			arrayPersones[totalPersones] = new Client();
			//((Client) arrayPersones[totalPersones]).getTargeta();
			
			System.out.println("Escriure el teu nom: ");
			((Client) arrayPersones[totalPersones]).setNom(IO.llegirText());
			
			System.out.println("Escriure el teu cognom1: ");
			((Client) arrayPersones[totalPersones]).setCognom1(IO.llegirText());
			
			System.out.println("Escriure el teu cognom2: ");			
			((Client) arrayPersones[totalPersones]).setCognom2(IO.llegirText());
			
			System.out.println("Escriure el teu identificador: ");
			((Client) arrayPersones[totalPersones]).setIdentificador(IO.llegirText());
			
			System.out.println("Escriure la teua contrasenya: ");
			((Client) arrayPersones[totalPersones]).setPasswd(IO.llegirText());

			System.out.println("Escriure la teua targeta de credit: ");
			((Client) arrayPersones[totalPersones]).setTargeta(IO.llegirText());
			totalPersones++;
			break;

			}return totalPersones;
		}
}
