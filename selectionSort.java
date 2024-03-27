import java.util.Scanner;

public class selectionSort {
    int select(int arr[], int i) {
        int minIndex = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        return minIndex;
    }

    void selectionSortMain(int arr[], int n) {

        // code here
        for (int i = 0; i < n - 2; i++) {
            int minIndex = select(arr, i);

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
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

            selectionSort obj = new selectionSort();
            obj.selectionSort(arr, n);

            System.out.println("Sorted array:");
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
            t--;
        }
        sc.close();
    }
}
