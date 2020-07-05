public class BinarySearchRecursive {

    public static void main(String[] args) {
        int[] arr = {3,4,8,10,12,45,23};
        System.out.println(rank(45, arr));
    }

    public static int rank(int key, int[] arr){
        return rank(key, arr, 0, arr.length-1);
    }

    public static int rank(int key, int[] arr, int lo, int hi){
        if(lo>hi){
            return -1;
        }
        int mid = (lo + hi)/2;
        if(key>arr[mid]){
            return rank(key, arr, mid+1, hi);
        } else if(key<arr[mid]){
            return rank(key, arr, lo, mid-1);
        } else{
            return mid;
        }
    }
}
