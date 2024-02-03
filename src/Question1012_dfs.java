import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Question1012_dfs {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++){
            int count = 0;
            List<int[]> list = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            boolean[][] map = new boolean[m][n];
            for(int j = 0; j < k; j++){
                StringTokenizer stk = new StringTokenizer(br.readLine());
                int h = Integer.parseInt(stk.nextToken());
                int w = Integer.parseInt(stk.nextToken());
                map[h][w] = true;
            }
            
            while(!list.isEmpty()){
                Stack<int[]> stack = new Stack<>();
                if(map[list.get(0)[0]][list.get(0)[1]]) {
                    stack.add(new int[]{list.get(0)[0], list.get(0)[1]});
                    count++;
                }
                list.remove(0);
                while (!stack.isEmpty()) {
                    int[] check = stack.pop();
                    if(map[check[0]][check[1]]){
                        if( check[0] + 1 < map.length){
                            if(map[check[0] + 1][check[1]]){
                                stack.add(new int[]{check[0] + 1, check[1]});
                            }
                        }
                        if( check[1] + 1 < map[0].length){
                            if(map[check[0]][check[1] + 1]){
                                stack.add(new int[]{check[0], check[1] + 1});
                            }
                        }
                        if( check[0] - 1 >= 0){
                            if(map[check[0] - 1][check[1]]){
                                stack.add(new int[]{check[0] - 1, check[1]});
                            }
                        }
                        if( check[1] - 1 >= 0){
                            if(map[check[0]][check[1] - 1]){
                                stack.add(new int[]{check[0], check[1] - 1});
                            }
                        }
                    }
                    map[check[0]][check[1]] = false;
                }
            }
            sb.append(count).append("\n");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}