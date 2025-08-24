import java.util.*;

class BlockSwap {
    // Wrapper over the recursive function leftRotateRec()
    public static void leftRotate(int arr[], int d, int n) {
        if (d == 0 || d == n) return;
        d = d % n; // Handle d > n case
        leftRotateRec(arr, 0, d, n);
    }

    // Recursive block swap algorithm
    public static void leftRotateRec(int arr[], int i, int d, int n) {
        if (d == 0 || d == n)
            return;

        if (n - d == d) {
            swap(arr, i, n - d + i, d);
            return;
        }

        // A is shorter
        if (d < n - d) {
            swap(arr, i, n - d + i, d);
            leftRotateRec(arr, i, d, n - d);
        }
        // B is shorter
        else {
            swap(arr, i, i + d, n - d);
            leftRotateRec(arr, n - d + i, 2 * d - n, d);
        }
    }

    // Swaps d elements from fi and si
    public static void swap(int arr[], int fi, int si, int d) {
        for (int i = 0; i < d; i++) {
            int temp = arr[fi + i];
            arr[fi + i] = arr[si + i];
            arr[si + i] = temp;
        }
    }

    // Print array
    public static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Main method with user input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of positions to rotate: ");
        int d = sc.nextInt();

        leftRotate(arr, d, n);

        System.out.println("Array after rotation:");
        printArray(arr, n);
    }
}

