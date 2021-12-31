import java.util.HashSet;

public class Student {
    String name;
    String code;

    public Student(String name, String code) {
        this.name = name;
        this.code = code;
    }

    HashSet<Course> courses = new HashSet<Course>();
    University university;
    Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setCourse(Course course) {
        courses.add(course);
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

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}
