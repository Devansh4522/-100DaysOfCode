public class ar_subArrayWithGivenXOR {
    public int solve(int[] A, int B) {
        
            //optimized approach
        HashMap <Integer, Integer> map=new HashMap<>();
        int xr=0;
        map.put(0,1);
        int count=0;
        for(int i=0;i<A.length;i++){
            xr=xr^A[i];
            int x=xr^B;
            if(map.containsKey(x)){
            count+=map.get(x);
            }
            
            
            if(map.containsKey(xr)){
            map.put(xr,map.get(xr)+1);
            }
            else{
                 map.put(xr,1);
            }
        }
        return count;
        
        
        // int xor,count=0;
        // for(int i=0;i<A.length;i++){
        //     xor=0;
        //     for(int j=i;j<A.length;j++){
        //         xor=xor^A[j];
        //         if(xor==B){
        //             count++;
        //         }
        //     }
        // }
        // return count;
        
        
    
    }
}
