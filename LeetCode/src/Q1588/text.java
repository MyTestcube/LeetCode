package Q1588;

import static java.lang.StrictMath.min;
import static sun.swing.MenuItemLayoutHelper.max;

public class text {
    public static int sumOddLengthSubarrays(int[] arr) {


        int result = 0;

        //按长度分组,2*i为 (长度-1)
        for(int i = 0;i*2 < arr.length;i++){
            //遍历每组内的所有子数组,2*j为 每个子数组的首项下标
            for(int j = 0;j <= (arr.length - 2*i - 1);j++){
                //对每个子数组求和,t为每个数组的下标,
                for(int t = j;t <= (j + 2*i);t++){
                    result += arr[t];
                }
            }
        }
        return result;

    }


    public static void main(String[] args) {
        System.out.println(sumOddLengthSubarrays(new int[]{1,4,2,5,3,6,7,8,9}));
    }
}
