package Gestio;

import Biblioteques.IO;
import Constructors.Client;
import Constructors.Persona;


public class Gestio_clients {
	
	public String [] menu_principal_clients = new String [5];
    public String [] menu_baixa_clients = new String [3];
    public String [] menu_modificar_clients = new String [3];
    public String [] menu_modificar_dada_clients = new String [9];
    
    public Gestio_clients() {
    	
        menu_principal_clients[0]="[1] -Donar d'alta a una nova persona";
        menu_principal_clients[1]="[2] -Donar de baixa a una persona";
        menu_principal_clients[2]="[3] -Modificar persona";
        menu_principal_clients[3]="[4] -Llistat de persones"; 
        menu_principal_clients[4]="[0] -Tancar el programa";
        System.out.println("Tria una opcio: ");
               
        menu_baixa_clients[0]="1. -Cercar per Nom";
        menu_baixa_clients[1]="2. -Cercar per DNI";
        menu_baixa_clients[2]="0. -Sortir";
       
        menu_modificar_clients[0]="1. -Cercar per Nom";
        menu_modificar_clients[1]="2. -Cercar per DNI";
        menu_modificar_clients[2] ="0. -Sortir";
        //System.out.println("Tria una opcio: ");
        
        menu_modificar_dada_clients[0] ="1.Nom";
        menu_modificar_dada_clients[1] ="2.Cognom1";
        menu_modificar_dada_clients[2] ="3.Cognom2";
        menu_modificar_dada_clients[3] ="4.Idintificador";
        menu_modificar_dada_clients[4] ="5.Contrasenya";
        menu_modificar_dada_clients[5] ="6.Idintificador Client";
        menu_modificar_dada_clients[6] ="7.Tipus de client";
        menu_modificar_dada_clients[7] ="8.Targeta";
        menu_modificar_dada_clients[8] ="0.Sortir";
        //System.out.println("Tria una opcio: ");
    }
    
    public static int gestio(Persona[] arrayClients, int totalClients){
    	
    	Gestio_clients menu1 = new Gestio_clients();
    	int opcio = 0;
        
    	 do {
    		 Biblioteques.IO.mostrar_menu_principal_clients(menu1);
    		 switch(opcio = IO.llegirEnter()) {
    		 
    		 case 1:
                 totalClients = Menu.Clients.Alta.ingresardades(arrayClients, totalClients);
    			 break;
    			 
    		 case 2:
        		 Menu.Clients.Eliminar.eliminarClient(arrayClients, totalClients);
    			 break;
    			 
    		 case 3:
    			Menu.Clients.Modificar.modificarPersona(arrayClients, totalClients);
    			 break;
    			 
    		 case 4:
    			 Menu.Clients.Llistar.llistarArray2(arrayClients, totalClients);
    			 
    			 break;
    		 }
    		 
    	
    	 } while(opcio !=0);
    	
        return totalClients;
    }
}
