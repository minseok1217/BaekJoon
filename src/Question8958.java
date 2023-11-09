import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question8958 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int t = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        int point = 1;
        int score = 0;
        //OX
        for(int i = 0; i < t ; i++){
            String str = br.readLine();
            char[] ch = str.toCharArray();
            for (int j = 0; j < ch.length; j++){
                if(ch[j] == 'O'){
                    score += point;
                    point++;
                }
                if(ch[j] == 'X'){
                    point = 1;
                }
                // System.out.println(score);
            }
            // System.out.println(score);
            sb.append(score).append("\n");
            score = 0;
            point = 1;
        }
        System.out.println(sb);
    }
}
