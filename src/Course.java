import java.util.HashSet;

public class Course {
    String name;
    String code;

    public Course(String name, String code) {
        this.name = name;
        this.code = code;
    }

    Teacher teacher;
    Department department;
    HashSet<Student> students = new HashSet<Student>();

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setStudent(Student student) {
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
