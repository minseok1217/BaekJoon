import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question2579 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // int[] score = new int[n];
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        
        // for(int i = 0;i < n; i++){
        //     int value = list.get(i);
        //     int cnt = 0;
        //     for(int  j : list){
        //         if(value >= j) cnt++;
        //     }
        //     rank.add(cnt);
        // }
        ArrayList<Integer> rank = new ArrayList<>();
        ArrayList<Integer> copy = new ArrayList<>(list);
        for(int i = 0 ; i < n ; i++){
            int index = max(copy);
            copy.set(index, 0);
            ArrayList<Integer> ex = new ArrayList<>(rank);
            rank.add(index);
            Collections.sort(rank);
            if(!check(rank)) {
                rank = ex;
            }
        }
        int sum = 0;
        for(int i : rank) sum += list.get(i);

        ArrayList<Integer> rank_ = new ArrayList<>();
        ArrayList<Integer> copy_ = new ArrayList<>(list);
        for(int i = 0 ; i < n ; i++){
            int index = max_(copy_);
            copy_.set(index, 0);
            ArrayList<Integer> ex = new ArrayList<>(rank_);
            rank_.add(index);
            Collections.sort(rank_);
            if(!check(rank_)) {
                rank_ = ex;
            }
        }
        int sum_ = 0;
        for(int i : rank_) sum_ += list.get(i);
        if(sum > sum_) System.out.println(sum);
        else{System.out.println(sum_);}
    }
    public static int max(List<Integer> list){
        int max = list.get(0);
        int index = 0;
        for(int i = 1; i < list.size(); i++){
            if(max < list.get(i)){
                max = list.get(i);
                index = i;
            }
        }
        return index;
    }
    public static int max_(List<Integer> list){
        int max = list.get(0);
        int index = 0;
        for(int i = 1; i < list.size(); i++){
            if(max <= list.get(i)){
                max = list.get(i);
                index = i;
            }
        }
        return index;
    }
    public static boolean check(List<Integer> list){
        if(list.size() > 2){
            for(int i = 0 ; i < list.size() - 2; i++){
            if(list.get(i) + 1 == list.get(i+1) && list.get(i + 1) + 1 == list.get(i + 2)){  
                return false;
                }
            }
        }
        return true;
    }
}
