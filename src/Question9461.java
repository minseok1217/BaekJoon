import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question9461 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i = 0 ;i < t; i++){
            List<Long> list = new ArrayList<>(Arrays.asList(1L,1L,1L,2L,2L));
            int n = Integer.parseInt(br.readLine());
            if(n > 5){
                for(int j = 5; j <= n ;j++){
                    list.add(list.get(j - 5) + list.get(j - 1));
                }
            }
            sb.append(list.get(n - 1)).append("\n");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}
