import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> map = new HashMap<>();
        
        for(String[] cloth : clothes){
            if(map.containsKey(cloth[1])){
                map.put(cloth[1], map.get(cloth[1])+1);
            } else{
                map.put(cloth[1], 1);
            }
        }
        
        // 모든 조합
        for(Integer i : map.values()){
            answer *= (i+1);
        }
        
        return answer-1;
    }
}