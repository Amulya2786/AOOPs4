package com.todolist;
import java.util.PriorityQueue;
import java.util.Iterator;
import java.util.function.Predicate;

public class TaskManager {
	private PriorityQueue<Task> tasks;

    public TaskManager() {
        this.tasks = new PriorityQueue<>((a, b) -> Integer.compare(a.getPriority(), b.getPriority()));
    }

    public void addTask(Task task) {
        tasks.offer(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public Iterator<Task> listTasks() {
        return tasks.iterator();
    }

    public void filterTasks(Predicate<Task> condition) {
        tasks.stream().filter(condition).forEach(System.out::println);
    }
}
