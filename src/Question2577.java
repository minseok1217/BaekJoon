import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question2577 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        char[] c = Integer.toString(a).toCharArray();
        int[] array = new int[10];
        for(int i = 0; i < c.length ; i++){
            array[(int)c[i] - 48]++;
        }
        for(int i = 0; i < 10; i++){
            System.out.println(array[i]);
        }
    }
}
