import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Question18110{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];
        for(int i = 0 ;i < n; i++){
            list[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(list);
        // BigDecimal bd = new BigDecimal(Double.toString(n * 0.15));
        // System.out.println((bd.setScale(0, RoundingMode.HALF_UP)).getClass().getName());
        // int index = bd.setScale(0, RoundingMode.HALF_UP).intValue();
        int index = Math.round( (float)(n * 0.15));
        // bd.setScale(0,RoundingMode.HALF_UP);
        int sum = 0;
        for(int i = index; i < n - index; i ++){
            sum += list[i];
        }
        // BigDecimal ans = new BigDecimal(Double.toString((double)sum / (n - index * 2)));
        // System.out.println(sum);
        // System.out.println(sum / (n - 2 * (float)index));
        System.out.println(Math.round(((float)sum / (n - 2 * index))));
    }
}