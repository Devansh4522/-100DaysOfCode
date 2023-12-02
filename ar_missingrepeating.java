public class ar_missingrepeating {
    public static int[] findMissingRepeatingNumbers(int[] a) {
        int xr = 0;
        for (int i = 0; i < a.length; i++) {
            xr = xr ^ a[i] ^ (i + 1);
        }

        int rightmostSetBit = xr & -xr;
        int zero = 0;
        int one = 0;

        for (int i = 0; i < a.length; i++) {
            if ((a[i] & rightmostSetBit) != 0) {
                one = one ^ a[i];
            } else {
                zero = zero ^ a[i];
            }

            if (((i + 1) & rightmostSetBit) != 0) {
                one = one ^ (i + 1);
            } else {
                zero = zero ^ (i + 1);
            }
        }

        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == zero)
                cnt++;
        }

        if (cnt == 2)
            return new int[] { zero, one };
        return new int[] { one, zero };
    }

    // using maths
    // int mPLUSr=0;
    // int mMINUSr=0;
    // int mMINUSrSQ=0;
    // int m=0,r=0;
    // int sum=0,asum=0,asumsq=0,sumsq=0;
    // for(int i=0;i<a.length;i++){
    // asum+=a[i];
    // asumsq+=a[i]*a[i];
    // sum+=i+1;
    // sumsq+=(i+1)*(i+1);
    // }
    // mMINUSr=sum-asum;
    // mMINUSrSQ=sumsq-asumsq;
    // mPLUSr=mMINUSrSQ/mMINUSr;
    // m=(mPLUSr+mMINUSr)/2;
    // r=mPLUSr-m;
    // int x[]={r,m};
    // return x;
}
