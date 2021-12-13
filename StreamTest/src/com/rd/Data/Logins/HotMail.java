package com.rd.Data.Logins;

public class HotMail extends Mail {

	public HotMail(String baseC) {
		super(baseC);
	}
	
	@Override
	public String get() {
		return String.format(super.get()+ARROBA+HOT+POINT+COM);
	}

}
