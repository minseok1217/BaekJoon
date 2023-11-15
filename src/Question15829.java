import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question15829 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        char[] ch = br.readLine().toCharArray();
        long r = 1;
        int M = 1234567891;
        long sum = 0;
        for(int i = 0;i < ch.length; i++){
            sum += (((int)ch[i]- 96) * r ) % M;
            // System.out.println(r);
            // System.out.println((int)(ch[i]) - 97);
            // System.out.println((((int)ch[i]- 97) * r ) % M);
            r *= 31;
        }
        System.out.println(sum);
    }
}
