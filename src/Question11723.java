import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Question11723{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < m; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = new String(st.nextToken());
            if(str.equals("add")) set.add(Integer.parseInt(st.nextToken()));
            else if(str.equals("remove")){
                int chk = Integer.parseInt(st.nextToken());
                if(set.contains(chk)){
                    set.remove(chk);
                }
            }
            else if(str.equals("check")){
                // System.out.println(1);
                if (set.contains(Integer.parseInt(st.nextToken()))) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            }
            else if(str.equals("toggle")){
                int chk = Integer.parseInt(st.nextToken());
                if(set.contains(chk)) set.remove(chk);
                else set.add(chk);
            }
            else if(str.equals("all")) set = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
            else set = new HashSet<>();
        }
        // sb.deleteCharAt(sb.length() -1);
        System.out.println(sb);
    }
}