package ExercisePackage;

public class ExerciseMethod7 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int a = i++ + j++;
        int b = i++ + ++j;
        int c = ++i + j++;
        int d = ++i + ++j;
        int e = i++ + j++ + i++ + j ++;
        int f = ++i + ++j + i++ +j++;
        int g = i++ + ++i - i-- - --i;
        int h = 10;
        h += h++ + ++h;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + c);
        System.out.println("d:" + d);
        System.out.println("e:" + e);
        System.out.println("f:" + f);
        System.out.println("g:" + g);
        System.out.println("h:" + h);

    }
}
