package com.rd.Data.Basic;

import com.rd.Data.Interfaces.Logins.ICorreo;
import com.rd.Data.Logins.GMail;
import com.rd.Data.Logins.HotMail;

public class GenMail {

	public static ICorreo generateCorreo(String name) {
		
		//HOTMAIL
		if(name.toLowerCase().contains(ICorreo.HOT)) {
			return new HotMail(name.substring(0, name.indexOf(ICorreo.ARROBA)));
		}
		//GMAIL
		else if(name.toLowerCase().contains(ICorreo.GM)) {
			return new GMail(name.substring(0, name.indexOf(ICorreo.ARROBA)));
		}
		
		return null;
	}
	
}
