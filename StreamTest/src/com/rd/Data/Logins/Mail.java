package com.rd.Data.Logins;

import com.rd.Data.Interfaces.Logins.ICorreo;

public abstract class Mail implements ICorreo {
	
	private StringBuilder base; 

	public Mail(String baseC) {
		set(baseC);
	}
	
	@Override
	public String get() {
		// TODO Auto-generated method stub
		return base.toString();
	}

	@Override
	public void set(String name) {
		base = new StringBuilder(name);

	}

}
