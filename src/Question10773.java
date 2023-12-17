import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Question10773{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < k ; i++){
            int j = Integer.parseInt(br.readLine());
            if( j == 0){
                stack.pop();
            }
            else{
                stack.add(j);
            }
        }
        int sum = 0;
        for(Integer i : stack){
            sum+= i;
        }
        System.out.println(sum);
    }
}