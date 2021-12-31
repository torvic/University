import java.util.HashSet;

public class Department {
    String name;

    public Department(String name) {
        this.name = name;
    }

    University university;
    HashSet<Teacher> teachers = new HashSet<Teacher>();
    HashSet<Student> students = new HashSet<Student>();

    public void setStudent(Student student) {
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public void setTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
}
