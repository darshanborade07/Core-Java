package com.app.custom_ordering;

import java.util.Comparator;

import com.app.entity.Task;

public class TaskDateComparator implements Comparator<Task> {

	@Override
	public int compare(Task t1, Task t2) {
		
		return t1.getTaskDate().compareTo(t2.getTaskDate());
	}
	
}
