package com.teachmeskills.hw.lesson_16.util;

import com.teachmeskills.hw.lesson_16.model.Student;

import java.util.Map;

public class StudentDataOperation {

    public static void extractStudentPassportNumber(Map<Student, String> group) {

        for (Map.Entry<Student, String> data : group.entrySet()) {
            System.out.println("Student " + data.getKey() + " has the passport: " + data.getValue());
        }
    }
}
