public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int a = 7;

        System.out.println(searchValue(arr, a));
    }

    public static int searchValue(int[] array, int val) {
        int last = array.length - 1;
        int first = 0;

        for (int i = 0; i <= last; i++) {
            int middle = (first + last) / 2;
            if (array[middle] == val)
                return middle + 1;
            else if (array[middle] < val) {
                first = middle + 1;
            } else {
                last = middle - 1;
            }
        }return searchValue(array, val);
    }
}

