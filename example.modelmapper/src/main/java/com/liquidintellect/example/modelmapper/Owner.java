package com.liquidintellect.example.modelmapper;

public class Owner {

	private String ownerId;
	private Possession possession;

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerName) {
		this.ownerId = ownerName;
	}

	public Possession getPossession() {
		return possession;
	}

	public void setPossession(Possession possession) {
		this.possession = possession;
	}
}
