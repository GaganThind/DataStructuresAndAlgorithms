package in.gagan.algorithm.search;

public class Binary {

    public int binarySearch(int[] arr, int l, int r, int x) {
        if (r < l) {
            return -1;
        }

        int mid = l + (r - l)/2;

        if (arr[mid] == x) {
            return mid;
        } else if (x > arr[mid]) {
            return binarySearch(arr, mid + 1, r, x);
        } else {
            return binarySearch(arr, l, mid - 1, x);
        }
    }
}
