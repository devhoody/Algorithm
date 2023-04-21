import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] arr = new int[N];
        
        for(int i=0; i<arr.length;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int searchNum = Integer.parseInt(br.readLine());
        int count = 0;
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i]== searchNum) 
                count++;
        }
        System.out.println(count);
        br.close();
    }
}