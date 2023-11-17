import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question15829 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        char[] ch = br.readLine().toCharArray();
        long r = 1;
        long M = 1234567891;
        long sum = 0;
        for(int i = 0;i < l; i++){
            sum += (((int)ch[i]- 96) * r ) % M;
            r = (r * 31) % M;
        }
        System.out.println(sum % M);
    }
}
