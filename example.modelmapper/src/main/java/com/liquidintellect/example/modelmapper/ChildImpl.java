package com.liquidintellect.example.modelmapper;

public class ChildImpl implements Child {
	private String name;
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

}
