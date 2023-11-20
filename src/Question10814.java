import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Question10814 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> ht = new HashMap<String, Integer>();
        int[] ar = new int[n];
        for(int i = 0; i < n ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            ar[i] = num;
            // ht.put(num, new ArrayList<>(Arrays.asList(str)));
            // ht.get(num).add("str");
        }
    }
}
