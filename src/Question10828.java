import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Question10828 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        // System.out.println(n);
        for( int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String menu = st.nextToken();
            if(menu.equals("push")){
                stack.push(Integer.parseInt(st.nextToken()));
            }
            else if(menu.equals("top")){
                if(stack.empty()) sb.append(-1).append("\n");
                else sb.append(stack.peek()).append("\n");
            }
            else if(menu.equals("empty")){
                if(stack.empty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            }
            else if(menu.equals("pop")){
                if(stack.empty()) sb.append(-1).append("\n");
                else sb.append(stack.pop()).append("\n");
                
            }
            else{
                sb.append(stack.size()).append("\n");
            }
            // System.out.println(stack);
        }
        System.out.println(sb);
    }
}
