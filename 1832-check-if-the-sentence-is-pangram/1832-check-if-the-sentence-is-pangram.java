class Solution {
    public boolean checkIfPangram(String sentence) {
        int alphabet[] = new int[26];
        for(int i = 0 ; i< sentence.length() ; i++){
          int index = (sentence.charAt(i) - 'a');
            alphabet[index] +=1 ;
            
        }
        int count = 0;
        for(int i = 0 ; i< 26 ; i++){
            if(alphabet[i] != 0){
                count++;
            }
        }
        if(count == 26){
            return true;
        }
        
        return false;
        
    }
}