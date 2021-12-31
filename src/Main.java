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
                    System.out.println(university.showDepartments());
                    String name;
                    String code;
                    // student
                    name = JOptionPane.showInputDialog("Ingrese nombre de estudiante a matricular:\n");
                    code = JOptionPane.showInputDialog("Ingrese codigo de estudiante a matricular:\n");
                    Student e;
                    e = new Student(name, code);
                    // department
                    name = JOptionPane.showInputDialog(university.showDepartments()+ "\n\nIngrese departamento a matricular:\n");
                    Department d;
                    d = university.searchDepartment(name);
                    if (d == null) {
                        JOptionPane.showMessageDialog(null, "El departamento ingresado no existe.");
                        break;
                    }
                    // university
                    university.enrollStudent(e, d);
                    JOptionPane.showMessageDialog(null, "El estudiante se matriculo con exito.");
                    break;
                case 2:
                    break;
                case 3:
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
