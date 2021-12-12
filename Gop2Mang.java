package mang;

import java.util.Scanner;

public class Gop2Mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = {1, 2, 4, 5, 6, 7, 8, 9};
        int b[] = {11, 12, 13, 14, 15, 16};
        int[] c = new int[100];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            c[count] = a[i];
            count++;
        }
        for (int i = 0; i < b.length; i++) {
           c[count] = b[i];
           count++;
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);

        }
    }
}
