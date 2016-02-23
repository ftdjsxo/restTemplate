package it.effesoft.rest.service.helper;

import it.effesoft.rest.service.model.BaseObject;

import java.util.Vector;

public class RestHelper {
	
	private static  BaseObject object;
	
	public static BaseObject getObject() {
		if(object == null)
			object = new BaseObject("1", new Vector<String>());
		return object;
	}

}
