import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question11654 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] c = br.readLine().toCharArray();

        System.out.println((int)c[0]);
    }
}
