package Constructors;
import Gestio.Main;

public class Incidencia {
    private String titolIncidencia;
    private String descripcioIncidencia;
    private Zona zona;
    private String date;
    private String estat;
    private Client client;
    
    public Incidencia (){
    }

    public Incidencia (Zona z, Client c, String descripcio){
        zona = z;
        client = c;
        descripcioIncidencia = descripcio;
    }
    
    public String gettitolIncidencia(){
        return titolIncidencia;
    }
    
    public String getdescripcioIncidencia(){
        return descripcioIncidencia;
    }
    
    public String getdate(){
        return date;
    }
    
    public String getestat(){
        return estat;
    }

    public Zona getZona(){
        return zona;
    }

    public Client getClient() {return client;}
    
    public void settitolIncidencia(String t){
       this.titolIncidencia = t;
    }
    
    public void setdescripcioIncidencia(String i){
        this.descripcioIncidencia = i;
    }

    public void setdate (String d){
        this.date = d;
    }
    
    public void setestat (String e){
        this.estat = e;
    }

    public void setZona (Zona z){
        zona = z;
    }

    public void setClient (Client c) { client = c;}
}
