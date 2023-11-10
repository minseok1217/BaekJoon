import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question4153 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == 0 && b ==0 && c ==0){
                break;
            }
            
            int first = 0;
            int second = 0;
            int third = 0;

            if(a > b){
                if (c > a){
                    first = c;
                    second = a;
                    third = b;
                }
                else{
                    first = a;
                    second = b;
                    third = c;
                }
            }
            else{
                if(c > b){
                    first = c;
                    second = a;
                    third = b;
                }
                else{
                    first = b;
                    second = a;
                    third = c;
                }
            }
            
            if( first * first == second * second + third * third) sb.append("right").append("\n");
            
            else sb.append("wrong").append("\n");
        }
        
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}
