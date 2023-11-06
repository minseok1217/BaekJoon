import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Question2475 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = 0;
        for(int i = 0; i < 5 ; i++){
            int b = Integer.parseInt(st.nextToken());
            a = a + b * b;
        }
        System.out.println(a % 10);
    }
}
