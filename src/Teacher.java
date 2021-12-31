import java.util.HashSet;

public class Teacher {
    String name;
    String code;

    public Teacher(String name, String code) {
        this.name = name;
        this.code = code;
    }

    Department department;
    HashSet<Course> courses = new HashSet<Course>();

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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
