import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question7568 {
    public static void main(String[] args)throws IOException{
        StringBuilder sb =  new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Rank[] rank = new Rank[n]; 
        for(int i = 0 ; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            rank[i] = new Rank(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        for(int i = 0 ; i < n ; i++){
            int chk = 1;
            for(int j = 0 ; j < n; j++){
                if(j != i){
                    if(rank[i].isBig(rank[j])) chk++;
                }
            }
            sb.append(chk).append(" ");
        }
        System.out.println(sb);
    }

    public static class Rank{
        private int h = 0;
        private int w = 0;
        // private int r = 0;
        public Rank(int h, int w){
            this.w = w;
            this.h = h;
        }
        public int getW() {return w;}
        public int getH() {return h;}
        // public int getR() {return r;}
        public void setH(int h) {this.h = h;}
        public void setW(int w) {this.w = w;}
        // public void setR(int r) {this.r = r;}
        public boolean isBig(Rank other){
            if(this.h < other.h && this.w < other.w) return true;
            else return false;
        }
    }
}
