import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        
        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            
            System.out.println("Case #" + (i+1) +": " + 
                              (Integer.parseInt(st.nextToken()) 
                              + Integer.parseInt(st.nextToken())));
        }
        
        br.close();
    }
}