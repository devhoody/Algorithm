import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();		
		StringBuilder sb = new StringBuilder();		
		for(int i=1; i<=n; i++){			
            for(int j=n; j>i; j--){
                sb.append(" ");
            }
            for(int j=1; j<=i; j++){
			    sb.append("*");
            }
			sb.append("\n");            
		}
		System.out.println(sb);
	}
	
}
