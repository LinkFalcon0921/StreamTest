package com.rd.Data.Basic;

public class DatosBasic {
	private String name;
	
	private int edad;
	
	
	private char[] pass;
	
	public DatosBasic() {
		
	}
	
	public DatosBasic(String n, int e, char[] p) {
		name = n;
		edad = e;
		pass = p;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char[] getPass() {
		return pass;
	}

	public void setPass(char[] pass) {
		this.pass = pass;
	}
	
	
	
}
