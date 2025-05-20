package recursion;

public class bin_search {
    public static int bin_search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1; // Not found
        }
        int mid = (start + end) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return bin_search(arr, target, mid + 1, end);
        } else {
            return bin_search(arr, target, start, mid - 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 7, 8, 9};
        int target = 7;
        int start = 0;
        int end = arr.length - 1;
        int result = bin_search(arr, target, start, end);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
