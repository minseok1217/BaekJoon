import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question2292 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int pentagon = 1;
        int answer = 1;
        int value = 1;
        while(true){
            if(n <= pentagon){
                break;
            }

            if(value == 1){
                value = 6;
            }
            else{
                value += 6;
            }
            pentagon += value;
            answer++;
        }
        System.out.println(answer);
    }
}
