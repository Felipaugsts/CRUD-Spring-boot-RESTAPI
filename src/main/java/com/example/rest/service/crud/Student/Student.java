package com.example.rest.service.crud.Student;

import java.time.LocalDate;

public class Student {
    private long id;
    private  String Name;
    private String Email;
    private LocalDate dob;
    private Integer age;

    public Student() {
    }

    public Student(
            long id,
            String name,
            String email,
            LocalDate dob,
             Integer age) {
        this.id = id;
        Name = name;
        Email = email;
        this.dob = dob;
        this.age = age;
    }

    public Student(String name, String email, LocalDate dob, Integer age) {
        Name = name;
        Email = email;
        this.dob = dob;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
