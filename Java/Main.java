public class Main
{
    public static void main(String[] args) {
        int[] array = {1,9,2,6,7,4,22,64,85,3};

        mergeSort(array, 0, array.length - 1);

        for (int item : array) {
            System.out.println(item);
        }
    }

    private static void mergeSort(int[] array, int init, int end) {

        if(init >= end) {
        } else {
            int middle = (init + end) / 2;
            mergeSort(array, init, middle);
            mergeSort(array, middle + 1, end);

            merge(array, init, middle, end);
        }
    }

    private static void merge(int[] array, int init, int middle, int end) {
        int[] list = new int[array.length];

        if (end + 1 - init >= 0) System.arraycopy(array, init, list, init, end + 1 - init);

        int i = init, j = middle + 1, k = init;

        while (i <= middle && j <= end) {

            if (list[i] <= list[j]) {
                array[k] = list[i];
                i++;
            } else {
                array[k] = list[j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            array[k] = list[i];
            i++;
            k++;
        }

        while (j <= end) {
            array[k] = list[j];
            j++;
            k++;
        }
    }
}
