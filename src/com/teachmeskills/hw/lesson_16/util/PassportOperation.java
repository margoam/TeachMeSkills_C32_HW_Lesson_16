package com.teachmeskills.hw.lesson_16.util;

import com.teachmeskills.hw.lesson_16.model.Student;

import java.util.*;

public class PassportOperation {

    public static Map<Student, String> passportGenerationForStudent(Set<Student> students) {

        Set<String> passportSet = new HashSet<>();
        Map<Student, String> dataCollection = new HashMap<>();

        String[] passportSeries = {"MK", "PP", "MC", "MY"};
        Random random = new Random();

        for (Student student : students) {
            String passportNumber;
            do {
                String series = passportSeries[random.nextInt(passportSeries.length)];
                int number = 1000000 + random.nextInt(9999999);
                passportNumber = series + number;
            } while (passportSet.contains(passportNumber));

            passportSet.add(passportNumber);
            dataCollection.put(student, passportNumber);
        }

        return dataCollection;
    }
}
