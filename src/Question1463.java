import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question1463 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int val = N;
        int cnt = 0;
        while(N != 1){
            if(N % 3 == 0) N = N / 3;
            else N = N - 1;
            cnt++;
        }
        N = val;
        // cnt = 0;
        int min = cnt;
        cnt = 0;
        while(N != 1){
            if(N % 2 == 0) N = N / 2;
            else N = N - 1;
            cnt++;
        }
        if(cnt < min) min = cnt;
        N = val;
        cnt = 0;
        while(N != 1){
            if(N % 3 == 0) N = N / 3;
            else if(N % 2 == 0) N = N / 2;
            else N = N - 1;
            cnt++;
        }
        if(cnt < min) min = cnt;
        System.out.println(min);
    }
}
