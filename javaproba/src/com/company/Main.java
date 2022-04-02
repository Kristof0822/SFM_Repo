package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(LocalDate.of(1999, 12, 31), "asd123", "John Smith"));
        students.add(new Student(LocalDate.of(2002, 2,10), "hsd123", "Alan Smith"));
        students.add(new Student(LocalDate.of(2000,8,4), "kkd123", "Zoe Smith"));

        System.out.println(students);
        students.sort(new Comparator<Student>()
        {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
        System.out.println(students);
    }
/*
    private static class MyStudentComparator implements Comparator<Student>
    {
        @Override
        public int compare(Student s1, Student s2)
        {
            return s1.getName().compareTo(s2.getName());
        }
    }
*/
}
