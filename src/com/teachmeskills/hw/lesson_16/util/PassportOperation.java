package com.teachmeskills.hw.lesson_16.util;

import com.teachmeskills.hw.lesson_16.constant.Constants;
import com.teachmeskills.hw.lesson_16.model.Student;

import java.util.*;


public class PassportOperation {

    public static Map<Student, String> passportGenerationForStudent(Set<Student> students) {

        Set<String> passportSet = new HashSet<>();
        Map<Student, String> dataCollection = new HashMap<>();

        Random random = new Random();

        for (Student student : students) {
            String passportNumber;
            do {
                String series = Constants.passportSeries[random.nextInt(Constants.passportSeries.length)];
                int number = random.nextInt(1000000, 9999999);
                passportNumber = series + number;
            } while (passportSet.contains(passportNumber));

            passportSet.add(passportNumber);
            dataCollection.put(student, passportNumber);
        }

        return dataCollection;
    }
}
