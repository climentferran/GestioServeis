/**
 * Gestio de zones: classe que conté la funció per a eliminar una zona del parc.
 */
package Menu.Zones;

import Biblioteques.Auxiliar;
import Biblioteques.IO;
import Constructors.Zona;

public class Eliminar {
    public static int eliminar_zona (Zona[] arrayZones, int totalzones){
        if(totalzones==0){ //Comprovació de si hi ha alguna zona
            IO.imprimirTI("------------------------------");
            IO.imprimirTI("No hi ha cap zona registrada");
        }else {             //Si hi ha alguna zona passa a eliminar
            IO.imprimirTI("------------------------------");
            IO.imprimirTI("Quina zona vols eliminar?");
            Menu.Zones.Llistar.llistar_zones(arrayZones, totalzones);       //Es llisten les diferents zones
            IO.imprimirT("Códi de la zona a eliminar: ");
            int codi = IO.llegirEnter();
            if (codi<=totalzones && codi>0){
                IO.imprimirT("Estàs segur de que vols eliminar la zona? no es podràn recuperar les dades (Si/No): ");
                String confirmacio = IO.llegirText();       //Es confirma que es vulgue eliminar la zona
                if(Auxiliar.confirmacio(confirmacio)){
                    codi = codi-1;
                    for ( int i = codi ; i < totalzones - 1 ; i++ )   //Bucle que elimina la zona seleccionada i mou la resta una posicio
                    {
                        arrayZones[ i ] = arrayZones[ i + 1 ] ;
                    }
                    IO.imprimirTI("Zona eliminada.");
                    totalzones = totalzones-1;
                }
            }
            else {
                IO.imprimirTI("------------------------------");
                IO.imprimirTI("Introdueix un codi vàlid");
            }
        }
            return totalzones;
    }
}
