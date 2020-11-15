public class Q1409 {
    public static int[] processQueries(int[] queries, int m) {
        int [] P=new int[m];
        int [] a=new int[m];
        for (int i = 0; i <m ; i++) {
            P[i]=i+1;

        }
        int count=0;
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j <P.length ; j++) {
                if (queries[i]==P[j]){
                    count=P[j];
                    P[j]=P[i];
                    P[i]=count;
                    a[i]=j;
                    System.out.println(a[i]);
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(processQueries(new int[]{1,2,3,4,5},5));
    }
}
