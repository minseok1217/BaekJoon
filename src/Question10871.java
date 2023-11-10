import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question10871 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());

        StringTokenizer array = new StringTokenizer(br.readLine());
        for (int i =0; i < n; i++){
            int t = Integer.parseInt(array.nextToken());
            if(a > t){
                sb.append(t).append(" ");
            }

        }
        System.out.println(sb);
    }
}
