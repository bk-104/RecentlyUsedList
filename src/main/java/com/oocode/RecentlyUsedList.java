package com.oocode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class RecentlyUsedList {
	private ArrayList<String> List = new ArrayList<>();

	public Integer length() {
		return List.size();
	}

	public void addItem(String item){
		List.remove(item);
		List.add(0, item);

	}

	public String getItem(Integer index) {
		return List.get(index);
	}
}
