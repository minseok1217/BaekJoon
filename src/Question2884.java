import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question2884 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        m = m - 45;
        if(m < 0){
            m += 60;
            h = h - 1;
        }
        
        if(h < 0){
            h += 24;
        }
        System.out.println(String.format("%d %d",h, m));

    }
}
