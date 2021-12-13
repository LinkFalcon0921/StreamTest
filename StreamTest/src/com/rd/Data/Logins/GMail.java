package com.rd.Data.Logins;

public class GMail extends Mail {

	public GMail(String baseC) {
		super(baseC);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String get() {
		return String.format(super.get()+ARROBA+GM+POINT+COM);
	}

}
