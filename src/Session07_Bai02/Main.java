package Session07_Bai02;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        b = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        Student s1 = new Student("An");
        Student s2 = s1;

        s2.name = "Binh";

        System.out.println("Ten s1: " + s1.name);
        System.out.println("Ten s2: " + s2.name);
    }
}
