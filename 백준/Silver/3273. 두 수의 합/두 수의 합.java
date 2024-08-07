import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int target = Integer.parseInt(br.readLine());

        int lt = 0;
        int rt = N-1;
        int cnt = 0;
        int sum =0;

        Arrays.sort(arr);

        while(lt<rt){
            sum = arr[lt]+arr[rt];

            if(sum == target) cnt++;

            if(sum < target) lt++;
            else rt--;
        }

        System.out.println(cnt);
    }
}
