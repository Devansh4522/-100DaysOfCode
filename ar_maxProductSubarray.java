public class ar_maxProductSubarray {

    public int maxProduct(int[] nums) {

        // int res=nums[0];
        // int min=nums[0];
        // int max=nums[0];
        // for(int i=1;i<nums.length;i++){
        // if(nums[i]==0){
        // max=1;
        // min=1;
        // continue;
        // }
        // int temp1=nums[i]*max;
        // int temp2=nums[i]*min;

        // max=Math.max(temp1,temp2);
        // max=Math.max(nums[i],max);

        // min=Math.min(temp2,temp2);
        // min=Math.min(nums[i],min);

        // res=Math.max(res,max);
        // }

        // return res;
        int ans = nums[0];
        int maxp = nums[0];
        int minp = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int temp = Math.max(nums[i], Math.max(maxp * nums[i], minp * nums[i]));
            minp = Math.min(nums[i], Math.min(maxp * nums[i], minp * nums[i]));
            maxp = temp;
            ans = Math.max(maxp, ans);
        }

        return ans;
    }

}
