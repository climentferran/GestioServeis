/***
 * Gestio de zones: Part del programa que gestiona les diferents zones del parc.
 */


package Gestio;

import Biblioteques.Auxiliar;
import Biblioteques.IO;
import Constructors.Zona;

public class Gestio_zones {
    public static int OPCIONS = 6;

    public static int gestio(Zona[] arrayZones, int totalZones, int maxim_zones){

        String[] arrayMenu = {"1)Registrar zona ", "2)Llistar zones ", "3)Modificar zona ", "4)Eliminar zona ", "5)Test" ,"6)Enrere "};    //Array que guarda les diferents opcions del menu
        int opcio=0;    //Guarda la opcio del menu
        while(opcio!=OPCIONS) {        //Seleccio de la opcio
            opcio = Auxiliar.menu(arrayMenu, OPCIONS);
            switch (opcio) {     //Seleccio de les diferents opcions del menu
                /** REGISTRAR ZONA **/
                case 1:
                    if (Auxiliar.comprovar_llargaria(maxim_zones, totalZones)){     //Comprovacio de la llargaria de la array que guarda les zones
                        totalZones = Menu.Zones.Registrar.registrar_zona(arrayZones, totalZones);
                    }
                    else {
                        IO.imprimirTI("No caben mes zones, contacta amb l'administrador.");
                    }
                    break;
                /** LLISTAR ZONES **/
                case 2:
                    Menu.Zones.Llistar.llistar_zones(arrayZones, totalZones);
                    if (totalZones>0){      //Si hi ha alguna zona registrada, demanarà presionar intro per a tornar al menu
                        IO.imprimirTI("Presiona intro per a tornar al menú... ");
                        boolean aleatori = IO.comprovarText();
                    }
                    break;
                /** MODIFICAR ZONES **/
                case 3:
                    Menu.Zones.Modificar.zones(arrayZones, totalZones);
                    break;
                /** ELIMINAR ZONES **/
                case 4:
                    totalZones = Menu.Zones.Eliminar.eliminar_zona(arrayZones, totalZones);
                    break;
                /** TEST **/
                case 5:
                    if (Auxiliar.comprovar_llargaria(maxim_zones, totalZones+3)){       //Comprovara que hi hague espai per a inserir els elements i procedira a inserir 3 elements a la array de zones
                        totalZones = Menu.Zones.Test.carregar_zones(arrayZones, totalZones);
                    }else {
                        IO.imprimirTI("No caben mes zones, contacta amb el administrador.");
                    }
                    break;
                /** ENRERE **/
                case 6:
                    break;
            }
        }
            return totalZones;
    }
}
