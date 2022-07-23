package solver;

import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    private void solve() {
        double a = in.nextDouble();
        double b = in.nextDouble();
        System.out.println(b / a);
    }
}
