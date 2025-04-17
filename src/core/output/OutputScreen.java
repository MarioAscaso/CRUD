package core.output;

import student.Student;

public class OutputScreen implements OutputInterface {
    @Override
    public void showMenu() {
        System.out.print("""
                1.AÑADIR ALUMNO
                2.LISTAR ALUMNOS
                3.ELIMINAR ALUMNO
                4.MODIFICAR NOTA
                5.BUSCAR ALUMNO
                6.SALIR
                ¿QUE OPCIÓN QUIERES HACER? -->\s""");
    }

    @Override
    public void askID() {System.out.print("INTRODUCE ID: ");}
    @Override
    public void askName() {System.out.print("INTRODUCE NOMBRE: ");}
    @Override
    public void askFirstSurname() {System.out.print("INTRODUCE PRIMER APELLIDO: ");}
    @Override
    public void askSecondSurname() {System.out.print("INTRODUCE SEGUNDO APELLIDO: ");}
    @Override
    public void askBirthday() {System.out.print("INTRODUCE FECHA DE NACIMIENTO: ");}
    @Override
    public void askSubjectName() {System.out.print("INTRODUCE NOMBRE ASIGNATURA: ");}
    @Override
    public void askSubjectMark() {System.out.print("INTRODUCE NOTA ASIGNATURA: ");}
    @Override
    public void messageStudentCreated() {System.out.println("ALUMNO CREADO CON ÉXITO");}
    @Override
    public void messageStudentAddedToList() {System.out.println("ALUMNO AÑADIDO A LA LISTA");}
    @Override
    public void registeredStudents() {System.out.println("LISTA DE ALUMNOS REGISTRADOS");}
    @Override
    public void headerList() {
        String separator = "------------------------------------------------------------------------------";
        String format = "|%-9s|%-26s|%-10s|%-18s|%-18s|%-18s|%-18s|";
        System.out.println(separator);
        System.out.printf(format, "DNI", "NOMBRE ALUMNO", "FECHA NAC.", "PROGRAMACIÓN", "LENGUAJE DE MARCAS", "ENTORNOS DE DESARROLLO", "BASE DE DATOS");
        System.out.println(separator);
    }
    @Override
    public void listStudent(Student student) {
        String separator = "------------------------------------------------------------------------------";
        String format = "|%-9s|%-26s|%-10s|%-18s|%-18s|%-18s|%-18s|";
        System.out.printf(format, student.getID(), student.getFullName(), student.getBirthday(), student.getMarkQualification());
        System.out.println(separator);
    }
    @Override
    public void askStudentToDelete() {System.out.print("INTRODUCE PRIMER APELLIDO DEL ALUMNO A ELIMINAR: ");}
    @Override
    public void studentDeleted() {System.out.println("ALUMNO ELIMINADO CON ÉXITO");}
    @Override
    public void askStudentToModificateMark() {System.out.print("INTRODUCE PRIMER APELLIDO DEL ALUMNO: ");}
    @Override
    public void showStudentMarks(Student student) {
        String separator = "------------------------------------------------------------------------------";
        String format = "|%-18s|%-6s|%-18s|%-6s|%-18s|%-6s|%-18s|%-6s|";
        System.out.println(separator);
        System.out.printf(format, (Object[]) student.getMarkQualification());
        System.out.println(separator);
    }
    @Override
    public void askSubjectToModificateMark() {System.out.print("(1, 2, 3, 4) ¿CUÁL QUIERES MODIFICAR? :");}
    @Override
    public void messageConfirmMarkModificated() {System.out.println("NOTA MODIFICADA CON ÉXITO");}
    @Override
    public void askStudentToSearch() {System.out.print("INTRODUCE PRIMER APELLIDO DEL ALUMNO A BUSCAR: ");}
    @Override
    public void showMenuStudent() {System.out.print("""
                1.ELIMINAR ALUMNO
                2.MODIFICAR NOTA
                3.NADA
                ¿QUE OPCIÓN QUIERES HACER? -->\s""");}
    @Override
    public void sessionExit() {System.out.println("CIERRE DE SESIÓN");}
}
