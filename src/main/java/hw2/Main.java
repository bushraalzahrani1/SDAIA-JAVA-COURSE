package hw2;

public class Main {

public static void main(String[] args) {
    // Create Student objects
    Student student1 = new Student("bushra" ,  1);
    Student student2 = new Student("sara" ,  2);
    Student student3 = new Student("amaal" ,  3);
    Student student4 = new Student("ali" ,  4);
    // Create a StudentManager and add the students
    StudentManager studentManager = new StudentManager();
    studentManager.addStudent(student1);
    studentManager.addStudent(student2);
    studentManager.addStudent(student3);
    studentManager.addStudent(student4);
    //  Retrieve and display a student by  ID
    Student retrievedStudent = studentManager.getStudentById(1);
    System.out.println("Retrieved Student : " + retrievedStudent.getName());

    // Display all students in the list
    System.out.println("All students");
    for (Student student : studentManager.getAllStudents()) {
        System.out.println("name : " + student.getName() + " "+ "id : " + student.getId());
    }

     // Remove a student by  ID and display the list of students again
    boolean removed = studentManager.removeStudentById(1);
    if (removed) {
        System.out.println("**Student Removed Successfully**");
    } else {
        System.out.println("Student is not found");
    }

    System.out.println("All student after removal:");
    for (Student student : studentManager.getAllStudents()) {
        System.out.println("name :" + student.getName() + " "+ "id: " + student.getId());
    }
}
}
