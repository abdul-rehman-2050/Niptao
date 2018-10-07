package com.fypsolutions.niptao.models;

import java.util.Date;

public class TaskToDo{

    private String thingsTodo;
    private String taskDescription;
    private Date expectedDueDate;


    public TaskToDo(String mTodo){
        thingsTodo = mTodo;
        taskDescription = null;
        expectedDueDate = null;
    }


    /*
    * Overloaded Constructor
    * @param mTodo -> string containing title to be added as to do, should not null
    * @param mDesc -> Description of the task, could be null
    * */
    public TaskToDo(String mTodo, String mDesc, Date mexpectedDueDate){
        if(mTodo!=null) {
            thingsTodo = mTodo;
        }else{
            thingsTodo = "";
        }
        if(mDesc!=null){
            taskDescription = mDesc;
        }else{
            taskDescription = "";
        }

        expectedDueDate = mexpectedDueDate;
    }


    public String getThingsTodo() {
        if(thingsTodo == null) return "";
        return thingsTodo;
    }

    public void setThingsTodo(String thingsTodo) {
        if(thingsTodo==null) {
            this.thingsTodo = "";
        }
        else {
            this.thingsTodo = thingsTodo;
        }
    }

    public String getTaskDescription() {
        if(taskDescription==null)return "";
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        if(taskDescription==null){
            this.taskDescription="";
        }
        else{
            this.taskDescription = taskDescription;
        }

    }

    public Date getExpectedDueDate() {
        return expectedDueDate;
    }

    public void setExpectedDueDate(Date expectedDueDate) {
        this.expectedDueDate = expectedDueDate;
    }
}
