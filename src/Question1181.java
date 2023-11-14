import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question1181 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int l[] = new int[t];
        String[] s = new String[50];
        
        // 2차원 배열 만들 때 필수 => 빈껍데기 만드는 과정
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        for(int i = 0; i<50; ++i){
            list.add(new ArrayList<String>());
        }

        // Set<String> set = new HashSet<>();
        //일단 크기에 맞게 저장
        for(int i =0; i < t; i++){
            String str = br.readLine();
            list.get(str.length()-1).add(str);
        }

        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        for(int i = 0; i<50; ++i){
            ans.add(new ArrayList<String>());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 50; i++){
            Set<String> set = new HashSet<>(list.get(i));
            // ans.get(i).add(set); //얘는 왜 안돼????
            for( String str : set){// 위에 안되서 이걸로 했음
                ans.get(i).add(str);
            }
        }
        
        
        // System.out.println("111111");
        

        // for(int i =0; i< 50; i++){
        //     for (String str : set.get(i)){
        //         System.out.println(str);
        //     }
        // }


        for(int i = 0; i<50; ++i){
            ans.get(i).sort(null);
            // System.out.println("1");
        }
        // System.out.println(list.get(2));
        for(int i = 0; i<50; ++i){
            for(String str : ans.get(i)){
                sb.append(str).append('\n');
            }
        }
        System.out.println(sb);

        

        // System.out.println(list.get(0).get(0));
        // for(int i = 0; i<50; ++i){
        //     ans.add(sort_method(list.get(i)));
        // }
        // StringBuilder sb = new StringBuilder();
        // for(int i = 0; i<50; ++i){
        //     for(String str : list.get(i)){
        //         sb.append(str).append('\n');
        //     }
        // }
        // System.out.println(sb);
    }
    // public static ArrayList<String> sort_method(ArrayList<String> list){

    //     return list;
    // }
}
