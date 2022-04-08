package ch06.case0;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        double compute = compute();
        System.out.println(compute);
    }

    public static double compute() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(s);

        double count = 0;
        double sum = 0;

        while (stringTokenizer.hasMoreTokens()) {
            String s1 = stringTokenizer.nextToken();
            try {
                double d = Double.parseDouble(s1);
                count++;
                sum += d;
            } catch (Exception e) {

            }
        }

        double result = sum / count;

        return Double.isNaN(result) ? 0 : result;
    }
}
