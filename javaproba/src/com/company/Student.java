package com.company;

import java.time.LocalDate;

public class Student {

    private LocalDate birthDate;
    private String neptun;
    private String name;

    public Student(LocalDate birthDate, String neptun, String name)
    {
        this.birthDate = birthDate;
        this.neptun = neptun;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "birthDate=" + birthDate +
                ", neptun='" + neptun + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getNeptun() {
        return neptun;
    }

    public void setNeptun(String neptun) {
        this.neptun = neptun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
