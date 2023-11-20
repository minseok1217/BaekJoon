import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Question10814 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        for (int i = 0; i<200; ++i){
            list.add(new ArrayList<String>());
        }
        for(int i =0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken()) - 1;
            String name = st.nextToken();
            list.get(age).add(name);
        }

        for(int i =0; i < 200; i++){
            if (list.get(i).size() != 0){
                for(String str : list.get(i)){
                    sb.append(String.format("%d %s\n", i+1, str));
                }
            }
        }
        System.out.println(sb);
    }
}
