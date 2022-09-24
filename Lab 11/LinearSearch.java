public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int element = 30;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("Found @ " + i);
            }
        }
    }
}
