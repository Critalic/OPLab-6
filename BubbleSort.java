
package bubble;

public class BubbleSort {
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
    
    public static void sort (long[] array) {
        
        for(int i =1; i<array.length; i++) {
            for( int b = (array.length -1); b>= i; b-- ) {   
                if(array[b-1] >array[b]) {
                    long t  = array[b-1];
                    array[b-1] = array[b];
                    array[b] = t;
                }
                          
            } 
        }

        System.out.print("[ ");
        for( int i =0; i< array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println("]");
        
    }    
}
