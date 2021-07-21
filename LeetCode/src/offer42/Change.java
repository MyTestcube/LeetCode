package offer42;

public class Change {
    public static int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        for (int j=1;j<=arr.length;j+=2){
            for (int k=0;k<arr.length-j+1;k++){
                for (int i=0;i<j;i++){
                    sum+=arr[k+i];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOddLengthSubarrays(new int[]{1,4,2,3}));
    }
}
