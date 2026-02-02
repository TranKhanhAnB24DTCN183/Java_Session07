package Session07_Bai04;

public class Main {
    public static void main(String[] args) {
        Classroom student1 = new Classroom("An");
        Classroom student2 = new Classroom("Nhi");

        student1.contribute(500);
        student2.contribute(1000);
        student2.contribute(-1000);

        Classroom.showClassFund();
    }
}
