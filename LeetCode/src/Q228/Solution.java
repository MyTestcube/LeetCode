package Q228;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> summaryRanges(int[] nums) {
        ArrayList<String>g=new ArrayList<>();
        int count =0;
        for (int i=0;i<nums.length-1;i++){


            if (nums[i] != (nums[i+1]-1)) {
                int a=nums[i-count];
                int b=nums[i];
                String str;
                if (a==b){
                    str="“"+a+"”";
                    g.add(str);
//                    System.out.println(str);
                }else {
                    if (i+1==nums.length-1){
                        str="“"+nums[i+1]+"”";
                        g.add(str);
                    }
                    str="“"+a+"->"+b+"”";
                }
                count=0;
            }
            count++;
        }
        return g;
    }
}
