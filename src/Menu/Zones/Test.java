/**
 * Gestio de zones: classe que conté la funció per a registrar 3 zones al parc per a la realitzacio de proves.
 */

package Menu.Zones;

import Biblioteques.IO;
import Constructors.Zona;

public class Test {
    public static int carregar_zones (Zona[] arrayZones, int totalzones) {


        /** Lavabos B1 */
        arrayZones[totalzones] = new Zona();
        arrayZones[totalzones].setNom("Lavabos B1");
        arrayZones[totalzones].setSuperficie(5.2);
        arrayZones[totalzones].setAforament(10);
        totalzones = totalzones+1;

        /** Dragon can */
        arrayZones[totalzones] = new Zona();
        arrayZones[totalzones].setNom("Dragon can");
        arrayZones[totalzones].setSuperficie(200.5);
        arrayZones[totalzones].setAforament(20);
        totalzones = totalzones+1;

        /** Hotel */
        arrayZones[totalzones] = new Zona();
        arrayZones[totalzones].setNom("Hotel");
        arrayZones[totalzones].setSuperficie(300);
        arrayZones[totalzones].setAforament(2000);
        totalzones = totalzones+1;

        IO.imprimirTI("------------------------------");
        IO.imprimirTI("Carregats elements per a proves a la array\n");
        return totalzones;
    }
}
