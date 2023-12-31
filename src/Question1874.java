import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Question1874 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < n; i++){
            queue.add(Integer.parseInt(br.readLine()));
        }
        int i = 1;
        while(!queue.isEmpty()){
            stack.add(i);
            sb.append("+\n");
            while(true){
                if(stack.isEmpty() || queue.isEmpty()) break;
                if(stack.peek().equals(queue.peek())){
                    sb.append("-\n");
                    stack.pop();
                    queue.poll();
                }
                else{
                    break;
                }
                
            }
            if(i < n){
                i++;
            }
            else{
                break;
            }
        }
        if(queue.isEmpty()){
            // sb.deleteCharAt(sb.length() - 1);
            System.out.print(sb);
        }
        else{
            System.out.println("NO");
        }
    }
}
