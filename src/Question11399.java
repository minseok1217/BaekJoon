import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Question11399{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int val = 0;
        int[] p = new int[n];
        for(int i = 0; i < n; i++){
            p[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(p);
        // System.out.println(p);
        // for(int i : p) System.out.println(i);
        for(int i = 1; i <= n; i++){
            val += i * p[n-i];
        }
        System.out.println(val);
    }
}