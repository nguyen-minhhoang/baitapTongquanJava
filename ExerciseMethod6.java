package ExercisePackage;

import java.util.Scanner;

public class ExerciseMethod6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập biển số xe của bạn:");
        int bienSo = scanner.nextInt();
        int sum = 0;
        while (bienSo > 0) {
            int num = bienSo % 10;
            bienSo = bienSo/10;
            sum = sum + num;
        }
        System.out.println("tổng số nút của biển số:" + sum);
    }
}
