public class Main {

    public static void main(String[] args){

        int[] arr = {2,1,4,5,6,9,8,7};
        insertionSort(arr);

        // Print sorted array
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    // Method that inserts comparable element into the array
    public static void insertionSort(int[] arr){
        int n = arr.length;
        // We iterate from the second element of the array to n-1
        for(int i = 1; i<n; i++){
            // Set the element which we want to compare
            int cur = arr[i];
            // Set j at the position before arr[i]
            int j = i - 1;

            while((j>=0)&&(arr[j]>cur)){
                arr[j+1] = arr[j]; // Insert element before a[i] to a[i] position
                j--; // Decrement j
            }
            arr[j+1] = cur; // Insert cur element at the beginning
        }
    }
}
