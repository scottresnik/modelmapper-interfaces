package com.liquidintellect.example.modelmapper;

public class ParentImpl implements Parent {
	private String name;
	private Child child;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Child getChild() {
		return child;
	}

	public void setChild(Child child) {
		this.child = child;
	}

}
