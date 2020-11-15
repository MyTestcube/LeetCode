package Q945;

public class Solution {
    public static int minIncrementForUnique(int[] A) {

        String[] g = new String[A.length];
        int count =0;
        for (int i=0;i<A.length;i++){
            int n=0;
            if (A[i] != (A[i+1]-1)) {
                int a=A[i-count];
                int b=A[i];
                String str;
                if (a==b){
                    str=""+a;
                    g[n]=str;
                    System.out.println(str);
                }else {
                    str=a+"->"+b;
                }
                n+=1;
                count=0;
            }
            count++;
        }
        return 0;
    }
}
