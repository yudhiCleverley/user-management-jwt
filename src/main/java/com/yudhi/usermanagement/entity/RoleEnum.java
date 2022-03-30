package com.yudhi.usermanagement.entity;

import java.util.HashMap;
import java.util.Map;

public enum RoleEnum {

	ROLE_USER("guest", "Guest"),
	ROLE_MODERATOR("moderator", "Moderator"),
	ROLE_ADMIN("administrator", "Administrator");
	
	private final String id;
	private final String value;
	
	RoleEnum(String id, String value) {
		this.id = id;
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	
	public String getId() {
		return id;
	}
	
	private static final Map<String,RoleEnum> find = new HashMap<String, RoleEnum>();
	static{
		for(RoleEnum t: RoleEnum.values()) find.put(t.getId(), t);
	}
	
	public static String getById(String id) {
		return find.get(id).getValue();
	}
}
