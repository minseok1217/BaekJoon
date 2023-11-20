import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Question2751 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        for(int i = 0; i < n ; i++){
            array[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(array);
        for(int i = 0; i < n; i++){
            sb.append(array[i]).append("\n");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}
