import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question11866 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] array = new int[n];
        int num = 0;
        
        int[] answer = new int[n];
        // System.out.println(array[0]);
        for(int i = 0; i < n; i++){
            int chk = 0;
            while(chk < k){
                if(array[num] == 0){
                    chk++;
                    // array[k] = 1;
                }

                if(chk == k){
                    answer[i] = num + 1;
                    array[num] = 1;
                    break;
                }
                
                if (num == n - 1){
                    num = 0;
                }
                else{
                    num++;
                }
                
            }
            
        }
        sb.append("<");
        for(int i = 0; i < n; i++){
            sb.append(answer[i]);
            if(i != n-1){
                sb.append(", ");
            }
        }
        // sb.deleteCharAt(sb.length() - 2);
        sb.append(">");
        System.out.println(sb);
    }
}
