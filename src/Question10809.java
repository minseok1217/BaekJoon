import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question10809 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] ch = s.toCharArray();
        int[] b = new int[26];
        for (int i = 0; i < 26; i ++){
            b[i] = -1;
        }
        for(int i = 0; i < ch.length ; i++){
            int n = (int)ch[i] - 97;
            // System.out.println(n);
            if(b[n] == -1){
                b[n] = i;
            }            
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++){
            sb.append(b[i]).append(' ');
        }
        System.out.println(sb);
    }
}
