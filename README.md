# Test-Automation-Homework-Week-1

I was given the following two prompts:

1. (Practical) Create a simple system.out app. Print info about the user that should be passed to the main function as a parameter. Compile and run the program from the command line using javac and java from JDK.
2. (Practical) Sorting algorithm implementation. Choose any from the list: Insertion sort, Selection sort, bubble sort, Merge sort, Quicksort.

I was later told by my mentor to do the Insertion sort algorithm.

Here's my code for prompt 1:

```java
import java.util.*;
 
class Hello {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = userInput.nextLine();
        userInput.close();
        System.out.println("Hello, " + name + "!");
    }
}
```

And here's my code for prompt 2:

```java
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
```

The above algorithm works by dividing an array into a sorted and an unsorted part before iteratively inserting each element from the unsorted part into its rightful position in the sorted part.

For example, if the array is 2, 42, 7, 8, then the steps are as follows:

1. Starting with the second element (42), the algorithm compares it to the element before it (2). Since 42 is greater than 2, they remain in their current order.
The array at this stage: 2, 42, 7, 8

2. The third element (7) is compared to its neighbor before it (42) and since 7 is less than 42, it swaps places with 42.
The array at this stage: 2, 7, 42, 8

3. The third element (7) is compared to its neighbor before it (2) and since 7 is greater than 2, it remains in its current position.
The array at this stage: 2, 7, 42, 8

4. The fourth element (8) is compared to its neighbor before it (42) and since 8 is less than 42, it swaps places with 42. Then, it is compared to the next neighbor before it (7) and swaps places with 7.
The array at this stage: 2, 7, 8, 42

My mentor gave the quicksort algorithm as extra credit and I might do that one later and post the code here.

# Extra Credit: QuickSort Algorithm

The following is my code for the QuickSort algorithm:

```java
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
```
When I ran it in terminal and set the length of the randomly-generated array to 10,000, it completed the task in 4ms. In contrast, it took the InsertionSort algorithm 31ms to sort an array of exactly the same length, which means the QuickSort algorithm was 7.75 times as fast!
