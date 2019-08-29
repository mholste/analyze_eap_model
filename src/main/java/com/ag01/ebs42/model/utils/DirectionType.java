package com.ag01.ebs42.model.utils;

public enum DirectionType 
{
	SOURCE_DEST("Source -> Destination"),
	DEST_SOURCE("Destination -> Source"),
	UNSPECIFIED("Unspecified"),
	BIDIRECTIONAL("Bi-Directional");
	
	private final String description;
	
	DirectionType(String desc)
	{
		description = desc;
	}
}
