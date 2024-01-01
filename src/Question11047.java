import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question11047 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int ans = 0;
        int[] m = new int[n];
        for(int i = n - 1; i >= 0; i--){
            m[i] = Integer.parseInt(br.readLine());
        }
        for(int i : m){
            ans += k / i;
            k = k - (int)(k / i) * i;
        }
        System.out.println(ans);
    }
}
