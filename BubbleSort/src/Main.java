import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        int[] arr = {4,2,1,5,9,6,7,8};

        bubbleSort(arr, arr.length);

        Arrays.stream(arr).forEach(e -> System.out.println(e));
    }

    public static void bubbleSort(int[] arr, int n){

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }

    public static void swap(int[] arr, int index1, int index2){

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
