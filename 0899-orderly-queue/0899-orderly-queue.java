class Solution {
    public String orderlyQueue(String s, int k) {
        if(k > 1){
            char arr[] = s.toCharArray();
            Arrays.sort(arr);
            s = new String(arr);
        }
        String ans = s;
        for(int i = 1 ; i< s.length() ; i++){
            
            String temp = s.substring(i) + s.substring(0 , i);
            if(ans.compareTo(temp) >0){
                ans = temp;
            }
        }
        return ans;
        
    }
}