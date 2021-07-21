package Q1423;

public class test {
    public static int maxScore(int[] cardPoints,int k) {
        int sum=0;
        int t1=cardPoints[0];
        int t2=cardPoints[cardPoints.length-1];
        if (k==cardPoints.length){
            for (int i = 0; i <cardPoints.length ; i++) {
                sum+=cardPoints[i];
            }
            return sum;
        }
        int num = 0;
        int n1 = 1;
        int n2 = 2;
        while (num<k) {


            int change1 = cardPoints[n1];
            int change2 = cardPoints[cardPoints.length - n2];
            sum += Math.max(t1, t2);
            if (t1==t2){
                n1++;
                n2++;
                change1 = cardPoints[n1];
                change2 = cardPoints[cardPoints.length - n2];
                if(change1>change2){
                    t1=change1;
                }else
                    t2=change2;

            }else {
                if (t1 == Math.max(t1, t2)) {
                    t1 = change1;
                    n1++;
                } else {
                    t2 = change2;
                    n2++;
                }
            }
            num++;

        }

        return sum;
    }
    public static void main(String[] args) {
        int[] a=new int[]{1,2,3,4,5,6,1};
        System.out.println(maxScore(a,3));
    }
}
