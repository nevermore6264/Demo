import java.util.Calendar;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập năm sinh của bạn");
        int myyear = sc.nextInt();
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int age = year - myyear;
        System.out.println("Tuổi của bạn là: " + age);
    }


}
