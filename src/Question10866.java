import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Question10866{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();
        for( int i = 0 ; i < n ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(str.equals("push_front")) deque.addFirst(Integer.parseInt(st.nextToken()));
            else if(str.equals("push_back")) deque.addLast(Integer.parseInt(st.nextToken()));
            else if(str.equals("pop_front")){
                if(deque.isEmpty()) sb.append("-1").append("\n");
                else sb.append(deque.removeFirst()).append("\n");
            }
            else if(str.equals("pop_back")){
                if(deque.isEmpty()) sb.append("-1").append("\n");
                else sb.append(deque.removeLast()).append("\n");
            }
            else if(str.equals("size")) sb.append(deque.size()).append("\n");
            else if(str.equals("empty")){
                if(deque.isEmpty()) sb.append("1").append("\n");
                else sb.append(0).append("\n");
            }
            else if(str.equals("front")){
                if(deque.isEmpty()) sb.append("-1").append("\n");
                else sb.append(deque.getFirst()).append("\n");
            }
            else{
                if(deque.isEmpty()) sb.append("-1").append("\n");
                else sb.append(deque.getLast()).append("\n");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}