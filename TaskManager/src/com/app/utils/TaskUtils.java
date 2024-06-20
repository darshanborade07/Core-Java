package com.app.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.app.entity.Status;
import com.app.entity.Task;

public class TaskUtils {

	public static void deleteTask(String taskName, Map<Integer, Task> taskMap) {
		
			for (Task t : taskMap.values()) {
				if(t.getTaskName().equals(taskName)) {
					taskMap.remove(t);
				}
			}
		
	}

	public static void updateTaskStatus(String taskName, Status status, Map<Integer, Task> taskMap) {
		for (Task t : taskMap.values()) {
			if(t.getTaskName().equals(taskName)) {
				t.setStatus(status);
			}
		}
		
	}

	public static List<Task> displayAllPendingTasks(Map<Integer, Task> taskMap) {
		List<Task> taskList = new ArrayList<Task>();
		for (Task t : taskMap.values()) {
			if(t.getStatus().equals(Status.PENDING)) {
				taskList.add(t);
				
			}
		}
		return taskList;
	}

	public static List<Task> displayAllPendingTasksForToday(Map<Integer, Task> taskMap) {
		List<Task> taskList = new ArrayList<Task>();
		for (Task t : taskMap.values()) {
			if(t.getStatus().equals(Status.PENDING) && t.getTaskDate().equals(LocalDate.now())) {
				taskList.add(t);
				
			}
		return null;
	}
		return taskList;

}
}
