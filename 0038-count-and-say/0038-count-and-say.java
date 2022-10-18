class Solution {
    public String countAndSay(int n) {

       String ans = "1";
     
    for(int i = 2; i<=n; i++){
      String lastString = ans; 
      int l = ans.length();
      int j = 0;
        ans ="";
     while(j<l){
          int count = j;
          while(count < l &&  lastString.charAt(j) == lastString.charAt(count)){
              count++;
          }
         ans += Integer.toString(count - j) + lastString.charAt(j);
         j= count;
     }
    }
    return ans;
    
    }
}