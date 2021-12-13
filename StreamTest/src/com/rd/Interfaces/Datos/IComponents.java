package com.rd.Interfaces.Datos;

import com.rd.Data.Element.DtoComponents;
import com.rd.Data.Interfaces.Info.INameGetter;
import com.rd.Data.Interfaces.Info.INameSetter;

public interface IComponents extends INameGetter,INameSetter{
	
	void update(DtoComponents dato);
	
	int getId();
	
	String Data();
	
}
