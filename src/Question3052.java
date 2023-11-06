import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question3052 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int c = 0;
        byte[] b = new byte[1000];
        for(int i = 0 ; i < 10; i++){
            a = Integer.parseInt(br.readLine()) % 42;
            if(b[a] == 0){
                c += 1;
                b[a] = 1; 
            }
        }
        System.out.println(c);
    }
}

