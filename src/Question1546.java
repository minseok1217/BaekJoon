import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question1546 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        double[] array = new double[t];
        double max = 0.0;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i =0; i < t; i++){
            array[i] = Integer.parseInt(st.nextToken());
            if (max < array[i]) max = array[i];
        }
        double answer = 0.0;
        for(int i = 0; i < t; i++){
            answer += array[i]/max * 100;
        }
        System.out.println(answer / t);
    }
}
