class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int x = -1; // 실제 좌표 x
        int y = -1; // 실제 좌표 y
        int height = park.length;
        int weight = park[0].length();
        
        // 시작 위치 지정
        for(int i=0; i<park.length; i++){
            if(park[i].indexOf('S') != -1){
                x = park[i].indexOf('S');
                y = i;
            }
        }
        
        // 이동 시작
        
        for(int i=0; i<routes.length; i++){
            String[] arr = routes[i].split(" ");
            String vector = arr[0]; // 방향
            int distance = Integer.parseInt(arr[1]); // 이동거리
            int currX = x;
            int currY = y;
                
            if(vector.equals("E")){
                boolean flag = true;

                for(int j=0; j<distance; j++){
                    currX++;
                
                    if(currX >= weight){
                        flag = false;
                        break;
                    } else if(park[currY].charAt(currX) == 'X'){
                        flag = false;
                        break;
                    }    
                }
                
                if(flag){
                    x = currX;
                }
            } else if(vector.equals("W")){
                boolean flag = true;

                for(int j=0; j<distance; j++){
                    currX--;
                
                    if(currX <0){
                        flag = false;
                        break;
                    } else if(park[currY].charAt(currX) == 'X'){
                        flag = false;
                        break;
                    }    
                }
                
                if(flag){
                    x = currX;
                }
            } else if(vector.equals("S")){
                boolean flag = true;
                for(int j=0; j<distance; j++){
                    currY++;
                
                    if(currY >= height){
                        flag = false;
                        break;
                    } else if(park[currY].charAt(currX) == 'X'){
                        flag = false;
                        break;
                    }    
                }
                
                if(flag){
                    y = currY;
                }
            } else if(vector.equals("N")){
                boolean flag = true;
                for(int j=0; j<distance; j++){
                    currY--;
                
                    if(currY < 0){
                        flag = false;
                        break;
                    } else if(park[currY].charAt(currX) == 'X'){
                        flag = false;
                        break;
                    }    
                }
                
                if(flag){
                    y = currY;
                }
            } 
        } // 이동 끝
        
        answer[0] = y;
        answer[1] = x;
        
        return answer;
    }
}