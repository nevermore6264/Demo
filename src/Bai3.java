import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập bán kính hình tròn");
        double radius = sc.nextDouble();
        double S = Math.PI * Math.pow(radius, 2);
        double A = Math.PI * radius * 2;
        System.out.println("Diện tích : " + S);
        System.out.println("Chu vi là: " + A);
    }
}