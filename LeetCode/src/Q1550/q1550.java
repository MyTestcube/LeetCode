package Q1550;

public class q1550 {
    public static boolean threeConsecutiveOdds(int[] arr) {
        long count=0;
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                count+=1;
                if(count>=3)
                    flag=true;
                else
                    flag=false;
            }
            else{
                count=0;
            }
        }
        return flag;
    }
}
