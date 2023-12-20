import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Question1966{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i= 0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            Queue<Integer> queue = new LinkedList<>();
            StringTokenizer stk = new StringTokenizer(br.readLine());
            while(stk.hasMoreTokens()){
                queue.add(Integer.parseInt(stk.nextToken()));
            }
            while(!queue.isEmpty()){
                if(max(queue) == queue.peek()){
                    if(num == 0){
                        sb.append(n - queue.size() + 1).append("\n");
                        break;
                    }
                    else{
                        num--;
                        queue.poll();
                    }
                    // sb.append(queue.poll()).append("\n");
                }
                else{
                    if(num == 0){
                        num = queue.size() - 1;
                        queue.add(queue.poll());
                    }
                    else {
                        num--;
                        queue.add(queue.poll());
                    }
                }
                // System.out.println(queue);
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
    public static int max(Queue<Integer> queue){
        int max = 0;
        for(Integer i : queue){
            if (i>max){
                max = i;
            }
        }
        return max;
    }
}