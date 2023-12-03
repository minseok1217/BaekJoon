import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Question10845 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();     
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int k = 0;
            StringBuilder sb = new StringBuilder();
            if(st.hasMoreTokens()) k = Integer.parseInt(st.nextToken());
            
            if(str.equals("push")){
                queue.offer(k);
            }
            else if(str.equals("pop")){
                if(queue.size() > 1){
                    sb.append("-1").append("\n");
                }
            }
            else if(str.equals("size")){

            }
            else if(str.equals("empty")){
                if(queue.size() > 1){
                    sb.append(1).append("\n");
                }
                else{
                    sb.append(0).append("\n");
                }
            }
            else if(str.equals("front")){
                
            }
            else{

            }
        }
    }
}
