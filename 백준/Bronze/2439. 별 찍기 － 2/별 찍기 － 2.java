import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++){
            sb.append(" ");
        }

        for(int i=0; i<N; i++){
            sb.replace(sb.length()-1-i,sb.length()-i, "*");
            bw.write(sb.toString());
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
