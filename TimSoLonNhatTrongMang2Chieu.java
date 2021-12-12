package mang;

import java.util.Arrays;
import java.util.Scanner;

public class TimSoLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height : ");
        int height = scanner.nextInt();
        System.out.println("Enter width");
        int width = scanner.nextInt();
        double[][] arr = new double[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.println("phần tủ thứ [" + i + "] phần tử thứ :" + (j + 1) + "la");
                arr[i][j] = scanner.nextDouble();
            }
        }
//        System.out.println(Arrays.deepToString(arr));
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(arr[i][j] + " ");
                System.out.println();
            }
        }
        double max = maxArr(arr);
        System.out.println("phần tủ lớn nhất trong mảng là : " + max);
    }
    public static double maxArr(double arr[][]) {
        double max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

}
