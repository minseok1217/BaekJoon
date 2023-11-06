import java.io.*;
import java.util.StringTokenizer;

public class Question10818 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String s_1 = br.readLine();
        // String s_2 = br.readLine();
        // int n_1 = Integer.parseInt(s_1);
        // String[] array = s_2.split(" ");
        // int[] n_2 = new int[n_1];
        // for(int i =0 ; i < n_1 ; i++){
        //     n_2[i] = Integer.parseInt(array[i]);
        // }
        // int max = n_2[0];
        // int min = n_2[0];
        // for(int i = 0 ; i < n_1 ; i++){
        //     if(n_2[i] > max){
        //         max = n_2[i];
        //     }
        //     else if(n_2[i] < min){
        //         min = n_2[i];
        //     }

        // }
        // System.out.printf("%d %d",min, max);
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(st.hasMoreTokens()){
            int n = Integer.parseInt(st.nextToken());
            if(n > max)
                max = n;
            if(n < min)
                min = n;
        }
        // System.out.println(min);
        System.out.println(String.format("%d %d", min, max));
    }
}
