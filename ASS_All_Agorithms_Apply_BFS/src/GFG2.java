import java.util.*;

class GFG {
    static void sort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            // Swap the found min elem with the first elem
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    static void printArray(int[] arr) { // Prints the array
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) { // Driver code
        int[] arr = {64, 25, 12, 22, 11};
        sort(arr);
        System.out.println("Sorted array");
        printArray(arr);
    }
}

