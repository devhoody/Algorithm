class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' ') answer += " ";
            
            else if('a' <= s.charAt(i) && s.charAt(i) <= 'z'){
                if(s.charAt(i) + n > 'z'){
                    answer += (char)(s.charAt(i)+n - 26);
                } else {
                    answer += (char)(s.charAt(i) + n);    
                }
            } else if(('A' <= s.charAt(i) && s.charAt(i) <= 'Z')){
                if(s.charAt(i) + n > 'Z'){
                    answer += (char)(s.charAt(i)+n - 26);
                } else {
                    answer += (char)(s.charAt(i) + n);    
                }
                
            }
        }
        
        return answer;
    }
}