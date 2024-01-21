import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question11659 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] num = new int[n];
        int[] arr = new int[n + 1];
        StringTokenizer s = new StringTokenizer(br.readLine());
        for(int i = 0;i<n;i++){
            // num[i] = Integer.parseInt(s.nextToken());
            if( i == 0) arr[i + 1] = Integer.parseInt(s.nextToken());
            else arr[i + 1] = arr[i] + Integer.parseInt(s.nextToken());
        }
        for(int i = 0; i< m; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int sum = 0;
            int first = Integer.parseInt(stk.nextToken());
            int last = Integer.parseInt(stk.nextToken());

            sb.append(arr[last] - arr[first - 1]).append("\n");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}