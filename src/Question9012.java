import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question9012 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            String vp = br.readLine();
            char[] ch = vp.toCharArray();
            int count = 0;
            int second = 0;
            int chk = 0;
            for(char j : ch){
                if(j == '('){
                    count++;
                }
                else second++;

                if( count < second){
                    sb.append("NO").append("\n");
                    chk = 1;
                    break;
                }
            }
            if(chk == 0){
                if((ch.length) == (count * 2)) sb.append("YES").append("\n");
                else sb.append("NO").append("\n");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);

    }
}
