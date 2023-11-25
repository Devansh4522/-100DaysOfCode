import java.util.ArrayList;
import java.util.List;

public class ar_countInversion {
    private static int merge(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        int cnt = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                cnt += (mid - left + 1);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        return cnt;
    }

    public static int mergeSort(int[] arr, int low, int high) {
        int cnt = 0;
        if (low >= high)
            return cnt;
        int mid = (low + high) / 2;
        cnt += mergeSort(arr, low, mid);
        cnt += mergeSort(arr, mid + 1, high);
        cnt += merge(arr, low, mid, high);
        return cnt;
    }

    public static int numberOfInversions(int[] a, int n) {

        return mergeSort(a, 0, n - 1);
    }

    // Brute Force
    // public static int numberOfInversions(int []a, int n) {
    // // Write your code here.
    // int count=0;
    // for(int i=0;i<n-1;i++){
    // for(int j=i+1;j<n;j++){
    // if(a[i]>a[j]){
    // count++;
    // }
    // }
    // }
    // return count;

    // }

}
