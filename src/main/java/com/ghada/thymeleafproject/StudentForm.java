package com.ghada.thymeleafproject;

public class StudentForm {
    private String name;
    private String lastname;
    private String group;

    public StudentForm(String name, String lastname, String group) {
        this.name = name;
        this.lastname = lastname;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
