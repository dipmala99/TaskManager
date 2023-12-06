package com.taskforge;

public class Task {

	 String title;
     String description;
     boolean completed;
     String category;
     String priority;
     String dueDate;
     public Task() {
	
	}
	public Task(String title, String description, String category, String priority, String dueDate) {
		super();
		this.title = title;
		this.description = description;
		this.category = category;
		this.priority = priority;
		this.dueDate = dueDate;
	}
     
	public void setCompleted(boolean completed) {
	    this.completed = completed;
	}

	
	public String toString() {
        return "Title: " + title +
                "\nDescription: " + description +
                "\nCategory: " + category +
                "\nPriority: " + priority +
                "\nDue Date: " + dueDate +
                "\nCompleted: " + completed +
                "\n-------------------------";
    
}
}
