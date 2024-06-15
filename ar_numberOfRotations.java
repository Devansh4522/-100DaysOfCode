public class ar_numberOfRotations {

    class Solution {
        int findKRotation(int arr[], int n) {
            // code here
            int low = 0;
            int high = n - 1;
            int ans = Integer.MAX_VALUE;
            int index = -1;

            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[low] <= arr[high]) {
                    if (arr[low] < ans) {
                        index = low;
                        return index;
                    }

                }
                if (arr[low] <= arr[mid]) {
                    if (arr[low] < ans) {
                        ans = arr[low];
                        index = low;
                    }
                    low = mid + 1;
                } else {
                    if (arr[mid] < ans) {
                        ans = arr[mid];
                        index = mid;
                    }
                    high = mid - 1;
                }
            }
            return index;

        }
    }
}
