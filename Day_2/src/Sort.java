// Реализовать сортировку подсчетом
public class Sort {
    public static void main(String[] args) {
        int[] array = new int[] {1, 5, 3, 3, 2, 3, 8, 2, 8, 1, 2, 3, 5, 4, 2, 8, 1, 4, 8, 3, 5, 2, 1, 2, 3, 4, 8, 1, 3, 4, 2, 1, 5, 8, 4, 4, 2, 3, 3, 2, 4};
        countingSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static void countingSort(int[] arr) {
        int[] counter = new int[10];

        for (int i = 0; i < arr.length; i++) {
            counter[arr[i]]++;
        }

        int index = 0;
        for (int i = 0; i < counter.length; i++) {
            for (int j = 0; j < counter[i]; j++)
            {
                arr[index] = i;
                index++;
            }
        }
    }
}
