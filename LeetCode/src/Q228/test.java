package Q228;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<String> g=new ArrayList<>();
        for (int i=0;i<10;++i){
            System.out.println(i);
            i+=1;
//            g.add(i+"->"+i);
            System.out.println(i);
        }
        System.out.println(g);
    }
}
