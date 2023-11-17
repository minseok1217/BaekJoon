import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question1436 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int chk = 1;
        int i = 666;
        String num = "666";
        while(true){
            String str = Integer.toString(i);
            if(str.contains(num)){
                if(chk == n){
                    break;
                }
                else{
                    chk++;
                }
            }
            i++;
        }
        System.out.println(i);
    }
}
