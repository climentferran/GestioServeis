package Constructors;

public class Persona {
	/* Atributs */
    protected String nom;
	protected String cognom1;
	protected String cognom2;
	protected String identificador;
	protected String passwd;
    
    public Persona() {
    }

	public String getNom() {
		return nom;
	}


	public void setNom(String n) {
		nom = n;
	}


	public String getCognom1() {
		return cognom1;
	}


	public void setCognom1(String c1) {
		cognom1 = c1;
	}


	public String getCognom2() {
		return cognom2;
	}


	public void setCognom2(String c2) {
		cognom2 = c2;
	}


	public String getIdentificador() {
		return identificador;
	}


	public void setIdentificador(String i) {
		identificador = i;
	}


	public String getPasswd() {
		return passwd;
	}


	public void setPasswd(String pwd) {
		passwd = pwd;
	}

	@Override
	public String toString() {
		String imprimir = getNom();
		return imprimir;
	}
}
