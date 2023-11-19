public class ar_rearrangeElementsBySign {

    public int[] rearrangeArray(int[] nums) {

        int[] num = new int[nums.length];
        int p = 0, n = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                num[p] = nums[i];
                p += 2;
            } else {
                num[n] = nums[i];
                n += 2;
            }
        }
        return num;
    }
}

// when order is not necessory
// int j=1;
// for(int i=0;i<nums.length;i++){
// if(nums[i]>0){
// int temp=nums[i];
// nums[i]=nums[0];
// nums[0]=temp;
// break;
// }
// }
// int i=0;
// while(j<nums.length){
// if(nums[i]*nums[j]<0){
// int temp=nums[i+1];
// nums[i+1]=nums[j];
// nums[j]=temp;
// i++;
// j=i+1;
// }
// else{
// j++;
// }
// }
// return nums;
