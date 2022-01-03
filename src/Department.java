import java.util.HashSet;
import java.util.Iterator;

public class Department {
    String name;

    public Department(String name) {
        this.name = name;
    }

    University university;
    HashSet<Teacher> teachers = new HashSet<Teacher>();
    HashSet<Student> students = new HashSet<Student>();
    HashSet<Course> courses = new HashSet<Course>();

    public void setCourse(Course course) {
        courses.add(course);
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

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public void setTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public String toString() {
        return "Departamento: "+name;
    }

    public Course searchCourseByCode(String code) {
        Course course = null;
        Iterator<Course> iterator = courses.iterator();
        while (iterator.hasNext()) {
            course = iterator.next();
            if (course.getCode().equals(code)) {
                return course;
            }
        }
        return course;
    }
}
