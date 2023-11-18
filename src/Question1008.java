import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Question1008 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double First = Double.parseDouble(st.nextToken());
        double Second = Double.parseDouble(st.nextToken());
        // 이거 알고 있기!!!
        // StringBuilder sb = new StringBuilder();
        // for(int i = 0; i<10; ++i){
        //     System.out.println(10);
        //     sb.append(10).append('\n');
        // }
        // System.out.println(sb);

        double value = First / Second;
        System.out.println(value);
        String f = Double.toString(First / Second);
        bw.write(f);
        bw.flush();
        bw.close();
    }
    
}
