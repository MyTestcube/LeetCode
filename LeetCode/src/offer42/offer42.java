package offer42;

public class offer42 {
    public static int maxSubArray(int[] nums) {
        int max=nums[0];
        for (int i = 1; i <nums.length ; i++) {
            int n=0;

            nums[i]+=Math.max(nums[i-1],0);
            max=Math.max(max,nums[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,-10,-3,-4,-16,-15,-5,-4}));
    }

}
//√

