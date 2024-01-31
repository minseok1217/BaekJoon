import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Question1012 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < t; i++){
            int count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            boolean[][] map = new boolean[m][n];
            List<int[]> list = new ArrayList<>();
            for(int j = 0 ; j < k; j++){
                StringTokenizer stk = new StringTokenizer(br.readLine());
                int w = Integer.parseInt(stk.nextToken());
                int h = Integer.parseInt(stk.nextToken());
                map[w][h] = true;
                list.add(new int[]{w, h});
            }
            while (!list.isEmpty()) {
                int[] check = list.get(0);
                list.remove(0);
                if(map[check[0]][check[1]]){
                    count++;
                    find(map, check[0], check[1]);
                }
            }
            sb.append(count).append("\n");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
    public static void find(boolean[][] map, int m, int n){
        if(map[m][n]){
            map[m][n] = false;
            if( m + 1 < map.length) find(map, m + 1, n);
            if( n + 1 < map[0].length) find(map, m , n + 1);
            if( m - 1 >= 0) find(map, m - 1, n);
            if( n - 1 >= 0) find(map, m , n - 1);
            // map[m][n] = false;
        }
        // map[m][n] = false;
    }
}
