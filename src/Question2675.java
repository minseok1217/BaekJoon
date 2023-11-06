import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question2675 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        // int A = Integer.parseInt(br.readLine());
            for(int i = 0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            
            // System.out.println(a);
            if (st.hasMoreTokens()){
                char[] ch = st.nextToken().toCharArray();
                for(int j = 0; j < ch.length ; j++){
                    for(int k = 0; k<a ; k++){
                        sb.append(ch[j]);
                    }
                    
                }
            }
            sb.append("\n"); 
            
        }
        System.out.println(sb);
    }
}
