/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selection;

public class SelectionSort {

    public static void main(String[] args) {
        long[] arr = new long[20];
        System.out.println("Масив до сортування: ");
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (long) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        System.out.println("]");
        System.out.println("Масив після сортування: ");
        sort(arr);
    }

    public static void sort(long[] input) {
        int inputLength = input.length;
        for (int i = 0; i < inputLength - 1; i++) {
            int min = i;
            for (int j = i + 1; j < inputLength; j++) {
                if (input[j] < input[min]) {
                    min = j;
                }
            }
            long temp = input[i];
            input[i] = input[min];
            input[min] = temp;
        }
        System.out.print("[ ");
        for( int i =0; i< input.length; i++) {
            System.out.print(input[i] + "  ");
        }
        System.out.println("]");
    }
}
