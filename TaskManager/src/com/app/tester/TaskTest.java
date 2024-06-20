package com.app.tester;

import static java.time.LocalDate.parse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.app.custom_ordering.TaskDateComparator;
import com.app.entity.Status;
import com.app.entity.Task;
import com.app.utils.TaskUtils;

public class TaskTest {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			Map<Integer, Task> taskMap = new HashMap<>();
			
			while (true) {
				
				System.out.println("1. Add New Task \n"       
						+ "2. Delete a task \n"
						+ "3. Update task status \n"
						+ "4. Display all pending tasks \n"
						+ "5. Display all pending tasks for today \n"
						+ "6. Display all tasks sorted by taskDate \n"
						+ "7. Exit");
				System.out.println("Choose a option : ");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter Task Details :- Task name, Description, Task date ");
						Task task = new Task(sc.next(), sc.next(), parse(sc.next()));
						taskMap.put(task.getTaskId(), task);
						break;
						
					case 2:
						System.out.println("Enter a task name to delete : ");
						TaskUtils.deleteTask(sc.next(), taskMap);
						break;
						
					case 3:
						System.out.println("Enter task name and updated task status ");
						TaskUtils.updateTaskStatus(sc.next(), Status.valueOf(sc.next().toUpperCase()), taskMap);
						break;
						
					case 4:
						System.out.println("All Pending tasks");
						List<Task> t = TaskUtils.displayAllPendingTasks(taskMap);
						t.forEach(i -> System.out.println(i));
						break;
						
					case 5:
						System.out.println("All Pending tasks for today");
						List<Task> l = TaskUtils.displayAllPendingTasksForToday(taskMap);
						l.forEach(i -> System.out.println(i));
						break;
						
					case 6:
						List<Task> list = new ArrayList<Task>(taskMap.values());
						Collections.sort(list, new TaskDateComparator());
						list.forEach(i -> System.out.println(i));
						break;

					case 7:
						System.out.println("Thank You !!!");
						return;
						
					default:
						System.out.println("Invalid choice !!");
						break;
					}
				}catch (Exception e) {
					sc.nextLine();
				}
			}
		}

	}

}
