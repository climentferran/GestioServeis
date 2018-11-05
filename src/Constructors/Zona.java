package Constructors;

public class Zona {
    /* Atributs */
    private String nom;
    private double superficie;
    private int aforament;

    /* Constructor */
    public Zona(){
        nom = "";
        superficie=0;
        aforament=0;
    }

    /* GETTERS */
    public String getNom(){
        return nom;
    }

    public double getSuperficie(){
        return superficie;
    }

    public int getAforament(){
        return aforament;
    }

    /* SETTERS */
    public void setNom(String n){
        nom = n;
    }

    public void setSuperficie(double n){
        superficie = n;
    }

    public void setAforament(int n){
        aforament = n;
    }

    /* METODES  */
    public void augmentaAforament(int n){
        aforament += n;
    }

    @Override
    public String toString() {
        String imprimir = getNom();
        return imprimir;
    }
}
