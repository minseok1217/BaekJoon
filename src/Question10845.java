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
        // queue.add(1);
        StringBuilder sb = new StringBuilder();   
        for(int i = 0; i < n; i++){
            // System.out.println(i);
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken(); 

            if(str.equals("push")){
                queue.offer(Integer.parseInt(st.nextToken()));
            }
            else if(str.equals("pop")){
                if (queue.isEmpty()) {
                    sb.append("-1").append("\n");
                }
                else sb.append(queue.poll()).append("\n");
            }
            else if(str.equals("size")){
                // if(queue.isEmpty()) sb.append("-1").append("\n");
                // else sb.append(queue.size()).append("\n");
                sb.append(queue.size()).append("\n");
            }
            else if(str.equals("empty")){
                if(queue.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            }
            else if(str.equals("front")){
                if(queue.isEmpty()) sb.append("-1").append("\n");
                else sb.append(queue.peek()).append("\n");
            }
            else{
                
                if(queue.isEmpty()) sb.append("-1").append("\n");
                else {
                    int a = 0;
                    // System.out.println(queue);
                    for(Integer v : queue){
                        a = v;
                    }
                    sb.append(a).append("\n");
                }
            }
        }
        // sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}
