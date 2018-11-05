/**
 * Classe que conté les diferents funcions de entrada i sortida
 */

package Biblioteques;

import java.util.InputMismatchException;
import java.util.Scanner;
import Gestio.Gestio_clients;

public class IO {
    public static void imprimirT(String text) {  //Funció per a imprimir text sense salt de linia
        System.out.print(text);
    }
    public static void imprimirTI(String text) { //Funció per a imprimir text amb un salt de linia
        System.out.println(text);
    }

    public static void imprimirE(int n) { //Funció per a imprimir enter amb un salt de linia
        System.out.println(n);
    }

    public static void imprimirEI(int n) { //Funció per a imprimir enter sense un salt de linia
        System.out.println(n);
    }

    public static int llegirEnter() {  //Funcio per a llegir enters
        int n = 0;
        boolean error = true;
        while(error){    //Comprova que no hi haguin errors en la entrada
            try{
                Scanner sc = new Scanner(System.in);
                n = sc.nextInt();
                error = false;
            }catch (InputMismatchException e){
                imprimirT("Error, introdueix un valor valid: ");
            }
        }
        return n;
    }

    public static double llegirDecimal() {  //Funcio per a llegir enters
        double n = 0;
        boolean error = true;
        while(error){    //Comprova que no hi haguin errors en la entrada
            try{
                Scanner sc = new Scanner(System.in);
                n = sc.nextDouble();
                error = false;
            }catch (InputMismatchException e){
                imprimirT("Error, introdueix un valor valid: ");
            }
        }
        return n;
    }

    public static String llegirText(){  //Funcio per a llegir cadenes de text
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        return text;
    }

    public static boolean llegirBoolean(){  //Funcio per a llegir boolean
        boolean bool = false;
        boolean error = true;
        while (error){
            try {
                Scanner sc = new Scanner(System.in);
                bool = sc.nextBoolean();
                error = false;
            }catch (InputMismatchException e){
                imprimirT("Error, introdueix un valor valid: ");
            }
        }
        return bool;
    }

    public static String entrarText(String missatgeExplicatiu){ //Funcio que mostra un missatge explicatiu i llig text
        imprimirTI(missatgeExplicatiu);

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        return text;
    }

    public static boolean comprovarText(){      //Funcio que comprova si hi ha text;
        Scanner sc = new Scanner(System.in);
        boolean comprovacio = sc.hasNextLine();
        return comprovacio;
    }

    //* Funcio per mostrar el menu de principal dels clients
    public static void mostrar_menu_principal_clients(Gestio_clients menu1){
        for(int i=0;i<menu1.menu_principal_clients.length;i++){
            System.out.println(menu1.menu_principal_clients[i]);
        }
    }

    //* Funcio per mostrar el menu de baixa dels clients
    public static void mostrar_menu_baixa_clients(Gestio_clients menu1) {
        for (int i = 0; i < menu1.menu_baixa_clients.length; i++) {
            System.out.println(menu1.menu_baixa_clients[i]);
        }
    }

    //* Funcio per mostrar el menu de modificar dels clients
    public static void mostrar_menu_modificar_clients(Gestio_clients menu1) {
        for (int i = 0; i < menu1.menu_modificar_clients.length; i++) {
            System.out.println(menu1.menu_modificar_clients[i]);
        }
    }

    //* Funcio per mostrar el menu de modificar dada dels clients
    public static void mostrar_menu_modificar_dada_clients(Gestio_clients menu1) {
        for (int i = 0; i < menu1.menu_modificar_dada_clients.length; i++) {
            System.out.println(menu1.menu_modificar_dada_clients[i]);
        }
    }

}

