import java.util.Arrays;

import static java.lang.Integer.*;

class MaxSubArray {
    public static int max(int n1, int n2, int n3) {
        return Math.max(Math.max(n1, n2), n3);
    }
    public static int crossingSum(int arr[], int left, int mid, int right) {
        int sum =0;
        int LeftSum = MIN_VALUE;
        for (int i = mid; i >= left; i--) {
            sum += arr[i];
            if (sum > LeftSum) {
                LeftSum = sum;
            }
        }
        sum = 0;
        int RightSum = MIN_VALUE;
        for (int i = mid + 1; i <= right; i++) {
            sum += arr[i];
            if (sum > RightSum) {
                RightSum = sum;
            }
        }
        return LeftSum + RightSum;
    }
    public static int maxSumArr(int arr[], int left, int right) {
        if (left == right)
            return arr[left];
        int mid = (left + right) / 2;
        return max(maxSumArr(arr, left, left), maxSumArr(arr, mid + 1, right), crossingSum(arr, left, mid, right));
    }
    public static void main(String args[]) {
        int[][] inputs = {{0, 1, 2, 5}, {-1, -2, -3, -4, -5}, {-2, 10, 7, -5, 15, 6}, {-1, -3, 4, -1, -2, 1, 5, -3}};
        for (int i = 0; i < inputs.length; i++) {
            if (i == 0)
                System.out.println("Case I - All Positive Inputs\n" + Arrays.toString(inputs[i]) + "\t---> \tMax Subarr Sum: \"" + maxSumArr(inputs[i], 0, inputs[i].length - 1) + "\"\n");

            else if (i == 1)
                System.out.println("Case II - All Negative Inputs\n" + Arrays.toString(inputs[i]) + "\t---> \tMax Subarr Sum: \"" + maxSumArr(inputs[i], 0, inputs[i].length - 1) + "\"\n");

            else if (i == 2) {
                System.out.println("Case III - Both Positive & Negative Inputs");
                System.out.println(Arrays.toString(inputs[i]) + "\t---> \tMax Subarr Sum: \"" + maxSumArr(inputs[i], 0, inputs[i].length - 1) + "\"");
            } else if (i == 3)
                System.out.println(Arrays.toString(inputs[i]) + "\t---> \tMax Subarr Sum: \"" + maxSumArr(inputs[i], 0, inputs[i].length - 1) + "\"\n");
        }
    }
}