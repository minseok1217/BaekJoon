import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Question11650 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        List<sort_map> list = new ArrayList<>();
        for(int i =0; i < n ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new sort_map(x, y));            
        }
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++){
            sb.append(list.get(i).get());
        }
        System.out.println(sb);
    }

    public static class sort_map implements Comparable<sort_map>{
        private int x;
        private int y;

        public sort_map(int x_, int y_){
            this.x = x_;
            this.y = y_;
        }

        public String get(){return String.format("%d %d\n", x,y);}


        public int compareTo(sort_map other){
            if(this.x > other.x) return 1;
            else if(this.x < other.x) return -1;
            else{
                if(this.y > other.y) return 1;
                else if(this.y < other.y) return -1;
                else return 0;
            }
        }
    }
}
