package Gestio;

import Biblioteques.Auxiliar;
import Biblioteques.IO;
import Constructors.Client;
import Constructors.Incidencia;
import Constructors.Persona;
import Constructors.Zona;

public class Gestio_incidencies {
    /*public static int gestio(Incidencia[] arrayIncidencies, int totalIncidencies){

        return totalIncidencies;
    }*/
    public static int OPCIONS = 6;
    public static int OPCIONS_LLISTAR = 4;
    public static int OPCIONS_MODIFICAR = 5;


    public static String[] arrayMenu = {"1)Registrar Incidencia ", "2)Llistar Incidencies ", "3)Tancar Incidencia ", "4)Modificar Incidencia", "5)Test" ,"0)Enrere "};    //Array que guarda les diferents opcions del menu
    public static String[] arrayMenu_llistar = {"1)Llistar totes les Incidencies ", "2)Llistar Incidencies fetes ", "3)Llistar Incidencies per a fer ","0)Enrere "};    //Array que guarda les diferents opcions del menu
    public static String[] arrayMenu_modificar = {"1)Titol de la Incidencia ", "2)Descripcio de la Incidencia","3)Lloc de la Incidencia ", "4)Data de la Incidencia ", "0)Enrere"};    //Array que guarda les diferents opcions del menu

    
    public static int Alta(Incidencia[]arrayIncidencies, int TOTAL_INCIDENCIES, int MAXIM, Zona[]arrayZones, int TOTAL_ZONES, Persona[] arrayPersones, int TOTAL_PERSONES){
    //    int TOTAL_INCIDENCIES = 0;
        if(TOTAL_INCIDENCIES==MAXIM){
            System.out.println("No es poden introduir mes incidencies");
        }else{
            arrayIncidencies[TOTAL_INCIDENCIES]= new Incidencia();//crea objecte
            IO.imprimirTI("Seleciona la zona desitjada (ID)");
            IO.imprimirTI("ID  Zona");

            /** INTRODUCCIO DE ZONA */
            for(int i=0;i<TOTAL_ZONES;i++) {
                IO.imprimirT(i+1 + " ");
                IO.imprimirTI(arrayZones[i].getNom());
            }
            arrayIncidencies[TOTAL_INCIDENCIES].setZona(arrayZones[IO.llegirEnter()-1]);

            /** INTRODUCCIO CLIENT */
            IO.imprimirTI("Amb quin usuari has iniciat sessio? (ID)");
            IO.imprimirTI("ID  Nom");
            for(int i=0;i<TOTAL_ZONES;i++) {
                if (arrayPersones[i] instanceof Client){
                    IO.imprimirT(i+1 + " ");
                    IO.imprimirTI(arrayPersones[i].getNom());
                }
            }
            arrayIncidencies[TOTAL_INCIDENCIES].setClient((Client)arrayPersones[IO.llegirEnter()-1]);


            IO.imprimirTI("Introdueix les dades");
            IO.imprimirTI("Titol de la Incidencia: ");
            arrayIncidencies[TOTAL_INCIDENCIES].settitolIncidencia(IO.llegirText());
            IO.imprimirTI("Descripcio de la Incidencia: ");
            arrayIncidencies[TOTAL_INCIDENCIES].setdescripcioIncidencia(IO.llegirText());
            IO.imprimirTI("Data: ");
            arrayIncidencies[TOTAL_INCIDENCIES].setdate(IO.llegirText());
            arrayIncidencies[TOTAL_INCIDENCIES].setestat("TO-DO");



        IO.imprimirTI("La Incidencia: "+arrayIncidencies[TOTAL_INCIDENCIES].gettitolIncidencia()+" s'ha introduit correctament");
        TOTAL_INCIDENCIES ++;
        }
        return TOTAL_INCIDENCIES;
    }
    
