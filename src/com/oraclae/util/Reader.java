package com.oraclae.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@SuppressWarnings("serial")
public class Reader extends Properties{
	private static Reader reader;
	private Reader(){
		InputStream is=this.getClass().getResourceAsStream("ÅäÖÃÎÄ¼ş");
		try {
			super.load(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Reader getReader(){
		if(reader!=null){
			return reader;
		}
		return new Reader();
	}
}
