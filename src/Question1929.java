import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question1929 {
    /*
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());
        int[] question = new int[max + 1];
        for(int i = min; i <= max; i++){
            if(question[i] == 0){
                for(int j = 2; j < i; j++){
                    if(i % j == 0){
                        question = check(question, min, max, j);
                    }
                }
            }
        }
        for(int i = min; i <= max ; i++){
            if(question[i] == 0){
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
    public static int[] check(int[] i, int min, int max, int s){
        int size = s;
        while(s < max){
            i[s] = 1;
            s = s + size;
        }
        return i;
    }
     */

    // public static void main(String[] args)throws IOException{
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     StringBuilder sb = new StringBuilder();
    //     StringTokenizer st = new StringTokenizer(br.readLine());
    //     int min = Integer.parseInt(st.nextToken());
    //     int max = Integer.parseInt(st.nextToken());
    //     for(int i = min ; i <= max ; i++){
    //         int chk = 0;
    //         for(int j = 2; j< i; j++){
    //             if(i % j == 0){
    //                 chk =1;
    //                 break;
    //             }
    //         }
    //         if(chk == 0){
    //             sb.append(i).append("\n");
    //         }
    //     }
    //     System.out.println(sb);
    // }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());
        int[] question = new int[max + 1];
        question[1] = 1;
        for(int i = 2; i <= max ;i++){
            if(question[i] == 0){
                question = check(question, max,  i);
            }
        }
        for(int i = min; i <= max; i++){
            if(question[i] == 0) sb.append(i).append("\n");
        }
        if(sb.length() != 0) sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }

    public static int[] check(int[] i, int max, int s){
        int size = s;
        s = s + size;
        while(s <= max){
            i[s] = 1;
            s = s + size;
        }
        return i;
    }
}
