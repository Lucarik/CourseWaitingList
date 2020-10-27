package com.example.coursewaitinglist.database.models;

public class Student {
    public static final String TABLE_NAME = "student";

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_GRADE = "grade";
    public static final String COLUMN_PRIORITY = "priority";

    private int id;
    private String name;
    private String grade;
    private int priority;


    // Create table SQL query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_NAME + " TEXT,"
                    + COLUMN_GRADE + " TEXT,"
                    + COLUMN_PRIORITY + " INTEGER"
                    + ")";

    public Student() {
    }

    public Student(int id, String name, String grade, int priority) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public int getPriority() {
        return priority;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setId(int id) {
        this.id = id;
    }

}
