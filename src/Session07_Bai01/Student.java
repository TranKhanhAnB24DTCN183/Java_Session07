package Session07_Bai01;

public class Student {
    private String studentId;
    private String studentName;
    private static int totalStudent = 0;

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        totalStudent++;
    }

    public void showInfo() {
        System.out.println("Ma SV: " + studentId);
        System.out.println("Ten SV: " + studentName);
        System.out.println("---------------------");
    }

    public static void showTotalStudent() {
        System.out.println("Tong so sinh vien: " + totalStudent);
    }
}
