package com.liquidintellect.example.modelmapper;

public interface Parent {

	String getName();
	void setName(String name);
	
	Child getChild();
	void setChild(Child child);
}
