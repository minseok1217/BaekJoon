import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question1978 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int chk = 0;
        for(int i = 0; i < n; i++ ){
            boolean sosoo = true;
            int t = Integer.parseInt(st.nextToken());
            if ( t != 1){
                for(int j = 2; j < t; j++){
                    if(t % j == 0){
                        sosoo = false;
                        break;
                    }
                }

                if(sosoo){
                    chk++;
                }
            }
        }
        System.out.println(chk);
    }
}
