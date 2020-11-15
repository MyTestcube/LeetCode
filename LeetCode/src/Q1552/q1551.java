package Q1552;

import java.lang.reflect.Array;
import java.util.Arrays;

import static Q1588.question1588.sumOddLengthSubarrays;

public class q1551 {
    public static int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int L=position.length,n=m-2,key=L/2,max=0,k=0,y=0;
        int low=position[0];
        int high=position[L-1];
        int mid=(low+high)/2;
        while(low<=high) {
            int i=1;
            if (position[mid]-position[0] == position[L-1]-position[mid]) {
                return mid;
            }
            if (position[mid/i]-position[0] > position[(L-1)/i]-position[mid/i]) {
                low = mid/i + 1;
            }
            if (position[mid/i]-position[0] < position[(L-1)/i]-position[mid/i]) {
                high = mid/i - 1;
            }
            i++;
        }
//        if (n == 2) {
//            max = position[L] - position[0];
//        }
//        for (int i = 1; i < n; i++) {
//            k = position[L / n] - position[key / n];
//            y=position[key / n] - position[0];
//            if (k == y) {
//                max = k;
//                m -= 1;
//            }else{
//
//            }
//        }

        return 0;
    }

    public static void main(String[] args) {
        maxDistance(new int[]{1,4,2,5,3,6},2);
    }

}
