import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Question1620{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        ArrayList<String> list = new ArrayList<>();
        // for(int i = 0 ; i <n;i++){
        //     list.add(br.readLine());
        // }
        // for(int i = 0; i < m ; i++){
        //     String question = br.readLine();
        //     try{
        //         int index = Integer.parseInt(question);
        //         sb.append(list.get(index - 1)).append("\n");
        //     }
        //     catch(NumberFormatException ex){
        //         for(int j = 0; j < n; j++){
        //             if(list.get(j).equals(question)){
        //                 sb.append(j+1).append("\n");
        //                 break;
        //             }
        //         }
        //     }
        // }
        // sb.deleteCharAt(sb.length() - 1);
        // System.out.println(sb);
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 1 ; i<=n;i++){
            String str = br.readLine();
            map.put(str, i);
            list.add(str);
        }
        for(int i = 0; i < m; i++){
            String question = br.readLine();
            try{
                int index = Integer.parseInt(question);
                sb.append(list.get(index - 1)).append("\n");
            }
            catch(NumberFormatException ex){
                // int index = 0;
                // for(int c = 16; c >= 0; c--){
                //     int chk = (int)Math.pow(2, c);
                //     if(chk + index <= n-1){
                //         // System.out.println(chk + index);
                //         if((key.get(chk + index)).compareTo(question) == 0){
                //             index = index + chk;
                //             break;
                //         }
                //         else if((key.get(chk + index)).compareTo(question) < 0){
                //             index = index + chk;
                //         }
                //     }
                // }
                // sb.append(map.get(key.get(index))).append("\n");
                sb.append(map.get(question)).append("\n");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}