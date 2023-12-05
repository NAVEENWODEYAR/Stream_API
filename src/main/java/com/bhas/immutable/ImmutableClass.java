package com.bhas.immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// make the class final, doesn't allows to extend or subClassed,
public final class ImmutableClass 
{
	// Encapsulate the state of the object by making fields private and final. 
	private final int clsId;
	private final String clsName;
	private final List<String> classPropertis;
	
	// Ensure no mutable objects are exposed:
	public ImmutableClass(int id,String name,List<String> list)
	{
		this.clsName = name;
		this.clsId = id;
		this.classPropertis = new ArrayList<>(list);
	}
	
	// Provide only getters, no setters,
	public int getId()
	{
		return this.clsId;
	}
	
	public String getName()
	{
		return this.clsName;
	}
	
	public List<String> getProperties()
	{
		return Collections.unmodifiableList(classPropertis);
	}
	

}
