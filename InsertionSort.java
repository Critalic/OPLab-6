
package insertion;

public class InsertionSort {
       public static void main(String[] args) {
        long[] arr = new long[20];
        System.out.println("Масив до сортування: ");
        System.out.print("[ ");
        for( int i =0; i< arr.length; i++) {
            arr[i] = (long) (Math.random() *100);
            System.out.print(arr[i] + "  ");
        }
        System.out.println("]");
        System.out.println("Масив після сортування: ");
        sort(arr);
    }
       public static void sort(long[] arr) {
        
        for (int i = 1; i < arr.length; ++i) { 
            long key = arr[i]; 
            int j = i - 1; 

            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        }

        System.out.print("[ ");
        for( int i =0; i< arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("]");
    } 
       
}
