package ExercisePackage;

import java.util.Scanner;

public class ExerciseMethod2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số tự nhiên a:");
        int a = scanner.nextInt();
        System.out.println("Nhập vào số tự nhiên b:");
        int b = scanner.nextInt();

        System.out.println("Tổng của 2 số a và b là " + (a + b ));
        System.out.println("Hiệu của 2 số a và b là " + (a - b ));
        System.out.println("Tích của 2 số a và b là " + (a * b ));
        System.out.println("Thương của 2 số a và b là " + (a / b ));

    }

}
