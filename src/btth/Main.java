package btth;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Tran Khanh An");
        Student student2 = new Student(2, "Pham Lan Nhi");

        student1.displayInfo();
        student2.displayInfo();

        Student.showTotalStudent();
    }
}
