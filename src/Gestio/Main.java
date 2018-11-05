/***
 * Programa per gestionar les incidéncies a cada Zona i per a afegir empleats a serveis. Per a fer-ho, el programa gestiona:
 *          Empleats
 *          Clients
 *          Zones
 *          Incidencies
 *          Serveis
 * Date: 24/10/2018
 * @author Ivan Morte Piñol, Ferrant Climent Vidal, Jose Manuel Febrer Cortés
 * @version v0.5
 */

package Gestio;

import Biblioteques.Auxiliar;
import Biblioteques.IO;
import Constructors.*;

public class Main {

    public final int MAXIM = 1000;    //Maxim de la array
    public Servei[] arrayServeis = new Servei[MAXIM]; //Array que guardara els diferents serveis
    //public Client[] arrayClients = new Client[MAXIM];
    //public Empleat[] arrayEmpleats = new Empleat[MAXIM];
    public Persona[] arrayPersones = new Persona[MAXIM];
    public Incidencia[] arrayIncidencies = new Incidencia[MAXIM];
    public Zona[] arrayZones = new Zona[MAXIM];
    public static int TOTAL_SERVEIS = 0;
    public static int TOTAL_CLIENTS = 0;
    public static int TOTAL_EMPLEATS= 0;
    public static int TOTAL_PERSONES= 0;
    public int TOTAL_INCIDENCIES;
    public  int TOTAL_ZONES = 0;
    int opcio5;

    public static int OPCIONS = 7; //Numero de opcions a llistar
    public static void main(String[] args){
        Main programa = new Main();
        programa.inici(); //Es crida la funcio inici
    }
    void inici(){
        String[] arrayMenu = {"1)Gestio empleats ", "2)Gestio clients ", "3)Gestio zones ", "4)Gestio incidencies ", "5)Gestio serveis" ,"6)Test ", "7)Sortir "};    //Array que guarda les diferents opcions del menu
        int opcio=0;    //Guarda la opcio del menu
        while(opcio!=OPCIONS) {        //Seleccio de la opcio
            opcio = Auxiliar.menu(arrayMenu, OPCIONS);
            switch (opcio) {     //Seleccio de les diferents opcions del menu
                /** GESTIÓ EMPLEATS **/
                case 1:
                    //TOTAL_EMPLEATS = Gestio_empleats.gestio(arrayEmpleats, TOTAL_EMPLEATS);
                    break;
                /** GESTIÓ CLIENTS **/
                case 2:
                    TOTAL_CLIENTS = Gestio_clients.gestio(arrayPersones, TOTAL_PERSONES);
                    break;
                /** GESTIÓ ZONES **/
                case 3:
                    TOTAL_ZONES = Gestio_zones.gestio(arrayZones, TOTAL_ZONES, MAXIM);
                    break;
                /** GESTIÓ INCIDENCIES **/
                case 4:
                    do{
                    	opcio5 = Auxiliar.menu(Gestio_incidencies.arrayMenu, Gestio_incidencies.OPCIONS);
                        switch (opcio5) {
                       
                            case 1:
                               int resultat=Gestio_incidencies.Alta(arrayIncidencies, TOTAL_INCIDENCIES, MAXIM, arrayZones, TOTAL_ZONES, arrayPersones, TOTAL_PERSONES);
                               IO.imprimirEI(resultat);
                               TOTAL_INCIDENCIES = resultat;
                                break;
                            case 2:
                                opcio5 = Auxiliar.menu(Gestio_incidencies.arrayMenu_llistar, Gestio_incidencies.OPCIONS_LLISTAR);
                                Gestio_incidencies.Llistar(arrayIncidencies, TOTAL_INCIDENCIES, opcio5);
                                break;
                            case 3:
                               Gestio_incidencies.Tancar(arrayIncidencies, TOTAL_INCIDENCIES);
                               //TOTAL_INCIDENCIES = resultat2; 
                                break;
                            case 4:
                            	Gestio_incidencies.Modificar(arrayIncidencies, TOTAL_INCIDENCIES);
                            	break;
                                
                        }
                    //Gestio_incidencies.gestio(arrayIncidencies, TOTAL_INCIDENCIES);
                    
                    }while(opcio5!=0);
                    
                    break;

                /** GESTIÓ SERVEIS **/
                case 5:
                    TOTAL_SERVEIS = Gestio_serveis.gestio(arrayServeis, TOTAL_SERVEIS);
                    break;
                /** TEST **/
                case 6:
                    break;
                /** SORTIR **/
                case 7:
                    IO.imprimirT("Estàs segur de que vols sortir del programa? (Si/No): ");
                    String confirmacio = IO.llegirText();
                    if(Auxiliar.confirmacio(confirmacio)) {
                        break;
                    }
                    else{
                        inici();
                    }
            }
        }
    }
}
