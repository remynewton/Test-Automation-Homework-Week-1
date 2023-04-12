import java.util.*;

class QuickSort {
    static int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int i = l - 1;
        int temp;
        for (int j = l; j <= r - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;
        return i + 1;
    }
    
    static void quickSort(int arr[], int l, int r) {
        if (l < r) {
            int idx = partition(arr, l, r);
            quickSort(arr, l, idx-1);
            quickSort(arr, idx+1, r);
        }
    }
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = userInput.nextInt();
        userInput.close();
        int[] arr = new int[length];
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = rand.nextInt(100);
        }
        System.out.println("Unsorted array of numbers: " + Arrays.toString(arr));
        long start = System.currentTimeMillis();
        quickSort(arr, 0, arr.length-1);
        long end = System.currentTimeMillis();
        System.out.println("Sorted array of numbers: " + Arrays.toString(arr));
        System.out.println("It took exactly: " + (end-start) + "ms");
    }
}