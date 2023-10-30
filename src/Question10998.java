import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Question10998 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int First = Integer.parseInt(st.nextToken());
        int Second = Integer.parseInt(st.nextToken());
        String f = Integer.toString(First * Second);
        bw.write(f);
        bw.flush();
        bw.close();
    }
}
