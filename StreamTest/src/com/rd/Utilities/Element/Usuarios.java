package com.rd.Utilities.Element;

import java.util.ArrayList;
import java.util.List;

import com.rd.Data.Element.DtoComponents;
import com.rd.Interfaces.Datos.IComponents;

public class Usuarios {
	List<IComponents> comp;
	
	public Usuarios() {
		comp = new ArrayList<IComponents>();
	}
	
	public void Add(IComponents user) {
		comp.add(user);
	}
	
	public IComponents get(int id) {
		
		IComponents t = comp.stream().filter(y -> y.getId()== id).findFirst().get();
		
		if(t != null) {
			return t;
		}
		
		return null;
	}
	
	public void update(DtoComponents dato) {
		IComponents t = get(dato.getId());
		
		if(t != null ) t.update(dato);
	}
	
	public int size() {
		return comp.size();
	}
}
