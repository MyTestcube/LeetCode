package Q1588;

import static java.lang.StrictMath.min;
import static sun.swing.MenuItemLayoutHelper.max;

public class question1588 {
    public static int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        int l=arr.length;
        for (int j = 0; j < l; j++) {
            sum += arr[j] * 2;
        }
        System.out.println(sum);
        if (arr.length%2!=0) {
            if (l == 5) {
                sum += arr[0] + arr[4] + (arr[1] + arr[3]) * 2 + arr[2] * 3;
            }else {
            for (int x = 3; x < l; x += 2) {
                int num = l - x + 1;
                int big=max(num,x);
                int little=min(num,x);
                int k = 0;
                int j = l - 1;
                for (int i = 1; i < little; i++) {
                    sum = sum + (arr[k] + arr[j]) * i;
                    k++;
                    j--;
                }
                for (int w = 0; w<=(big-little); w++){
                    int m=little;
                    sum+=arr[m-1]*little;
                    m++;
                }
            }
            }

        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        sumOddLengthSubarrays(new int[]{1,4,2,5,3,6,7});
    }
}
