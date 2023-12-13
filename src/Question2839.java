import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question2839 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int n_5 = n / 5;
        int n_3 = (n - n_5 * 5) / 3;
        while(n_5 * 5 + n_3 * 3 != n && n_5 > 0){
            n_5 = n_5 - 1;
            n_3 = (n - n_5 * 5) / 3;
        }
        if(n_5 * 5 + n_3 * 3 == n ) System.out.println(n_5 + n_3);
        else System.out.println(-1);
    }
}
