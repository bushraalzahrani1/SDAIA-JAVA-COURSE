package org.example;

public class Students extends Person implements ComparableById {
    int studentID;
    String course;

    public Students(String name, int age, String address, int studentID, String course) {
        super(name, age, address);
        setStudentID(studentID);
        this.course = course;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getCourse() {
        return course;
    }

    public void setStudentID(int studentID) {
        if (studentID > 0){
            this.studentID = studentID;
        }else{
            throw new IllegalArgumentException("Student ID must be bigger than 0 and positive number.");
        }
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student Name: " + name + ", Age: " + age + ", Address: " + address +
                ", Student ID: " + studentID + ", Course: " + course;
    }

    @Override
    public String getDetails() {
        return toString();
    }

    @Override
    public boolean compareById(int id) {
        return studentID == id;
    }

    public static void main(String[] args) {
        // Test Students class
        Students s1 = new Students("Ahmed", 20, "887 ALsalaam St", 11, "Computer Science");
        Students s2 = new Students("Basem", 22, "442 ALnada St", 22, "Computer Science");

        System.out.println("Details of Student 1:");
        System.out.println(s1);

        System.out.println("\nDetails of Student 2:");
        System.out.println(s2);

        System.out.println("\nIs student s1 matching ID 11? " + s1.compareById(101));
        System.out.println("Is student s2 matching ID 12? " + s2.compareById(3));
    }
}
