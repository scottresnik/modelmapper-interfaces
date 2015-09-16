package com.liquidintellect.example.modelmapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

public class App {
	public static void main(String[] args) {
		App app = new App();
		Owner owner = new Owner();
		owner.setOwnerId("OwnerName");
		owner.setPossession(new Possession());
		owner.getPossession().setPossessionId("PossessionName");
		Parent parent = new ParentImpl();
		parent.setChild(new ChildImpl());
		app.convert(owner, parent);
	}

	private ModelMapper mapper;

	public App() {
		mapper = new ModelMapper();
		mapper.addMappings(new PropertyMap<Possession, Child>() {

			@Override
			protected void configure() {
				map().setName(source.getPossessionId());
			}
		});
		mapper.addMappings(new PropertyMap<Owner, Parent>() {

			@Override
			protected void configure() {
				map().setName(source.getOwnerId());
			}
		});
	}

	public void convert(Owner owner, Parent parent) {
		mapper.map(owner, parent);
		if (owner.getPossession() != null && parent.getChild() != null) {
			mapper.map(owner.getPossession(), parent.getChild());
		}
	}
}
