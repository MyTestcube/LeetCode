package Appearanceseries;

public class recursionSolution {
    public String recursion(int n) {
        StringBuilder answer;
        answer = new StringBuilder();
        if (n == 1) {
            return "1";
        }
        else {
                int count=1;
                int i=0;
                String str=recursion(n-1);
                char[] a=str.toCharArray();
                for(;i<str.length();i++){
                    if (i+1!=str.length()&& a[i]==a[i+1]){
                            count+=1;
                    }
                    else {
                        twice(i,count,a,answer);
                        count=1;
                    }
//                    if (i+1==str.length()){
//                        twice(i,count,a,answer);
//                        answer.append(count);
//                        answer.append(a[i]);
//                        count=1;
//                        break;
//                    }
//                        if(a[i]==a[i+1])
//
//                    else {
//                        twice(i,count,a,answer);
//                        answer.append(count);
//                        answer.append(a[i]);
//                        count=1;
                }

                //answer.append(count);
                //answer.append(a[i-1]);111221
        }
        return String.valueOf(answer);
    }
    public StringBuilder twice(int i,int count,char a[],StringBuilder answer){
        answer.append(count);
        answer.append(a[i]);
        return answer;
    }

}
