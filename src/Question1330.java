import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.SocketTimeoutException;
import java.util.StringTokenizer;

public class Question1330 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n_1 = Integer.parseInt(st.nextToken());
        int n_2 = Integer.parseInt(st.nextToken());
        if(n_1 == n_2)
            System.out.println("==");
        else if(n_1 > n_2)
            System.out.println(">");
        else
            System.out.println("<");
    }
}
