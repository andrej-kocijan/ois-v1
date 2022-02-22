import java.util.*;

public class Gravitacija {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double C = 6.674 * Math.pow(10, -11);
        double M = 5.972 * Math.pow(10, 24);
        double r = 6.371 * Math.pow(10, 6);

        double v = sc.nextDouble();

        double a = izracun(C, M, r, v);

        System.out.println(v);
        System.out.println(a);

        System.out.println("OIS je zakon!");
    }

    public static double izracun(double C, double M, double r, double v) {
        return C * M / Math.pow((r + v), 2);
    }

}