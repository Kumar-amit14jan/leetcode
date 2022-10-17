class Solution {
    public int trap(int[] height) {
        // water exist because when there is building exist between them
        
        int size = height.length;
        int left[] = new int[size];
        int right[] = new int[size];
        
        left[0] = height[0];
        
        
        // height greater than current in leftpart
        for(int i = 1 ; i< size ; i++){
            left[i] = Math.max(left[i - 1] , height[i]);
            
        }
        
        // height greater than current in rightpart;
        right[size - 1] = height[size - 1];
        for(int i = size - 2 ; i>=0 ; i--){
            right[i] = Math.max(right[i + 1] , height[i]);
        }
        
        int sum = 0 ;
        for(int i = 0 ; i< size ; i++){
            sum += Math.min(right[i] , left[i]) - height[i];
        }
        return sum;
    }
}