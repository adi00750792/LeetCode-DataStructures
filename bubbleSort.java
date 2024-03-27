import java.util.Scanner;

public class bubbleSort {

    void bubbleSortmain(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test cases: ");
        int t = sc.nextInt();
        while (t > 0) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            bubbleSort obj = new bubbleSort();
            obj.bubbleSortmain(arr, n);

            System.out.println("Sorted array:");
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
            t--;
        }
        sc.close();
    }
}
