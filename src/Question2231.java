import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question2231 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int m = Integer.parseInt(str);
        int l = str.toCharArray().length;
        // System.out.println(l);
        int answer = 0;
        for( int i = m - 9 * l; i< m; i++){
            int value = i;
            char[] ch = Integer.toString(i).toCharArray();
            // System.out.println(i);
            for(int j = 0; j < ch.length ; j++){
                // System.out.println(ch[i]);
                value += (int)ch[j] - 48;
                // System.out.println((int)ch[j] - 48);
            }
            if(m == value){
                answer = i;
                break;
            }
            // System.out.println(value);
        }
        System.out.println(answer);
    }
}
