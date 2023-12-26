import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Question18111 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            while(stk.hasMoreTokens()){
                int value = Integer.parseInt(stk.nextToken());
                if(map.get(value) == null){
                    map.put(value,1);
                }
                else{
                    map.put(value,map.get(value) + 1);
                }
            }
        }
        int level = 0;
        List<Integer> key = new ArrayList<>(map.keySet());
        Collections.sort(key, Collections.reverseOrder());
        int min = key.get(key.size()-1);
        int max = key.get(0);
        // if(min >= 256) min = 256;
        int time = Integer.MAX_VALUE;
        for(int i = max ; i >= min; i--){
            int push = 0;
            int pop = 0;
            for(int j : key){
                if(i > j){
                    push += map.get(j) * (i - j);
                }
                else{
                    pop += map.get(j) * (j - i);
                }
            }
            if(push - pop <= b && pop * 2  + push < time && i >= 0 && i <= 256){
                time = pop * 2 + push;
                level = i;
            }
            // System.out.println(i);
        }
        System.out.println(String.format("%d %d", time, level));
    }
}
