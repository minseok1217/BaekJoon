import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question27866 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = br.readLine().toCharArray();
        int b = Integer.parseInt(br.readLine());
        System.out.println(a[b-1]);
    }
}
