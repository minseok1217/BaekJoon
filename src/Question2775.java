import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question2775 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < t; i++){
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            sb.append(compute(a, b)).append("\n");
        }
        System.out.println(sb);
    }
    public static int compute(int a, int b){
        int sum = 0;
        int[][] array = new int[a][b];
        for(int i = 0; i < a; i ++){
            for(int j =0; j < b; j ++){
                if( i == 0){
                    
                    array[i][j] = j + 1;
                    // System.out.println(array[][]);
                }
                else{
                    if(j == 0){
                        array[i][j] = 1;
                    }
                    else{
                        array[i][j] = array[i][j- 1] + array[i-1][j]; 
                    }
                }
            }
        }
        // for(int i = 0; i < a; i++){
        //     for(int j =0; j < b ; j ++){
        //         System.out.print(array[i][j]);
        //     }
        //     System.out.println();
        // }
        for(int i = 0; i < b ; i ++){
            // System.out.println(array[a - 1][i]);
            sum += array[a - 1][i];
        }
        return sum;
    }
}
