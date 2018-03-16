import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập điểm độ C");
        double C = sc.nextDouble();
        double F = C * 1.8 + 32;
        System.out.println("Độ F là : " + F);
    }
}
