import java.util.Scanner;
class BinarySearch {
    
    // Method to perform binary search in a sorted or rotated array
    static void calSearch(int[] x, int ele) {
        if (x.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        
        int beg = 0, end = x.length - 1;
        int f = -1; // Initialize to -1 to indicate "not found"

        // Determine if the array is ascending or descending
        boolean isAscending = x[beg] < x[end];

        while (beg <= end) {
            int mid = (beg + end) / 2;

            if (x[mid] == ele) {
                f = mid;
                break;
            }

            if (isAscending) { // Ascending order
                if (ele < x[mid]) {
                    end = mid - 1;
                } else {
                    beg = mid + 1;
                }
            } else { // Descending order
                if (ele > x[mid]) {
                    end = mid - 1;
                } else {
                    beg = mid + 1;
                }
            }
        }

        if (f != -1) {
            System.out.println("Element found at index: " + f);
        } else {
            System.out.println("Element not found");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Array size must be greater than zero.");
            scanner.close();
            return;
        }
        
        int[] x = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }

        System.out.println("Enter the element to be searched:");
        int num = scanner.nextInt();
        
        calSearch(x, num);
        scanner.close();
    }
}
