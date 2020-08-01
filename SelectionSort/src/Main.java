import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        int[] arr = {2,3,6,7,1,5,9};

        selectionSort(arr, arr.length);
        Arrays.stream(arr).forEach(e -> System.out.println(e));
    }

    public static void selectionSort(int[] arr, int n){

        for(int i = 0; i<n; i++){
            int minIndex = i;

            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
