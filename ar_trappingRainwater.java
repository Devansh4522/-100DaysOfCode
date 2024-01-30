public class ar_trappingRainwater {
    public int trap(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n - 1;
        int lMax = 0;
        int rMax = 0;
        int ans = 0;
        while (l <= r) {
            if (height[l] <= height[r]) {
                if (lMax <= height[l]) {
                    lMax = height[l];
                } else {
                    ans += lMax - height[l];
                }
                l++;
            } else {
                if (rMax <= height[r]) {
                    rMax = height[r];
                } else {
                    ans += rMax - height[r];
                }
                r--;
            }
        }
        return ans;

        // int n=height.length;
        // int[] a=new int[n];
        // int[] b=new int[n];
        // a[0]=height[0];
        // b[n-1]=height[n-1];
        // for(int i=1;i<height.length;i++){
        // a[i]=Math.max(a[i-1],height[i]);
        // }
        // for(int i=height.length-2;i>=0;i--){
        // b[i]=Math.max(b[i+1],height[i]);
        // }
        // int answer=0;
        // for(int i=0;i<height.length;i++){
        // answer+=Math.min(a[i],b[i])-height[i];
        // }

        // return answer;

    }
}
