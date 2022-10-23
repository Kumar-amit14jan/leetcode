class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[] = new int[2];
        Arrays.sort(nums);
        int original[] = new int[nums.length];
        for(int i = 0 ; i< original.length ; i++){
            original[i] = i+1;
        }
        HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
        for(int i = 0 ; i< nums.length ; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        for(int i = 1 ; i<= nums.length ; i++){
            if(map.containsKey(i) == false){
                arr[1] = i;
            }
            if(map.containsKey(i) && map.get(i) == 2){
                arr[0] = i;
            }
        }
        
        return arr;
        
    }
}