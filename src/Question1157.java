import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.SocketTimeoutException;
// import java.net.SocketPermission;
import java.util.Arrays;
import java.util.HashSet;

public class Question1157 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] s_array = s.split("");
        int[] array = new int[26];
        // System.out.println(array[0]);
        for(int i = 0 ; i < s.length() ; i++){
            int n = s_array[i].charAt(0);
            if (n < 91){
                array[n - 65]++;
            }
            else{
                array[n - 97]++;
            }

        }
        int max = 0;
        int check = 0;
        char ch = '?';
        for(int i = 0; i<26;i++){
            if(array[i] > max){
                max = array[i];
                check = 0;
                ch = (char)(i+65);
            }
            else if(array[i] == max){
                check = 1;
            }
        }
        // System.out.println(max);
        // System.out.println(check);
        // System.out.println(ch);
        if(check == 1){
            System.out.println("?");
        }
        else{
            // char ch = (char)max;
            System.out.println(ch);
        }
    }
}
