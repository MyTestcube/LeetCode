package Q1331;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class usemap {
    public static int[] arrayRankTransform(int[] arr) {
        int[] clone = arr.clone();
        Map<Integer,Integer> map = new HashMap<>();
        Arrays.sort(clone);
        int k =1;
        for (int i = 0; i < arr.length; i++) {
            if(!map.keySet().contains(clone[i])){
                map.put(clone[i],k);
                k++;
            }
        }
        for(int i=0;i<clone.length;i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr=arrayRankTransform(new int[]{2,-11,24,15,26,-31,-48,-49,22,37,-36});
        System.out.print("[");
        for (int i=0;i<arr.length;i++ ){
            System.out.print(arr[i]+",");
        }
        System.out.print("]");
    }
}
