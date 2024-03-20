package ch15.exercise.p10;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    public String id;
    public int score;

    public Student(String id, int score) {
        this.id = id;
        this.score = score;
    }


    @Override
    public int compareTo(Student o) {
        return this.score - o.score;
    }
}
