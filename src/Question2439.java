import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question2439 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);

        for(int i = 0; i<n; i++){
            for(int j = 0; j < n; j++){
                if(i+j >= n - 1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

