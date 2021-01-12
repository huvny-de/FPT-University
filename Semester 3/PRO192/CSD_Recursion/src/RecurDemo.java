/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Henry
 */
public class RecurDemo {

    int chick = 0;
    int dog = 0;

    int a[] = {1, 5, 9, 7, 2, 14};

    int sum(int a[], int n) {
        if (n == 0) {
            return 0;
        }
        return sum(a, n - 1) + a[n - 1];
    }

    public static double factorial(int n) {
        if (n < 2) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    //other recursive method
    public static int fibo(int n) {
        if (n < 2) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    double CSC(int n, double a, double r) {
        if (n == 1) {
            return a;
        }
        return CSC(n - 1, a, r) + r;
    }

    /* public static String convert(int n, int base) {
        if (n == 0) {
            return "0";
        }
        return convert(n / base, base) + Character.forDigit(n % base, base);
    }*/
    public int ChikDog(int c, int d) {
        if (c * 2 + d * 4 == 100) {
            System.out.println("Chicken" + (c) + ", Dog" + (d));
            return 1;
        }
        return ChikDog(c - 1, d);
    }

    public static void main(String[] args) {
        System.out.println(factorial(98));
        for (int i = 0; i < 10; i++) {
            System.out.println("Fibonaci(" + i + "):" + "\t" + fibo(i + 1));
        }
        System.out.println("");
        //System.out.println(CSC(5, 15, 14));
        //System.out.println(sum(a, 6));
    }

    /* public static String convert(int n, int base) {
        if (n == 0) {
            return "0";
        }
        return convert(n / base, base) + Character.forDigit(n % base, base);
    }*/
}
