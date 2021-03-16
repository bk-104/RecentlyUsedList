package com.oocode;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ListShould {
	@Test
	public void canAnswerTheUniversalQuestion() {
		assertThat(new Example().answer(), is(42));
	}

	@Test
	public void beEmptyWhenInitialised() {
		RecentlyUsedList list = new RecentlyUsedList();
		assertThat(list.getEntries().isEmpty());
	}
}
