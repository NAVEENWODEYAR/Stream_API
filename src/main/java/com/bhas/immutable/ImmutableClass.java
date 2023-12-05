package com.bhas.immutable;

public final class ImmutableClass 
{
	private final int clsId;
	private final String clsName;
	
	private ImmutableClass(int id,String name)
	{
		this.clsName = name;
		this.clsId = id;
	}
}
