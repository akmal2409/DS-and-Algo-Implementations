public class Main {
    public static void main(String[] args){
        int[] arr = {3,4,6,8,12,23,54,200,300,456,1987,4567,10000};
        System.out.println(binarySearch(456,arr));
    }

    public static int binarySearch(int key, int[] arr){
        int lo = 0;
        int hi = arr.length - 1; // we count from 0 to N-1
        while(lo<=hi){
            int mid = (lo + hi)/2; // In order to avoid overflow we can use (lo + (hi - lo))/2
            if(arr[mid] == key){
                return mid;
            }
            if(key>arr[mid]){
                lo = mid + 1; // moves starting point on 1 from previous middle
                continue;
            }
            if(key<arr[mid]){
                hi = mid - 1; // moves ending point on -1 from previous middle point
                continue;
            }
        }
        return -1;
    }
}
