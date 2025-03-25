import java.util.Arrays;

class ClosestNumber {
    public static int closer(int left,int right,int target) {
        if (target - left > right - target)
            return right;
        else
            return left;
    }
    public static int closestNumber(int[] arr, int target) {
        int n =arr.length;
        if (target <= arr[0])
            return arr[0];
        if (target >= arr[n-1])
            return arr[n-1];
        int i = 0, j = n, mid = 0;
        while (i < j) {
            mid = (i + j) / 2;
           if (arr[mid] == target)
               return arr[mid];
           if (target < arr[mid]) {
               if (mid > 0 && target > arr[mid -1]) {
                   return closer(arr[mid - 1], arr[mid], target);
               }
               j = mid;
           }
           else {
               if (mid < n-1 && target <arr[mid + 1]) {
                   return closer(arr[mid], arr[mid +1], target);
               }
               i = mid + 1;
           }
        }
        return arr[mid];
    }
    public static void main(String args[]) {
        int arr[] = { 1, 2, 4, 5, 6, 6, 8, 9 };
        int target = 11;
        System.out.println(Arrays.toString(arr) + "\tTarget = " + target + "  --->   Closest Number = " + closestNumber(arr, target));

        int arr1[] = {3,5,7,9,11,17};
        target = 10;
        System.out.println(Arrays.toString(arr1) + "\t\tTarget = " + target + "  --->   Closest Number = " + closestNumber(arr1, target));
    }
}
