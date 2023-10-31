import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question1001 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int First = Integer.parseInt(st.nextToken());
        int Second = Integer.parseInt(st.nextToken());
        System.out.println(First - Second);
        System.exit(1);
    }
}
