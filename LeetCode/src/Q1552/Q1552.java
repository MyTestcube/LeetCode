package Q1552;

import java.util.Arrays;

public class Q1552 {
    public static int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int L=position.length;
        int max;
        if (m==2){
            max=position[L-1]-position[0];
        }else {
            if (L % 2 == 0) {
                for (int i = 1; i < m - 2; i++) {
                    if (position[(L - 1) / (i*2)] - position[0] == position[(L - 1)] - position[(L - 1) / (i*2)]){
                        max=position[(L - 1) / (i*2)]-position[0];
                    }
                }
            }else {

            }
        }
        return 0;
    }
    public static void main(String[] args) {
        maxDistance(new int[]{1,4,2,5,3,6},2);
    }
}
