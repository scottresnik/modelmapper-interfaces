package com.liquidintellect.example.modelmapper;

import static org.hamcrest.core.Is.is;

import org.junit.Test;

import static org.junit.Assert.assertThat;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	public void testMapping() {
		Owner owner = new Owner();
		owner.setOwnerId("OwnerName");
		owner.setPossession(new Possession());
		owner.getPossession().setPossessionId("PossessionName");
		Parent parent = new ParentImpl();
		parent.setChild(new ChildImpl());
		App app = new App();
		app.convert(owner, parent);
		assertThat(parent.getName(), is(owner.getOwnerId()));
		assertThat(parent.getChild().getName(), is(owner.getPossession().getPossessionId()));
	}
}
