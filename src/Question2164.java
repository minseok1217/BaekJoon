import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Question2164 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int chk = 1;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n ; i++){
            list.add(i+1);
        }
        while(true){
            System.out.println(list);
            if(list.size() == 1){
                System.out.println(list.get(0));
                break;
            }
            else if(list.size() % 2 ==0){
                for(int j = 0; j < list.size() / 2 + 1; j++){
                    list.remove(j);
                }
            }
            else{
                for(int j = 0; j < (int)(list.size() / 2); j++){
                    list.remove(j);
                }
                list.add(0,list.get(list.size() - 1));
                list.remove(list.size() - 1);
            }
        }       
    }
}
