import java.util.*;

class InsertionSort {
    void insertSort(int[] arr) {
        int len = arr.length;
        for (int i = 1; i < len; ++i) {
            int j = i - 1;
            int num = arr[i];
            while (j >= 0 && arr[j] > num) {
                arr[j + 1] = arr[j];
                j -= 1;
            }
            arr[j + 1] = num;
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Unsorted array of numbers:");
        String array = userInput.nextLine();
        userInput.close();
        String[] str = array.replaceAll("\\[|\\]", "").split(",");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i].trim());
        }
        InsertionSort res = new InsertionSort();
        res.insertSort(arr);
        System.out.println("Sorted array of numbers:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}