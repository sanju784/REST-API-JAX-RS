package org.sanju.jee.REST_API_JAX_RS.database;

import java.util.HashMap;
import java.util.Map;

import org.sanju.jee.REST_API_JAX_RS.model.Message;

public class DatabaseClass {

	private static Map<Long, Message> messages = new HashMap<>();
	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
}
