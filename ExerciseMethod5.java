package ExercisePackage;
import java.util.Scanner;

public class ExerciseMethod5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính đường tròn:");
        double r = scanner.nextDouble();
        double chu_vi = 2*r*Math.PI;
        double dien_tich = r*r*Math.PI;

        System.out.println("Chu vi đường tròn:" + chu_vi);
        System.out.println("Diện tích đường tròn:" + dien_tich);

    }
}
