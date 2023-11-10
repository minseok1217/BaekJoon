import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question1018 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Map 크기 받아오기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[][] map = new int[n][m];

        // MAP받아오기
        for(int i = 0; i < n; i++){
            String S = br.readLine();
            char[] ch = S.toCharArray();

            for(int j = 0; j < m; j++){
                if((i + j) % 2 == 0){
                    if(ch[j] == 'W'){
                        map[i][j] = 0;
                    }
                    else{
                        map[i][j] = 1;
                    }
                }
                else{
                    if(ch[j] == 'B'){
                        map[i][j] = 0;
                    }
                    else{
                        map[i][j] = 1;
                    }
                }
            }
        }
        // for(int i = 0; i< n ; i++){
        //     for(int j =0; j< m; j++){
        //         System.out.printf("%d", map[i][j]);
        //     }
        //     System.out.println();
        // }

        int min = 8 * 8;
        int count = 0;

        for(int i = 0; i< n - 7; i++){
            for(int j = 0; j < m - 7; j++){
                for(int a = i; a < i + 8; a++){
                    for(int b = j; b < j + 8; b++){
                        count += map[a][b];
                    }
                }
                if( count > 64 - count){
                    count = 64 - count;
                }
                if(count < min){
                    min = count;
                }
                count = 0;
            }
        }
        System.out.println(min);
    }
}
 