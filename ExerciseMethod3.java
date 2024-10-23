package ExercisePackage;
import java.util.Scanner;

public class ExerciseMethod3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tên sản phẩm: ");
        String product = scanner.nextLine();
        System.out.println("Nhập số lượng sản phẩm: ");
        int quantity = scanner.nextInt();
        System.out.println("Nhập đơn giá sản phẩm: ");
        double price = scanner.nextDouble();

        double sumPrice = quantity*price;
        double VAT = sumPrice * 0.1;

        System.out.println("Tên sản phẩm : " + product);
        System.out.println("Tổng tiền sản phẩm : " + price);
        System.out.println("Tổng tiền có VAT : " + VAT);

    }

}
