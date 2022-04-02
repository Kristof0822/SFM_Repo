package hu.unideb.inf.sfmh14;

import java.util.Comparator;

public class MyStudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}
