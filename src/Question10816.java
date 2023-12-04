import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Question10816 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] sang = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i < n; i++){
            int j = Integer.parseInt(st.nextToken());
            if(map.get(j) == null){
                map.put(j,1);
            }
            else{
                map.put(j, map.get(j) + 1);
            }
        }
        int m = Integer.parseInt(br.readLine());
        int[] jeong = new int[m];
        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i =0; i < m ; i++){
            jeong[i] = Integer.parseInt(stk.nextToken());
        }
        // Arrays.sort(sang);
        for(Integer i : jeong){
            if(map.get(i) == null){
                sb.append(0).append(" ");
            }
            else{
                sb.append(map.get(i)).append(" ");
            }
        }
        // sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}
