import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question2869 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        int answer = 0;
        v = v - a;

        if( v % (a- b) == 0){
            answer = v / (a - b) + 1;
        } 
        else{
            answer = v / (a - b) + 2;
        }
        
        System.out.println(answer);
    }
}
