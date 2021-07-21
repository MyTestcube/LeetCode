package Q746;

public class q746 {
    public int minCostClimbingStairs(int[] cost) {
        int i=0;
        int sum=0;
        if (cost.length==2){
            sum+=Math.min(cost[0],cost[1]);
            return sum;
        }
        if (cost.length==3){
            sum+=Math.min(cost[0]+cost[2],cost[1]);
            return sum;
        }
        while (i<cost.length) {


            if (cost[i + 1] == cost[i + 2]) {
                if (cost[i] == cost[i + 3]) {
                    sum += cost[i + 1] + cost[i + 3];
                    i = i + 3;
                } else {
                    sum += Math.min(cost[i], cost[i + 3]) + cost[i + 2];
                }
            } else {
                sum += Math.min(cost[i], cost[i + 1]);
            }
        }
        return 0;
    }
}
