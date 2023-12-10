import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Question11651{
    public static void main(String[] args)throws IOException{
        // class MapCompare implements Comparator<Map>{
        //     public int compare(Map m1, Map m2){
        //         if(m1.getX() > m2.getX()) return 1;

        //     }
        // }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // Map[] map = new Map[n];
        List<Map> map = new ArrayList<>();
        for(int i = 0 ; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            map.add(new Map(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));

        }
        Collections.sort(map);
        StringBuilder sb = new StringBuilder();
        for(Map i : map){
            sb.append(i.getXY()).append("\n");
        }
        System.out.println(sb);
    }
    static class Map implements Comparable<Map>{
        private int x;
        private int y;
        public Map(int x, int y){
            this.x = x;
            this.y = y;
        }
        public String getXY() {return Integer.toString(x) + " " + Integer.toString(y);}
        // public int getY() {return y;}

        @Override
        public int compareTo(Map other){
            if(this.y > other.y) return 1;
            else if(this.y == other.y){
                if(this.x > other.x) return 1;
                else if(this.x == other.x) return 0;
                else return -1;
            }
            else return -1;
        }

    }
}