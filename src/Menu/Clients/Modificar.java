package Menu.Clients;

import Constructors.Client;
import Gestio.Gestio_clients;
import Biblioteques.IO;
import Constructors.Persona;

public class Modificar {

public static void modificarPersona(Persona [] arrayClients, int totalClients) {
		
		Gestio_clients menu2 = new Gestio_clients();
		int opcio_modificar = 0;
		Gestio_clients menu3 = new Gestio_clients();
		int opcio_modificar_dada = 0;
    
	 do {
		 Biblioteques.IO.mostrar_menu_modificar_clients(menu2);
		 switch(opcio_modificar = IO.llegirEnter()) {

        
        case 1:
        	boolean trobat = false;
            
            System.out.print("Quin usuari desitjes buscar (NOM): ");
            String nom_buscat = IO.llegirText();
    		for(int i=0;i<=totalClients && trobat == false;i++){
    			if (nom_buscat.equals(arrayClients[i].getNom())) {
    			
    				System.out.println("Dades: " + arrayClients[i].getNom() + " " + arrayClients[i].getCognom1() + " " + arrayClients[i].getCognom2() + " " + arrayClients[i].getIdentificador() + " " + arrayClients[i].getPasswd() + " " + ((Client) arrayClients[i]).getTargeta());
    			trobat = true;
    			
    			do {
    				System.out.println("Quina dada vols modificar del objecte  [ " +  arrayClients[i].getNom() + " ] ");
    				IO.mostrar_menu_modificar_dada_clients(menu3);
    				
    				switch(opcio_modificar_dada = IO.llegirEnter()) {
    					
    				case 1:
    					System.out.println("Quin es el nom és amb el que és modificara?");
    					String nom_modificat = IO.llegirText();
    					arrayClients [i].setNom(nom_modificat);
    					System.out.println("El usuari: " + arrayClients[i].getNom()+" s'ha modificat correctament");
    					break;
    					
    				case 2:
    					System.out.println("Quin es el cognom1 amb el que és modificara?");
    					String cognom1_modificat = IO.llegirText();
    					arrayClients [i].setCognom1(cognom1_modificat);
    					System.out.println("El usuari: " + arrayClients[i].getCognom1()+" s'ha modificat correctament");
    					break;
    					
    				case 3:
    					System.out.println("Quin es el cognom2 amb el que és modificara?");
    					String cognom2_modificat = IO.llegirText();
    					arrayClients [i].setCognom2(cognom2_modificat);
    					System.out.println("El usuari: " + arrayClients[i].getCognom2()+" s'ha modificat correctament");
    					break;
    					
    				case 4:
    					System.out.println("Quin es el idintificador amb el que és modificara?");
    					String identificador_modificat = IO.llegirText();
    					arrayClients [i].setIdentificador(identificador_modificat);
    					System.out.println("El usuari: " + arrayClients[i].getIdentificador()+" s'ha modificat correctament");
    					break;
    					
    				case 5:
    					System.out.println("Quin es el passwd amb el que és modificara?");
    					String passwd_modificat = IO.llegirText();
    					arrayClients [i].setPasswd(passwd_modificat);
    					System.out.println("El usuari: " + arrayClients[i].getPasswd()+" s'ha modificat correctament");
    					break;
    					
    				case 6:
    					break;
    					
    				case 7:
    					System.out.println("Quin es el targeta amb el que és modificara?");
						((Client) arrayClients[i]).setTargeta(IO.llegirText());
    					System.out.println("El usuari: " + ((Client) arrayClients[i]).getTargeta() +" s'ha modificat correctament");
    					break;
    				}
    			}while(opcio_modificar_dada != 0);
    			
    		}else{
    			
    			trobat = true;
    			System.out.println("Aquest nom no és troba");
                	break;
    			}
    		}
        case 2:
        	
        	boolean trobat2 = false;
            
            System.out.print("Quin usuari desitjes buscar (DNI): ");
            String dni_buscat = IO.llegirText();
    		for(int i=0;i<=totalClients && trobat2 == false;i++){
    			if (dni_buscat.equals(arrayClients[i].getIdentificador())) {
    			
    				System.out.println("Dades: " + arrayClients[i].getNom() + " " + arrayClients[i].getCognom1() + " " + arrayClients[i].getCognom2() + " " + arrayClients[i].getIdentificador() + " " + arrayClients[i].getPasswd() + " " +  ((Client) arrayClients[i]).getTargeta());
    			trobat = true;
    			
    			do {
    				System.out.println("Quina dada vols modificar del objecte  [ " +  arrayClients[i].getNom() + " ] ");
    				IO.mostrar_menu_modificar_dada_clients(menu3);
    				
    				switch(opcio_modificar_dada = IO.llegirEnter()) {
    					
    				case 1:
    					System.out.println("Quin es el nom és amb el que és modificara?");
    					String nom_modificat = IO.llegirText();
    					arrayClients [i].setNom(nom_modificat);
    					System.out.println("El usuari: " + arrayClients[i].getNom()+" s'ha modificat correctament");
    					break;
    					
    				case 2:
    					System.out.println("Quin es el cognom1 amb el que és modificara?");
    					String cognom1_modificat = IO.llegirText();
    					arrayClients [i].setCognom1(cognom1_modificat);
    					System.out.println("El usuari: " + arrayClients[i].getCognom1()+" s'ha modificat correctament");
    					break;
    					
    				case 3:
    					System.out.println("Quin es el cognom2 amb el que és modificara?");
    					String cognom2_modificat = IO.llegirText();
    					arrayClients [i].setCognom2(cognom2_modificat);
    					System.out.println("El usuari: " + arrayClients[i].getCognom2()+" s'ha modificat correctament");
    					break;
    					
    				case 4:
    					System.out.println("Quin es el idintificador amb el que és modificara?");
    					String identificador_modificat = IO.llegirText();
    					arrayClients [i].setIdentificador(identificador_modificat);
    					System.out.println("El usuari: " + arrayClients[i].getIdentificador()+" s'ha modificat correctament");
    					break;
    					
    				case 5:
    					System.out.println("Quin es el passwd amb el que és modificara?");
    					String passwd_modificat = IO.llegirText();
    					arrayClients [i].setPasswd(passwd_modificat);
    					System.out.println("El usuari: " + arrayClients[i].getPasswd()+" s'ha modificat correctament");
    					break;
    					
    				case 6:
    					break;
    					
    				case 7:
    					System.out.println("Quin es el targeta amb el que és modificara?");
						((Client) arrayClients[i]).setTargeta(IO.llegirText());
						System.out.println("El usuari: " + ((Client) arrayClients[i]).getTargeta() +" s'ha modificat correctament");
    					break;
        	
		 }
		}while(opcio_modificar_dada != 0);
		
	}else{
		
		trobat2 = true;
		System.out.println("Aquest DNI no és troba");
     	break;
		}
    }
    		
  }
	 }while(opcio_modificar != 0);
}
}
	 


