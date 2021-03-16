package com.oocode;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ListShould {
	@Test
	public void canAnswerTheUniversalQuestion() {
		assertThat(new Example().answer(), is(42));
	}

	@Test
	// The list should be empty when initialised
	public void beEmptyWhenInitialised() {
		RecentlyUsedList list = new RecentlyUsedList();
		assertThat(list.length(), is(0));
	}

	@Test
	//We should be able to add things to the list
	public void ableToAddThingsToTheList() {
		RecentlyUsedList list = new RecentlyUsedList();
		list.addItem("teststring");
		assertThat(list.length(), is(1));
	}


	@Test
	//We should be able to retrieve items from the list
	public void ableToRetrieveItemsFromTheList() {
		RecentlyUsedList list = new RecentlyUsedList();
		list.addItem("teststring");
		assertThat(list.getItem(0), is("teststring"));
	}

	@Test
	//We should be able to retrieve items from the list
	public void ableToRetrieveOtherItemsFromTheList() {
		RecentlyUsedList list = new RecentlyUsedList();
		list.addItem("otherteststring");
		assertThat(list.getItem(0), is("otherteststring"));
	}


	//The most recent item should be first in the list
	public void mostRecentItemAddedShouldReturnFirst() {

	}

	//Items in the list are unique, so duplicate insertions should be moved rather than added.
	public void itemsInListAreUnique() {

	}
}
