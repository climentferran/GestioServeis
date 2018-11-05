/**
 * Gestio de zones: classe que conté la funció per a llistar les zones del parc.
 */
package Menu.Zones;

import Biblioteques.IO;
import Constructors.Zona;

import java.text.DecimalFormat;

public class Llistar {
    public static void llistar_zones (Zona[] arrayZones, int totalzones){
        if(totalzones==0){ //Comprovació de si hi ha alguna zona
            IO.imprimirTI("No hi ha cap zona registrada");
        }
        else{
            DecimalFormat df2 = new DecimalFormat(".##");   //Format per als decimals
            IO.imprimirTI("-------------------------------------------------------------------------");
            System.out.printf("%-9s %-14s %-19s %-20s %n", "Codi", "Nom", "Superficie", "Aforament");
            IO.imprimirTI("-------------------------------------------------------------------------");
            for (int i=0; i<totalzones; i++){       //Se imprimeixen totes les zones amb format taula
                System.out.printf("%-10s", i+1);
                System.out.printf("%-15s", arrayZones[i].getNom());
                System.out.printf("%-20s", arrayZones[i].getSuperficie());
                System.out.printf("%-23s %n", arrayZones[i].getAforament());
            }
            IO.imprimirTI("--------------------------------------------------------------------------");
        }
    }
}
