import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question2562 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int n = 0;
        for(int i = 0; i < 9 ; i++){
            int value = Integer.parseInt(br.readLine());
            if(value > max){
                max = value;
                n = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(n);
    }
}
