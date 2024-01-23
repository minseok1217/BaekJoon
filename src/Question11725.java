import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question11725 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for(int i = 2; i < n; i++){
            dp[i] = (dp[i-2] + dp[i - 1]) % 10007;
        }
        System.out.println(dp[n - 1]);
    }
}