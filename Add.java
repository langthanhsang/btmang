//package mang;
//
//import java.util.Scanner;
//
//public class .Add {
//    public static void main(String[] args) {
//        int numbers[] = {10,4,6,7,8,0,0,0};
//        Scanner scanner =  new Scanner(System.in);
//        System.out.println("nhập vị trí cần thêm");
//        int addAtIndex = scanner.nextInt();
//        System.out.println("nhập giá trị càn thêm");
//        int value = scanner.nextInt();
//
//        for (int element : numbers) {
//            System.out.print(element + " ");
//        }
//        for(int i = numbers.length-1; i > addAtIndex; i--) {
//            numbers[i] = numbers[i-1];
//        }
//        numbers[addAtIndex] = value;
//        System.out.println("");
//        System.out.println("sau khi chen");
//        for (int element : numbers) {
//            System.out.print(element + " ");
//        }
//        System.out.println();
//    }
//}
