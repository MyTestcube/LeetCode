package Q1331;

import java.util.Arrays;
import java.util.Objects;

public class Solution1331 {
    public static int[] arrayRankTransform(int[] arr) {
        int[] a = new int[arr.length];
        int[] b=arr;
        int n=0;
        for (int i=0;i<arr.length;i++){
            a[i]=arr[i];
        }
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(b[i]);
        }
        System.out.println("-----");
        for (int x=0;x<a.length;x++){
            n=0;
            System.out.println(a[x]);
            for (int y=0;y<b.length;y++){
                if ((y<b.length-1)&&(b[y]==b[y+1])){
                    continue;
                }else{
                    n++;
                }
                if (Objects.equals(a[x], b[y])){
                    a[x]=n;
                    break;
                }
            }
        }
        return a;
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
