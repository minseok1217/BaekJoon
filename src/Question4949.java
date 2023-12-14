import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Question4949{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        while(true){
            String str = br.readLine();
            if(str.equals(".")) break;
            Stack<Character> stack = new Stack<>(); 
            char[] ch = str.toCharArray();
            int chk = 1;
            for(char i : ch){
                if(i == '(' || i == '['){
                    stack.add(i);
                }
                else if(i == ')'){
                    if(stack.empty() || stack.peek() != '('){
                        sb.append("no\n");
                        chk =0;
                        break;
                        
                    }
                    else{
                        stack.pop();
                        
                    }
                }
                else if(i == ']'){
                    if(stack.empty() || stack.peek() != '['){
                        sb.append("no\n");
                        chk = 0;
                        break;
                    }
                    else{
                        
                        stack.pop();
                    }
                }
            }
            if(stack.empty() && chk == 1){
                sb.append("yes\n");
            }
            else if(chk == 1){
                sb.append("no\n");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}