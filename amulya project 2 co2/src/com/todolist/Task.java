package com.todolist;

public class Task {
	private String description;
    private int priority; // Lower values indicate higher priority
    private boolean completed;

    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
        this.completed = false;
    }

    public void complete() {
        this.completed = true;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isCompleted() {
        return completed;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s (Priority: %d)", completed ? "✔️" : "❌", description, priority);
    }
}
