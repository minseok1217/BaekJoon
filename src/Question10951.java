import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question10951 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        StringTokenizer st;
        while((str = br.readLine()) != null){
            // System.out.println(str);
            // System.out.println("1");
            st = new StringTokenizer(str, " ");
            if(st.hasMoreTokens()){
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                sb.append(Integer.toString(a+b));
                sb.append("\n");
            }
            else{
                break;
            }
        }
        System.out.println(sb);
    }
}
