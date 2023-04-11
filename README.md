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
```

The above algorithm works by dividing an array into a sorted and an unsorted part before iteratively inserting each element from the unsorted part into its rightful position in the sorted part.

My mentor gave the quicksort algorithm as extra credit and I might do that one later and post the code here.
