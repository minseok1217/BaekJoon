import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Question2606 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        boolean[] node = new boolean[n];
        
        for(int i = 0; i < n ; i++){
            graph.add(new ArrayList<>());
        }

        for(int i =  0 ; i < m; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken()) - 1;
            int n2 = Integer.parseInt(st.nextToken()) - 1;
            graph.get(n1).add(n2);
            graph.get(n2).add(n1);
        }

        queue.add(0);
        while(!queue.isEmpty()){
            int num = queue.poll();
            if(num != 0) list.add(num);
            for(int i: graph.get(num)){
                if(!node[i]) {
                    queue.add(i);
                    node[i] = true;
                }
            }
            // System.out.println(queue);
            // System.out.println(list);
        }
        // System.out.println(list);
        System.out.println(list.size());
    }
}
