package com.oocode;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Test;

import java.util.Random;

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
		String value= RandomString.getAlphaNumericString(10);
		list.addItem(value);
		assertThat(list.getItem(0), is(value));
	}

	//The most recent item should return first
	@Test
	public void mostRecentItemAddedShouldReturnFirst() {
		RecentlyUsedList list = new RecentlyUsedList();
		String value = RandomString.getAlphaNumericString(10);
		list.addItem(value);
		String value1 = RandomString.getAlphaNumericString(10);
		list.addItem(value1);
		assertThat(list.getItem(0), is(value1));
		assertThat(list.getItem(1), is(value));
	}


	@Test
	//Items in the list are unique, so duplicate insertions should be moved rather than added.
	public void duplicateInsertionGoesToTop() {
		RecentlyUsedList list = new RecentlyUsedList();
		String value = RandomString.getAlphaNumericString(10);
		String value1 = RandomString.getAlphaNumericString(10);
		list.addItem(value);
		list.addItem(value1);
		list.addItem(value);
		assertThat(list.getItem(0), is(value));
	}

    @Test
	public void itemsInListAreUnique() {
		RecentlyUsedList list = new RecentlyUsedList();
		String value = RandomString.getAlphaNumericString(10);
		String value1 = RandomString.getAlphaNumericString(10);
		list.addItem(value);
		list.addItem(value1);
		list.addItem(value);
		assertThat(list.length(), is(2));
	}

}


