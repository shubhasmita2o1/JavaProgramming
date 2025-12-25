
//1346. Check If N and Its Double Exist
//Given an array arr of integers, check if there exist two indices i and j such that :
//i != j
//0 <= i, j < arr.length
//arr[i] == 2 * arr[j]


public class DoubleExistBruteForce {
	public static void main(String[] args) {
        int arr[] = {10, 2, 5, 3};
        System.out.println(Check(arr)); // Call the static method directly
    }
	public static boolean Check(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == 2 * arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
