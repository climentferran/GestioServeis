package Menu.Clients;

import Constructors.Client;
import Biblioteques.IO;
import Constructors.Persona;

public class Eliminar {
	
	public static void eliminarClient(Persona [] arrayClients, int totalClients) {
		
		boolean trobat = false;
        
        System.out.print("Quin client vol buscar(identificador): ");
        String identificador_buscat = IO.llegirText();
		for(int i=0;i<=totalClients && trobat == false;i++){ 
			if (identificador_buscat.equals(arrayClients[i].getIdentificador())) {
			
			trobat = true;
				
			for (int j=i;j<(totalClients-1);j++) {
				arrayClients[j] = arrayClients[j+1];
			}
			
				--totalClients;
				System.out.println("El usuari: " + identificador_buscat + "s'ha eliminat correctament");
			}else{
			
			trobat = true;
			
		
                System.out.println("Aquest nom no és troba");
                
                break;
				}
			}
		}
	}

