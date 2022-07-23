package solver;

import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        main.linearEquation();
    }

    private void linearEquation() {
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();
        double e = in.nextDouble();
        double f = in.nextDouble();

        double y = (f - c * (d / a)) / (e - b * (d / a));
        double x = (c - b * y) / a;
        System.out.printf("%.5f %.5f", x, y);
    }
}
