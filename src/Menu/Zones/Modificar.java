/**
 * Gestio de zones: classe que conté la funció per a modificar els diferents atributs de les zones del parc.
 */
package Menu.Zones;

import Biblioteques.Auxiliar;
import Biblioteques.IO;
import Constructors.Zona;

public class Modificar {
    public static void zones(Zona[] arrayZones, int totalZones) {
        if(totalZones==0){ //Comprovació de si hi ha alguna zona
            IO.imprimirTI("------------------------------");
            IO.imprimirTI("No hi ha cap zona registrada");
        }else{
            Menu.Zones.Llistar.llistar_zones(arrayZones, totalZones);       //Es llisten les zones registrades
            IO.imprimirT("Quin servei vols modificar? (Introdueix el codi): ");
            int codi = IO.llegirEnter();
            if (codi<=totalZones && codi>0){
                IO.imprimirTI("------------------------------");
                IO.imprimirTI("Quin atribut vols modificar?: ");
                String[] arrayAtributs = {"1)Nom ", "2)Superficie(m2) ", "3)Aforament ", "4)Augmentar aforament ", "5)Enrere"};
                int opcio=0;    //Guarda la opcio del menu
                while(opcio!=arrayAtributs.length) {        //Seleccio de la opcio
                    opcio = Auxiliar.menu_secundari(arrayAtributs, arrayAtributs.length);
                    switch (opcio) {
                        /** NOM */
                        case 1:
                            IO.imprimirT("Nou nom: ");
                            arrayZones[codi-1].setNom(IO.llegirText());
                            IO.imprimirTI("------------------------------");
                            IO.imprimirTI("Atribut modificat");
                            return;
                        /** SUPERFICIE */
                        case 2:
                            IO.imprimirT("Nova superficie: ");
                            arrayZones[codi-1].setSuperficie(IO.llegirDecimal());
                            IO.imprimirTI("------------------------------");
                            IO.imprimirTI("Atribut modificat");
                            return;
                        /** AFORAMENT */
                        case 3:
                            IO.imprimirT("Nou aforament: ");
                            arrayZones[codi-1].setAforament(IO.llegirEnter());
                            IO.imprimirTI("------------------------------");
                            IO.imprimirTI("Atribut modificat");
                            return;
                        /** AUGMENTAR AFORAMENT */
                        case 4:
                            IO.imprimirT("Aforament a augmentar: ");
                            arrayZones[codi-1].augmentaAforament(IO.llegirEnter());
                            IO.imprimirTI("------------------------------");
                            IO.imprimirTI("Aforament augmentat");
                            return;
                        /** ENRERE */
                        case 5:
                            zones(arrayZones, totalZones);
                            break;
                    }
                }
            }else {
                IO.imprimirTI("------------------------------");
                IO.imprimirTI("Error: Introdueix un codi vàlid");
                zones(arrayZones, totalZones);
            }

        }
    }
}
