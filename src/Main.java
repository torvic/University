import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        University university;
        university = new University("UNIV");

        university.setDepartments(new Department("Ing. Sistemas"));
        university.setDepartments(new Department("Ing. Electronica"));
        university.setDepartments(new Department("Ing. Civil"));

        boolean close = false;
        int option;
        String dataMenu;

        while (close != true) {
            dataMenu = "--SISTEMA UNIVERSITARIO "+university.getName()+"--\n"+
                    "1. Matricular Estudiantes\n"+
                    "2. Asignar profesor a departamento\n"+
                    "3. Crear curso en el sistema\n"+
                    "4. Asignar alumno a un curso\n"+
                    "5. Listar los datos de un curso\n"+
                    "6. Listar cursos de un estudiante\n"+
                    "7. Salir\n"+
                    "\nIngrese Opcion:\n";
            option = Integer.valueOf(JOptionPane.showInputDialog(dataMenu));
            switch (option) {
                case 1:
                    // student
                    String nameStudent;
                    String codeStudent;
                    nameStudent = JOptionPane.showInputDialog("Ingrese el nombre de estudiante a matricular:\n");
                    codeStudent = JOptionPane.showInputDialog("Ingrese el codigo de estudiante a matricular:\n");
                    Student newStudent;
                    newStudent = new Student(nameStudent, codeStudent);
                    // department
                    String nameDepartment;
                    nameDepartment = JOptionPane.showInputDialog(university.showDepartments()+ "\n\nIngrese el departamento a matricular:\n");
                    Department newDepartment;
                    newDepartment = university.searchDepartment(nameDepartment);
                    if (newDepartment == null) {
                        JOptionPane.showMessageDialog(null, "El departamento ingresado no existe.");
                        break;
                    }
                    // university
                    university.enrollStudent(newStudent, newDepartment);
                    JOptionPane.showMessageDialog(null, "El estudiante se matriculo con exito.");
                    break;
                case 2:
                    // department
                    nameDepartment = JOptionPane.showInputDialog(university.showDepartments()+ "\nIngrese el departamento del profesor a asignar:\n");
                    newDepartment = university.searchDepartment(nameDepartment);
                    if (newDepartment == null) {
                        JOptionPane.showMessageDialog(null, "El departamento ingresado no existe.");
                        break;
                    }
                    // teacher
                    String nameTeacher;
                    String codeTeacher;
                    nameTeacher = JOptionPane.showInputDialog("Ingrese el nombre del profesor a asignar:\n");
                    codeTeacher = JOptionPane.showInputDialog("Ingrese el codigo del profesor a asignar:\n");
                    Teacher teacher;
                    teacher = new Teacher(nameTeacher, codeTeacher);
                    teacher.setDepartment(newDepartment);
                    newDepartment.setTeacher(teacher);

                    JOptionPane.showMessageDialog(null, "El Profesor se ha asignado con exito al "+newDepartment.toString());
                    break;
                case 3:
                    // department
                    nameDepartment = JOptionPane.showInputDialog(university.showDepartments()+ "\nIngrese el departamento del curso a crear:\n");
                    newDepartment = university.searchDepartment(nameDepartment);
                    if (newDepartment == null) {
                        JOptionPane.showMessageDialog(null, "El departamento ingresado no existe.");
                        break;
                    }
                    String courseCode;
                    courseCode = JOptionPane.showInputDialog(university.showDepartments()+ "\nIngrese el departamento del curso a crear:\n");
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    close = true;
                    break;
            }
        }

    }
}
