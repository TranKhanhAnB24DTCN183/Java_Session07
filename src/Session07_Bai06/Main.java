package Session07_Bai06;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "userA", "passA");
        User user2 = new User(2, "userB", "passB");
        User user3 = new User(3, "userC", "passC");

        UserManager.addUser(user1);
        UserManager.addUser(user2);
        UserManager.addUser(user3);

        System.out.println("Da them 3 user vao he thong.");
        System.out.println("Danh sach hien tai:");

        int index = 1;
        for (User user : UserManager.users) {
            System.out.println(index + ". " + user);
            index++;
        }
        System.out.println("-------------------------");
        System.out.println("Thu dang nhap voi cac thong tin sau:");
        boolean login1 = UserManager.checkLogin("userA", "passA");
        System.out.println("Dang nhap userA/passA: " + (login1 ? "Thanh cong" : "That bai"));
        boolean login2 = UserManager.checkLogin("userB", "wrongPass");
        System.out.println("Dang nhap userB/wrongPass: " + (login2 ? "Thanh cong" : "That bai"));
        boolean login3 = UserManager.checkLogin("userC", "passC");
        System.out.println("Dang nhap userC/passC: " + (login3 ? "Thanh cong" : "That bai"));
    }

}
