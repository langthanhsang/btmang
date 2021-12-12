package mang;

public class max {
    public static void main(String[] args) {
        int [] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = maxValue(arr);
        System.out.println(" the max element in the array is : " + arr[index] );
    }
    public static int maxValue(int[] array) {
       int index = 0;
        for ( int i = 1; i < array.length; i++) {
            if( array[i] > array[index]) {
                index = i;
            }
        }
        return  index;
    }
}
