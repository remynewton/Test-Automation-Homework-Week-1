import java.util.*;

class InsertionSort {
    void insertSort(int arr[]) {
        int len = arr.length;
        for (int i = 1; i < len; ++i) {
            int j = i-1;
            int num = arr[i];
            while (j >= 0 && arr[j] > num) {
                arr[j+1] = arr[j];
                j -= 1;
            }
            arr[j + 1] = num;
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
        InsertionSort res = new InsertionSort();
        res.insertSort(arr);
        System.out.println("Sorted array of numbers: " + Arrays.toString(arr));
    }
}