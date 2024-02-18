package com.sda.no_value;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ExpressingNullExample {

    public static void main(String[] args) {
        System.out.println("Expressing null");

        LessonDiary javaClass = new LessonDiary(
                null,
                Collections.emptyList(),
                4
        );

        // get name of the teacher and write it with capital letters
        String teacherName = javaClass.getTeacher();
        if (teacherName != null) {
            System.out.println(teacherName.toUpperCase());
        } else {
            System.out.println("No teacher!");
        }

        Optional<String> teacherName2 = javaClass.getTeacherSafeWay();
        teacherName2.ifPresent(s -> {
            System.out.println("Got a teacher");
            System.out.println("Name is: " + s);
        });

        teacherName2.ifPresentOrElse(s -> {
            System.out.println("Got a teacher");
            System.out.println("Name is: " + s);
        }, () -> System.out.println("Empty optional!!!"));

        if (teacherName2.isPresent()) {
            System.out.println("Teacher name from optional" + teacherName2.get());
        } else {
            System.out.println("No teacher inside optional!!!");
        }

    }
}

class LessonDiary {
    private String teacher;
    private List<String> students;
    // Integer can also hold null value :)
    // int is primitive
    private Integer numberOfStudents;

    public LessonDiary(String teacher, List<String> students, Integer numberOfStudents) {
        this.teacher = teacher;
        this.students = students;
        this.numberOfStudents = numberOfStudents;
    }

    public String getTeacher() {
        return teacher;
    }

    public Optional<String> getTeacherSafeWay() {
        // use ofNullable is You're not sure if teacher is null or not
        return Optional.ofNullable(teacher);
    }

    public List<String> getStudents() {
        return students;
    }

    public Integer getNumberOfStudents() {
        return numberOfStudents;
    }

    @Override
    public String toString() {
        return "LessonDiary{" +
                "teacher='" + teacher + '\'' +
                ", students=" + students +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }
}