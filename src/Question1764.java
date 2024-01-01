import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Question1764{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            map.put(br.readLine(), 0);
        }
        for(int i = 0 ; i < m ; i++){
            String str = br.readLine();
            if(map.get(str) != null){
                cnt++;
                list.add(str);
            }
        }
        Collections.sort(list);
        if(cnt != 0){
            sb.append(cnt).append("\n");
            for(String str : list) sb.append(str).append("\n");
            sb.deleteCharAt(sb.length() - 1);
            System.out.println(sb);
        }
        else{
            System.out.print(cnt);
        }
    }
}