    public static void Llistar (Incidencia[]arrayIncidencies, int TOTAL_INCIDENCIES, int opcio5){

           switch (opcio5) {
            case 1:                        
                for (int i=0; i<TOTAL_INCIDENCIES;i++){
                 System.out.println(arrayIncidencies[i].gettitolIncidencia()+" "+arrayIncidencies[i].getdescripcioIncidencia()+" "+ arrayIncidencies[i].getZona() + " " + arrayIncidencies[i].getClient()+ " " + arrayIncidencies[i].getdate()+" "+arrayIncidencies[i].getestat());
                }
                break;
            case 2:
            String estat_fi = "DONE";
               for (int i=0; i<TOTAL_INCIDENCIES;i++){
                   if(arrayIncidencies[i].getestat().equals(estat_fi)){
                       System.out.println(arrayIncidencies[i].gettitolIncidencia() + " " + arrayIncidencies[i].getdescripcioIncidencia() + " " + arrayIncidencies[i].getZona() + " " + arrayIncidencies[i].getClient() + " " + arrayIncidencies[i].getdate() + " " + arrayIncidencies[i].getestat());
                   }
                }
               break;
            case 3:
                String estat_no = "TO-DO";
                for (int i=0; i<TOTAL_INCIDENCIES;i++){
                   if(arrayIncidencies[i].getestat().equals(estat_no)){
                       System.out.println(arrayIncidencies[i].gettitolIncidencia() + " " + arrayIncidencies[i].getdescripcioIncidencia()  + " " + arrayIncidencies[i].getZona() + " " + arrayIncidencies[i].getClient() + " " + arrayIncidencies[i].getdate() + " " + arrayIncidencies[i].getestat());
                   }
                }
                break;
           }
    }
    
    
    public static void Tancar (Incidencia[] arrayIncidencies, int TOTAL_INCIDENCIES){
        /**Llistar incidencies */
        for (int i=0; i<TOTAL_INCIDENCIES;i++){
            System.out.println(arrayIncidencies[i].gettitolIncidencia()+" "+arrayIncidencies[i].getdescripcioIncidencia()+" "+ arrayIncidencies[i].getZona() + " " + arrayIncidencies[i].getClient()+ " " + arrayIncidencies[i].getdate()+" "+arrayIncidencies[i].getestat());
        }
        IO.imprimirT("Nom de la incidencia: ");
        String nom_buscat = IO.llegirText();
        String estat_fi = "DONE";
        boolean shaTrobat = false;
        for (int i = 0; i < arrayIncidencies.length && shaTrobat == false; i++) {
            if (nom_buscat.equals(arrayIncidencies[i].gettitolIncidencia())) {
                shaTrobat = true;
                if(arrayIncidencies[i].getestat().equals(estat_fi)){
                    IO.imprimirTI("Aquesta incidencia ja estava finalitzada");
                }else{
                    arrayIncidencies[i].setestat(estat_fi);
                }
                break;
            } else {
                /*System.out.println("aixo no esta");*/
            }
        }
        shaTrobat = false;
    }
    
    public static void Modificar (Incidencia[] arrayIncidencies, int TOTAL_INCIDENCIES){
        int opcio5;
        do {
            opcio5 =1;

            switch (opcio5) {
                case 1:
                    int opcio4;
                    IO.imprimirTI("Que incidencia vol cercar (Introdueix el nom)?");
                    String nom_buscat3 = IO.llegirText();
                    for (int i = 0; i < TOTAL_INCIDENCIES; i++) {
                        if (nom_buscat3.equals(arrayIncidencies[i].gettitolIncidencia())) {
                            do {
                                IO.imprimirTI("Que vols modificar?");
                                opcio4 = Auxiliar.menu(arrayMenu_modificar, OPCIONS_MODIFICAR);
                                switch (opcio4) {
                                    case 1:
                                        System.out.println("Introdueix el nou Titol de la incidencia:");
                                        String nouTitol = IO.llegirText();
                                        arrayIncidencies[i].settitolIncidencia(nouTitol);
                                        System.out.println("El titol s'ha modificat correctament");
                                        break;
                                    
                                    case 2:
                                        System.out.println("Introdueix la nova descripcio de la incidencia:");
                                        String nouDes = IO.llegirText();
                                        arrayIncidencies[i].settitolIncidencia(nouDes);
                                        System.out.println("La descripcio s'ha modificat correctament");
                                        break;
                                    
                                    case 3:
                                        System.out.println("Introdueix el nou lloc de la incidencia:");
                                        String nouLloc = IO.llegirText();
                                        arrayIncidencies[i].settitolIncidencia(nouLloc);
                                        System.out.println("El lloc s'ha modificat correctament");
                                        break;
                                    
                                    case 4:
                                        System.out.println("Introdueix la nova data de la incidencia:");
                                        String nouDate = IO.llegirText();
                                        arrayIncidencies[i].settitolIncidencia(nouDate);
                                        System.out.println("La descripcio s'ha modificat correctament");
                                        break;
                                        
                                
                                }
                            }while(opcio4!=0);
                        }
                    }opcio5=0;
                }
            }while(opcio5!=0);
    }
}
