package ExercisePackage;

import java.util.Scanner;

public class ExerciseMethod1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập năm sinh của bạn:");
        int yearOfBirth = scanner.nextInt();
        int age = 2024 - yearOfBirth;
        System.out.println("Tuổi của bạn là:" + age);
    }
}
