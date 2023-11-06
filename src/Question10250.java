import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question10250 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < t ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            // int a = 0;
            // System.out.println(String.format("%d %d %d", h, w, N));
            if (N % h == 0){
                sb.append(Integer.toString(h * 100 + N/h));
            }
            else{
                sb.append(Integer.toString(N % h * 100 + N/h + 1));
            }
            // sb.append(Integer.toString(N % h));
            // System.out.println(sb);
            // if(N / h + 1 < 10){
            //     sb.append("0");
            //     sb.append(N / h + 1);
            // }
            // else{
            //     sb.append(N / h + 1);
            // }
            sb.append("\n");
        }
        System.out.println(sb);
    }

}
