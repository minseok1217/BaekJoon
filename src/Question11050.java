import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question11050 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(com(a, b));
    }

    public static int com(int a, int b){
        return fac(a) / (fac(b) * fac(a - b));
    }


    public static int fac(int a){
        if( a <= 1){
            return 1;
        }
        else{
            return a * fac(a - 1);
        }
    }
}
