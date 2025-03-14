package TCS_NQT;

public class DuplicateElement_Arr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1}; // Example array
        findDuplicates(arr);
    }

    public static void findDuplicates(int[] arr) {
        System.out.println("Duplicate elements in the array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break; // Avoid printing the same duplicate multiple times
                }
            }
        }
    }
}
