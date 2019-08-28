package com.ag01.ebs42.model.arc42;

public enum ConnectionType 
{
	DEPENDENCY("Dependency"),
	GENERALIZATIOM("Generalization"),
	AGGREGATION("Aggregation"),
	ASSOCIATION("Association"),
	REALISATION("Realization"),
	CONTROL_FLOW("ControlFlow"),
	OBJECT_FLOW("ObjectFlow"),
	INFORMATION_FLOW("InformationFlow");
	
	private final String description;
	
	ConnectionType(String desc)
	{
		description = desc;
	}
}
