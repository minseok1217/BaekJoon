import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question2920 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int chk = 0;
        for ( int i = 0; i < 8; i++){
            int a = Integer.parseInt(st.nextToken());
            if(a == i + 1){
                chk = 1;
            }
            else if(a == 8 - i){
                chk = 2;
            }
            else{
                chk = 3;
                break;
            }
        }
        
        if(chk ==1){
            System.out.println("ascending");
        }
        else if (chk == 2 ){
            System.out.println("descending");
        }
        else{
            System.out.println("mixed");
        }
    }
}
