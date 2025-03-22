import java.util.*;


class EuclideanAlgorithm {
    public static int GCD(int a, int b) {
        int result = 0;
        while (a > 0 && b > 0) {
            for (int i = 1; i <= a && i <= b; i++) {
                if (a % i == 0 && b % i ==0) {
                    result = i;
                }
            }
            return result;
        }
        return -1;
    }
    public static void main(String args[]) {
        int a = 252;
        int b = 105;
        int number = GCD(a,b);
        System.out.println(number);
    }
}