package core.output;

import student.Student;

public interface OutputInterface {
    void showMenu();
    void askID();
    void askName();
    void askFirstSurname();
    void askSecondSurname();
    void askBirthday();
    void askSubjectName();
    void askSubjectMark();
    void messageStudentCreated();
    void messageStudentAddedToList();
    void registeredStudents();
    void headerList();
    void listStudent(Student student);
    void askStudentToDelete();
    void studentDeleted();
    void askStudentToModificateMark();
    void showStudentMarks(Student student);
    void askSubjectToModificateMark();
    void messageConfirmMarkModificated();
    void askStudentToSearch();
    void showMenuStudent();
    void sessionExit();
}
