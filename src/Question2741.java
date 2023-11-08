import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question2741 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringBuffer st = new StringBuffer();
        for (int i = 0; i < a; i++){
            st.append(i+1).append("\n");
        }
        System.out.println(st);
    }    
}
