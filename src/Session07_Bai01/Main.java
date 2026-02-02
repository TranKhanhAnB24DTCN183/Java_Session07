package Session07_Bai01;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("SV001", "Nguyen Van A");
        Student s2 = new Student("SV002", "Tran Thi B");
        Student s3 = new Student("SV003", "Le Van C");

        s1.showInfo();
        s2.showInfo();
        s3.showInfo();

        Student.showTotalStudent();
    }
}
