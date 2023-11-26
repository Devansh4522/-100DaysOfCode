import java.util.HashMap;

public class ar_noOfSubarrayswithgivensum {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        map.put(sum, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }
        return count;
        // int count =0;
        // for(int i=0;i<nums.length;i++){
        // int sum=0;
        // for(int j=i;j<nums.length;j++){
        // sum+=nums[j];
        // if(sum==k){
        // count++;
        // }
        // }
        // }
        // return count;
    }
}
