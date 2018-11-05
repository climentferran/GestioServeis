/**
 * Gestio de zones: classe que conté la funció per a registrar una zona al parc.
 */
package Menu.Zones;

import Biblioteques.IO;
import Constructors.Zona;

public class Registrar {
    public static int registrar_zona (Zona[] arrayZones, int totalzones){
        arrayZones[totalzones] = new Zona();    //Se inicialitza el objecte
        IO.imprimirTI("------------------------------");
        IO.imprimirTI("Registre de zona");
        IO.imprimirT("Nom: ");
        arrayZones[totalzones].setNom(IO.llegirText());

        IO.imprimirT("Superficie(m2): ");
        arrayZones[totalzones].setSuperficie(IO.llegirDecimal());

        IO.imprimirT("Aforament: ");
        arrayZones[totalzones].setAforament(IO.llegirEnter());

        totalzones = totalzones+1;  //Augmentem el numero de zones registrades
        IO.imprimirTI("Zona registrada correctament");
        return totalzones;
    }
}
