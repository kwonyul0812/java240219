package ch15.exercise.p8;

import java.util.Objects;

public class Student {
    public int studentNum;
    public String name;

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student target) {
            if (target.studentNum == studentNum)
                return true;
            else return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }
}
