import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question1003{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[][] f = new int[10000][2];
        f[0][0] = 1;
        f[0][1] = 0;
        f[1][0] = 0;
        f[1][1] = 1;
        int max = 1;
        for(int i = 0; i< n ; i++){
            // StringTokenizer st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(br.readLine());
            if(k >= max){
                for(int j = max; j <= k; j++){
                    f[j + 1][0] = f[j][0] + f[j - 1][0];
                    f[j + 1][1] = f[j][1] + f[j - 1][1];
                }
            }
            if (k > max){
                max = k;
            }
            sb.append(f[k][0] + " " + f[k][1]).append("\n");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}