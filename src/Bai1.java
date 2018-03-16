import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập điểm Vật Lý");
        double physical = sc.nextDouble();
        System.out.println("Mời bạn nhập điểm Hóa Học");
        double chemistry = sc.nextDouble();
        System.out.println("Mời bạn nhập điểm Sinh Học");
        double biological = sc.nextDouble();
        double avg = (physical + chemistry + biological) / 3;
        System.out.println("Điểm trung bình : " + avg);
    }
}
