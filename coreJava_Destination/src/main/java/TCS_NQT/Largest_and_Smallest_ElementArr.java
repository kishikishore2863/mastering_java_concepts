package TCS_NQT;

public class Largest_and_Smallest_ElementArr {
    public static void main(String[] args) {
        int[] arr = {12, 45, 2, 67, 34, 89, 1, 6}; // Example array
        findLargestAndSmallest(arr);
    }

    public static void findLargestAndSmallest(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int largest = 0;
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i]<smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest Element: " + largest);
        System.out.println("Smallest Element: " + smallest);
    }
}

