public class Solution {

    public static int[] swap(int a, int b) {
        // TODO: Swap the values of a and b using a temporary variable
        // Return the swapped values as: new int[]{a, b}
        return new int[]{a, b};
    }

    public static void main(String[] args) {
        int[] result = swap(3, 7);
        System.out.println("After swap: " + result[0] + ", " + result[1]);
        // Expected: After swap: 7, 3
    }
}
