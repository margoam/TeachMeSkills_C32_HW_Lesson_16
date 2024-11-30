package com.teachmeskills.hw.lesson_16;

import com.teachmeskills.hw.lesson_16.model.Passport;
import com.teachmeskills.hw.lesson_16.model.Student;
import com.teachmeskills.hw.lesson_16.util.StudentDataOperation;

import java.util.*;

/**
 * Создать коллекцию номеров паспортов (формат String).
 * Создать коллекцию студентов нашей группы.
 * В каждой коллекции не должно быть повторяющихся элементов.
 * Создать коллекцию ключ-значение, где ключом будет номер паспорта из первой коллекции, а значением будет объект класса Student из второй коллекции.
 * Пройти циклом for-each по коллекции ключ-значение и вывести элементы коллекции на экран.
 */
public class AppRunner {

    public static void main(String[] args) {

        Set<Student> groupMembers = new HashSet<>();
        groupMembers.add(new Student("Oleg"));
        groupMembers.add(new Student("Dmitry"));
        groupMembers.add(new Student("Dmitry"));
        groupMembers.add(new Student("Sergey"));
        groupMembers.add(new Student("Ilya"));
        groupMembers.add(new Student("Kirill"));
        groupMembers.add(new Student("Kirill"));
        groupMembers.add(new Student("Igor"));
        groupMembers.add(new Student("Marina"));
        groupMembers.add(new Student("Daniil"));
        groupMembers.add(new Student("Sultan"));
        groupMembers.add(new Student("Rita"));
        groupMembers.add(new Student("Vlad"));
        groupMembers.add(new Student("Kate"));

        Map<Student, String> studentPassportData = Passport.passportGenerationForStudent(groupMembers);
        StudentDataOperation.extractStudentPassportNumber(studentPassportData);
    }
}
