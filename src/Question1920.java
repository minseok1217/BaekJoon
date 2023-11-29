import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Question1920 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);
        int m = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i = 0; i< m ; i++){
            int med = (int)(n / 2);
            int min = 0;
            int max = n - 1;
            int v = Integer.parseInt(stk.nextToken());
            // int chk = 1;
            if(array[med] == v) sb.append(1).append("\n");
            else {
                while(true){
                    if(array[med] < v){
                        min = med;
                    } 
                    else{
                        max = med;
                    }
                    med = (min + max) / 2;
                    if(max - min <= 1){
                        if(array[max] == v|| array[min] == v) sb.append(1).append("\n");
                        else sb.append(0).append("\n");
                        break;
                    }
                }
            }          
        }
        System.out.println(sb);

        // int m = Integer.parseInt(br.readLine());
        // StringTokenizer stk = new StringTokenizer(br.readLine());
        
        // for(int i = 0; i < m ; i++){
        //     int chk = 0;
        //     int m_ = Integer.parseInt(stk.nextToken());
        //     for(int j = 0; j < n ; j++){
        //         if(array[j] == m_){
        //             chk = 1;
        //             break;
        //         }
        //     }
        //     sb.append(chk).append("\n");
        // }
        // System.out.println(sb);
    }
}
