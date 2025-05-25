package com.example.mytodolistapp;

public class TodoItem {
    private String task;
    private boolean isCompleted;

    public TodoItem(String task){
        this.task = task;
        this.isCompleted = false;
    }

    public String getTask(){
        return task;
    }

    public void setTask(String task){
        this.task = task;
    }

    public boolean isCompleted(){
        return isCompleted;
    }

    public void setCompleted(boolean completed){
        this.isCompleted = completed;
    }
}
