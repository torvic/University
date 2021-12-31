import java.util.HashSet;
import java.util.Iterator;

public class University {
    String name;

    public University(String name) {
        this.name = name;
    }

    HashSet<Department> departments = new HashSet<Department>();
    HashSet<Student> students = new HashSet<Student>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartments(Department department) {
        departments.add(department);
    }

    public void setStudent(Student student) {
        students.add(student);
    }

    public void enrollStudent(Student student, Department department) {
        students.add(student);
        student.setUniversity(this);
        department.setStudent(student);
        student.setDepartment(department);
    }

    public Department searchDepartment(String name) {
        Department d = null;
        Iterator<Department> iterator = departments.iterator();
        while (iterator.hasNext()) {
            d = iterator.next();
            if (d.getName().equals(name)) {
                return d;
            }
        }
        d = null;
        return d;
    }

    public String showDepartments() {
        String data = "";
        Iterator<Department> iterator = departments.iterator();
        Department temp = null;
        while (iterator.hasNext()) {
            temp = iterator.next();
            System.out.println(temp);
            data = data + temp.getName()+"\n";
        }
        return data;
    }
}
