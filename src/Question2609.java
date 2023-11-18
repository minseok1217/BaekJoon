import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question2609 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int min = 1;
        int c = a;
        int d = b;
        
        while(true){
            int e = d % c;
            int f = c;
            c = e;
            d = f;
            // System.out.println(String.format("a : %d b : %d", a, b));
            if( c == 0){
                min = d;
                break;
            }
        }
        System.out.println(min);
        // int max = min;
        // System.out.println(String.format("a %d b %d", a, b));
        int max = min * (a / min) * (b / min);
        System.out.println(max);
    }
}
