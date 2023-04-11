package ss10_dsa_list.exercise.listmanager.service;

import ss10_dsa_list.exercise.listmanager.model.Student;

import java.io.IOException;

public interface IStudentService {
    void addStudent() throws IOException;

    void removeStudent();

    void displayAllStudent();

    void searchStudent();

    void sortStudent();

    Student displayStudent();
}
