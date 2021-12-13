package com.rd.Data.Element;

import com.rd.Data.Basic.DatosBasic;
import com.rd.Data.Basic.GenMail;
import com.rd.Data.Interfaces.Logins.ICorreo;

public class DtoComponents {
	
	private int record;
	DatosBasic info;
	ICorreo email;
	
	public DtoComponents(int id, DatosBasic dato,String baseCorreo) {
		record = id;
		info = dato;
		email = GenMail.generateCorreo(baseCorreo);
	}
	
	public int getId() {
		return record;
	}
	
	//Name
	public String getName() {
		return info.getName();
	}

	public void setName(String name) {
		info.setName(name);
	}
	
	//Edad
	public int getEdad() {
		return info.getEdad();
	}

	public void setEdad(int edad) {
		info.setEdad(edad);
	}

	//Correo
	public String getCorreo() {
		return email.get();
	}

	public void setCorreo(String correo) {
		email.set(correo);
	}

	//Contraseña
	public char[] getPassword() {
		return info.getPass();
	}
	

	public void setPassword(char[] password) {
		info.setPass(password);
	}
	
}
