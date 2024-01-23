import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question11727 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n];

        if(n == 1){
            System.out.println(1);
        }
        else if(n == 2){
            System.out.println(3);
        }
        else{
            dp[0] = 1;
            dp[1] = 3;
            if(n >= 3){
                for(int i = 2; i < n; i++){
                    dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007;
                }
            }
            System.out.println(dp[n - 1]);
        }
    }
}
