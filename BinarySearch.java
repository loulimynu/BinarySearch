package project.binarysearch;

public class BinarySearch {

    public static void main(String[] args) {
        
        int x, left, right;
        int[]arr = new int[20];
    }
    public static boolean binarySearchRecursive(int[] arr, int x, int left, int right) {
        if (left > right) {
            return false;
        }
        int mid = left + ((right - left) / 2);
        if (arr[mid] == x) {
            return true;
        } else if (x < arr[mid]) {
            return binarySearchRecursive(arr, x, left, mid - 1);
        } else {
            return binarySearchRecursive(arr, x, right, mid + 1);
        }
    }
    public static boolean binarySearchInterative(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (arr[mid] == x) {
                return true;
            } else if (x < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
