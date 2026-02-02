package Session07_Bai03;

public class Main {
    public static void main(String[] args) {
        double[] scores = {7.5, 8.0, 6.0, 4.5, 9.0};

        double average = ScoreUtils.calculateAverage(scores);
        System.out.println("Diem trung binh: " + average);

        for (double score : scores) {
            if (ScoreUtils.checkPass(score)) {
                System.out.println("- Diem " + score + ": Dat");
            } else {
                System.out.println("- Diem " + score + ": Truot");
            }
        }
    }
}
