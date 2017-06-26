package com.techzealot.smart.entities.security;

import com.techzealot.smart.enums.ResourceType;

public interface Resource {
	String getName();	
	ResourceType getType();
	Order getOrder();
}
