package Mengjia;

import java.util.Arrays;
import java.util.Stack;

public class Q3 {
    public int minimumJump(int[] arr){
        if(arr == null || arr.length == 0){
            return 0;
        }

        if(arr.length == 1){
            return 1;
        }

        int[] minJumpToReach = new int[arr.length];
        Arrays.fill(minJumpToReach, Integer.MAX_VALUE);
        minJumpToReach[0] = 0;

        for(int i = 0; i < arr.length; i++){
            int minJump = arr[i];
            if(minJumpToReach[i] == Integer.MAX_VALUE){
                return -1;
            }
            for(int j = i + 1; j < Math.min(arr.length, i + minJump + 1); j++){
                if(minJumpToReach[j] > minJumpToReach[i] + 1){
                    minJumpToReach[j] = minJumpToReach[i] + 1;
                }
            }
        }

        return minJumpToReach[minJumpToReach.length - 1] == Integer.MAX_VALUE? -1: minJumpToReach[minJumpToReach.length - 1];
    }
}
