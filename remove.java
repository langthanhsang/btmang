package mang;

import java.util.Scanner;

public class remove {
    public static void main(String[] args) {
        int numbers[] = {10, 4, 6, 7, 8, 6,0,0,0};
        Scanner scanner = new Scanner(System.in);
        int delete = scanner.nextInt();
        int deleteIndex = findInDex(numbers, delete);
        if (deleteIndex == -1) {
            System.out.println("phần tử không có trong mảng!");
        } else {
            numbers = deleteIndex(numbers, deleteIndex);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
    }

    static int findInDex(int[] numbers, int index) {
        int viTri = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == index) {
                viTri = i;
            }
        }
        return viTri;
    }

    static int[] deleteIndex(int[] numbers, int viTri) {
        int[] newnumbers = new int[numbers.length];
        for (int i = 0; i < viTri; i++) {
            newnumbers[i] = numbers[i];
        }
        for (int i = viTri + 1; i < numbers.length; i++) {
            newnumbers[i - 1] = numbers[i];
        }
        return newnumbers;
    }
}
