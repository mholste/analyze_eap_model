package com.ag01.ebs42.model.utils;

public enum InterfaceType 
{
	REQUIRED("RequiredInterface"),
	PROVIDED("ProvidedInterface");
	
	private final String description;
	
	InterfaceType(String desc)
	{
		description = desc;
	}
}
