public class Main {
    public static void main(String[] args){
        int[] arr = {3,4,6,8,12,23,54,200,300,456,1987,4567,10000};
        System.out.println(binarySearch(456,arr));
    }

    public static int binarySearch(int key, int[] arr){
        int lo = 0;
        int hi = arr.length - 1;
        while(lo<=hi){
            int mid = (lo + hi)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(key>arr[mid]){
                lo = mid + 1;
                continue;
            }
            if(key<arr[mid]){
                hi = mid - 1;
                continue;
            }
        }
        return -1;
    }
}
