import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students;


    public StudentManager() {
        this.students = new ArrayList<>();
    }

    // add new student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to retrieve a student by ID
    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    // Method to get a list of all
    public ArrayList<Student> getAllStudents() {
        return students;
    }

    //Method to remove a student by ID
    public boolean removeStudentById(int id) {
        Student student = getStudentById(id);
        if (student != null) {
            students.remove(student);
            return true;
        }
        return false;
    }
}



