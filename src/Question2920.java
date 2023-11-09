import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question2920 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // int chk = 0;
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        boolean asc = true;
        boolean dsc = true;
        for (int i = 0; i < 7; i++) {
            //다음 숫자가 더 크면 descending은 안 된다
            if (arr[i+1] > arr[i]) dsc = false;
            //다음 숫자가 더 작으면 ascending은 안 된다
            if (arr[i+1] < arr[i]) asc = false;
        }
        if (asc) {
            System.out.print("ascending");
        } else if (dsc) {
            System.out.print("descending");
        } else {
            //asc, dsc 둘 다 아니면 mixed 출력
            System.out.print("mixed");
        }
        // if(chk ==1){
        //     System.out.println("ascending");
        // }
        // else if (chk == 2 ){
        //     System.out.println("descending");
        // }
        // else{
        //     System.out.println("mixed");
        // }
    }
}
