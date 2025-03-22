import java.util.Arrays;

class PeakElement {
    public static int findPeakRec(int low, int high, int size, int[] array) {
        int middle = low + (high - low) / 2;
        if ((middle == size - 1 || array[middle + 1] <= array[middle]) &&
                (middle == 0 || array[middle - 1] <= array[middle])) {
            return middle;
        }
        if (array[middle-1] > array[middle] && middle >0) {
            return findPeakRec(low, middle - 1, size, array);
        }
        else {
            return findPeakRec(middle + 1, high, size, array);
        }
    }
    public static int findPeak(int arr[]) {
        int n = arr.length;
        return findPeakRec(0, n-1, n, arr);
    }
    public static void main (String args[]) {
        int[][] inputs = {{7, 11, 22, 13, 4, 0} , {13, 27, 54, 11, 99, 1} ,{0, 1, 2, 3, 4, 5} , {10, 9, 8, 7, 6}};
        int peak = 0;
        for (int i = 0; i < inputs.length; i++) {
            peak = findPeak(inputs[i]);
            if (i == 2)
                System.out.println("Input Array: " + Arrays.toString(inputs[i]) + " ----> Peak = \"" + inputs[i][peak] + "\"\t\t (Ascending Order - Peak = Last Element)\n");
            else if (i == 3)
                System.out.println("Input Array: " + Arrays.toString(inputs[i]) + " ----> Peak = \"" + inputs[i][peak] + "\"\t\t(Descending Order - Peak = First Element)\n");
            else
                System.out.println("Input Array: " + Arrays.toString(inputs[i]) + " ----> Peak = \"" + inputs[i][peak] + "\"\n");

        }
    }
}