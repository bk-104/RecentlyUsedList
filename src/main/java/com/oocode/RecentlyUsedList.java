package com.oocode;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class RecentlyUsedList {
	private Collection<String> List = new LinkedList<String>();

	public Integer length() {
		return List.size();
	}

	public void addItem(String item){
		List.add(item);
	}

	public String getItem(Integer index) {
		return "teststring";
	}
}
