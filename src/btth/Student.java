package btth;

public class Student {
    private int id;
    private String name;

    static final String SCHOOL_NAME = "CNTT3";
    static int studentCount = 0;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        studentCount++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public static void setStudentCount(int studentCount) {
        Student.studentCount = studentCount;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("School Name: " + SCHOOL_NAME);
        System.out.println("-----------------------");
    }

    public static void showTotalStudent() {
        System.out.println("Tổng số sinh viên : " + studentCount);
    }
}
