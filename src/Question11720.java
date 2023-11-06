import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String n = br.readLine();
        char[] str = n.toCharArray();
        int v = 0;
        for(int i = 0; i < str.length ; i ++)
            v += (int)str[i] - 48;
        System.out.println(v);
    } 
}
