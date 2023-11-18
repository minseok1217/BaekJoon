import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question1259 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        while(true){
            String str = br.readLine(); 
            
            int a = Integer.parseInt(str);
            if(a == 0){
                break;
            }
            int chk = 0;
            char[] ch = str.toCharArray();
            int l = ch.length - 1;
            for(int i = 0; i< (int)(ch.length / 2) ; i++){
                
                if(ch[i] != ch[l]) chk =1;
                // System.out.println(String.format("%c %c %d", ch[i], ch[l], l));
                l -= 1;
            }
            // System.out.println(chk);
            if (chk == 0) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}
// 121
// 1231
// 12421
// 0