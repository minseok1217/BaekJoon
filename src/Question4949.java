import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question4949{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // String str = new String();
        while(true){
            String str = br.readLine();
            if(str.equals(".")) {
                // System.out.println("222222222222");
                break;
            } 
            System.out.println(str);
            char[] ch = str.toCharArray();
            int chk = 1;
            int a_1 = 0;
            int a_2 = 0;
            int b_1 = 0;
            int b_2 = 0;
            for(char i : ch){
                if(i == '(') a_1++;
                else if(i == ')') a_2++;
                else if(i == '[') b_1++;
                else if(i == ']') b_2++;
                
                if(a_1 < a_2){
                    chk =0;
                    break;
                }
                if(b_1 < b_2){
                    chk = 0;
                    break;
                }

            }

            if(chk == 1){
                if(a_1 == a_2 && b_1 == b_2) sb.append("yes\n");
                else sb.append("no\n");
            }
            else sb.append("no\n");
        }
        // System.out.println("1111111111111111111");
        if(sb.length() > 1) sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}