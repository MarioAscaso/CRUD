package studentsManager;

import main.StudentsCrudApp;
import student.FullName;
import student.MarkQualification;
import student.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentsManager {
    private Student student;
    private List<Student> studentList = new ArrayList<>();
    private Iterator<Student> studentIterator = studentList.iterator();
    private Object[] data = new Object[10];

    public void registerNewStudent() {
        Object[] data = getData();
        student = new Student((String) data[0], (FullName) data[1],(FullName) data[2], (FullName) data[3], (String) data[4], (MarkQualification[]) data[5], (MarkQualification[]) data[6], (MarkQualification[]) data[7], (MarkQualification[]) data[8]);
        studentList.add(student);
    }

    private Object[] getData() {
        StudentsCrudApp.outputInterface.askID();
        data[0] = StudentsCrudApp.inputInterface.getStringValue();
        StudentsCrudApp.outputInterface.askName();
        data[1] = StudentsCrudApp.inputInterface.getStringValue();
        StudentsCrudApp.outputInterface.askFirstSurname();
        data[2] = StudentsCrudApp.inputInterface.getStringValue();
        StudentsCrudApp.outputInterface.askSecondSurname();
        data[3] = StudentsCrudApp.inputInterface.getStringValue();
        StudentsCrudApp.outputInterface.askBirthday();
        data[4] = StudentsCrudApp.inputInterface.getStringValue();
        StudentsCrudApp.outputInterface.askSubjectMark();
        data[5] = StudentsCrudApp.inputInterface.getFloatValue();
        StudentsCrudApp.outputInterface.askSubjectMark();
        data[6] = StudentsCrudApp.inputInterface.getFloatValue();
        StudentsCrudApp.outputInterface.askSubjectMark();
        data[7] = StudentsCrudApp.inputInterface.getFloatValue();
        StudentsCrudApp.outputInterface.askSubjectMark();
        data[8] = StudentsCrudApp.inputInterface.getFloatValue();
        return data;
    }

    public void listStudents() {
        StudentsCrudApp.outputInterface.registeredStudents();
        StudentsCrudApp.outputInterface.headerList();
        while (studentIterator.hasNext()) {
            Student student = studentIterator.next();
            StudentsCrudApp.outputInterface.listStudent(student);
        }
    }

    public void deleteStudent() {
    }

    public void modifyMark() {
    }

    public void searchStudent() {
    }



}
