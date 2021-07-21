package Q1423;


public class q1423 {
    public static int maxScore(int[] cardPoints,int k) {
        int sum=0;
        if (k==cardPoints.length){
            for (int i = 0; i <cardPoints.length-1 ; i++) {
                sum+=cardPoints[i];
            }
        }
        for (int i = 0; i <k; ) {
            int a=0;
            int b=0;
            for (int j = 0; j <cardPoints.length/2 ; j++) {
                int c=cardPoints[cardPoints.length-b];
                int d=cardPoints[a];

                if (c==Math.max(c,d)){
                    b++;
                }else {
                    a++;
                }
                sum+=Math.max(c,d);
            }
        }
        int[] test2=cardPoints;
        if (test2[0]<test2[test2.length-1]) {
            int[] test1 = new int[test2.length - 1];
            for (int i = 0; i < test1.length; i++) {
                test1[i] = test2[i];
            }
        }


        return 0;
    }
    public static void main(String[] args) {
        int[] a=new int[]{1,4,2,3};
        System.out.println(maxScore(a,1));
    }
}
