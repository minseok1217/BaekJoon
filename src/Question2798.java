import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question2798 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // int sum = 0;
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int[] array = new int[n];
        for (int i = 0 ; i < n ; i++){
            array[i] = Integer.parseInt(stk.nextToken());
        }
        int min = Integer.MAX_VALUE / 2;
        // System.out.println(min);
        // int min_value = 0;
        for (int i = 0 ; i < n-2; i ++){
            for (int j = i + 1; j < n - 1 ; j++ ){
                for (int k = j + 1; k < n ; k ++){
                    if(Math.abs(array[i] + array[j] + array[k] - m) < min){
                        // min_value = array[i] + array[j] + array[k] ;
                        min = Math.abs(array[i] + array[j] + array[k] - m);
                    }
                }
            }
        }
        System.out.println(min + m);
    }
}
