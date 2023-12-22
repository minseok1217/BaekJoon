import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question1654{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int sum = 0;
        int count = 0;
        int ans = 0;
        int[] lan = new int[k];
        for(int i = 0; i< k; i++){
            lan[i] = Integer.parseInt(br.readLine());
            sum += lan[i];
        }
        // ans = (int)(sum / n);
        for(int i = 30 ; i >= 0 ; i--){
            int ex = ans + (int)Math.pow(2,i);
            int count_ex = 0;
            for(int j : lan){
                count_ex += j/ex;
            }
            if(count_ex > n){
                ans = ex;
            }
            else if(count_ex < n){}
            else{
                ans = ex;
                // break;
            }
            // System.out.println(ans);
        }
        // System.out.println(ans);
        int count_ = 0;
        for(int i : lan){
            count_ += i / ans;
        }
        // System.out.println(count_);
        while(count_ == n){
            count_ = 0;
            for(int i : lan){
                count_ += i / ans;
            }
            // System.out.println(count_);
            if(count_ != n){
                ans--;
                break;
            }
            else{
                ans++;
            }
        }
        System.out.println(ans);
    }
}