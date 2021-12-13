package com.rd.Interfaces.Datos;

import com.rd.Data.Basic.DatosBasic;
import com.rd.Data.Element.DtoComponents;
import com.rd.Data.Interfaces.Info.INameGetter;
import com.rd.Data.Interfaces.Info.INameSetter;

public class UsuariosBasic implements IComponents {

	private DtoComponents person;
	
	public void refreshUser(DtoComponents datos) {
		person = new DtoComponents(datos.getId(),new DatosBasic(datos.getName(), datos.getEdad(),datos.getPassword()),datos.getCorreo());
	}
	
	public UsuariosBasic() {
	}
	
	@Override
	public void update(DtoComponents dato) {
		refreshUser(dato);
	}

	@Override
	@Deprecated
	public String Data() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void set(String name) {
		person.setName(name);
	}

	@Override
	public String get() {
		return person.getName();
	}

	@Override
	public int getId() {
		return person.getId();
	}
}
