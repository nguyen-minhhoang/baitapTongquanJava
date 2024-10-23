package ExercisePackage;
import  java.util.Scanner;

public class ExerciseMethod4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập điểm môn Toán : " );
        double toan = scanner.nextDouble();
        System.out.println("Nhập hệ số môn Toán : " );
        double hesoToan = scanner.nextDouble();
        System.out.println("Nhập điểm môn Hóa : " );
        double hoa = scanner.nextDouble();
        System.out.println("Nhập hệ số môn Hóa : " );
        double hesoHoa = scanner.nextDouble();
        System.out.println("Nhập điểm môn Lý : " );
        double ly = scanner.nextDouble();
        System.out.println("Nhập hệ số môn Lý : " );
        double hesoLy = scanner.nextDouble();

        double tb_mon = (toan*hesoToan + ly*hesoLy + hoa*hesoHoa)/(hesoLy + hesoHoa + hesoToan);
        System.out.println("Điểm trung bình các môn : " + tb_mon);

    }
}
