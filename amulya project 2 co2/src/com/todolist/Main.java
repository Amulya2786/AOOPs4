package com.todolist;

public class Main {
	public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        // Add some tasks
        manager.addTask(new Task("Finish homework", 2));
        manager.addTask(new Task("Clean room", 1));
        manager.addTask(new Task("Read a book", 3));

        // Mark the first task as completed
        Task firstTask = manager.listTasks().next(); // Get the first task
        firstTask.complete();

        // List all tasks
        System.out.println("All Tasks:");
        manager.listTasks().forEachRemaining(System.out::println);

        // Filter completed tasks
        System.out.println("\nCompleted Tasks:");
        manager.filterTasks(Task::isCompleted);

        // Filter high-priority tasks (priority 1)
        System.out.println("\nHigh-Priority Tasks:");
        manager.filterTasks(task -> task.getPriority() == 1);
    }
}
