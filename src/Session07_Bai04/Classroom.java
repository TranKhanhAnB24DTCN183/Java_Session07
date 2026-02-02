package Session07_Bai04;

public class Classroom {
    private String studentName;
    private static double classFund = 0;

    public Classroom(String studentName) {
        this.studentName = studentName;
    }

    public void contribute(double amount) {
        classFund += amount;
        System.out.println(studentName + " dong " + amount + " vao quy lop");
    }

    public static void showClassFund() {
        System.out.println("Tong quy lop: " + classFund);
    }
}
