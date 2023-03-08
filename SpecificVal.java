public class SpecificVal {
    public static boolean contains(int arr[], int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int[] my_array = { 1, 2, 3, 4, 5, 6, 7 };

        System.out.println(contains(my_array, 3));
        System.out.println(contains(my_array, 8));
    }
}
