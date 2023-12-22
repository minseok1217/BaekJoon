import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Question2108 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        for(int i = 0 ; i < n ; i++){
            num[i] = Integer.parseInt(br.readLine());
        }
        /// 한바퀴를 돌면서 min, max, sum, mid 다 구하기
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int[] count = new int[8001];
        // int mode = 0;
        for(int i : num){
            if(i > max) max = i;
            if(i < min) min = i;
            sum += i;
            count[i + 4000]++;
        }
        sb.append(Math.round(sum / (double)n)).append("\n");
        Arrays.sort(num);
        sb.append(num[(n+1)/2-1]).append("\n"); /// 중앙값
        sb.append(max(count)).append("\n");
        sb.append(max - min);
        System.out.println(sb);
    }
    public static int max(int[] num){
        int count = 0;
        int max = 0;
        int chk = 0;
        for(int i = 0; i < num.length ; i++){
            if(num[i] > max){
                count = i;
                chk = 0;
                max = num[i];
            }
            else if(num[i] == max && chk == 0){
                count = i;
                chk = 1;

            }
        }
        // System.out.println(count);
        return count - 4000;
    }
}
