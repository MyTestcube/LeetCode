package Mergetwoorderedlists;

import java.util.Scanner;

public class input {
    public void in(){
        System.out.println("请输入链表:(如:1,2,3,4)");
        Scanner scan = new Scanner(System.in);
        String sex=scan.next();
        char[] chars=sex.toCharArray();
        String a=",";
        char[] chars1=a.toCharArray();
        for(int i = 0; i<chars.length; i++){

            if(chars[i]==chars1[0]){
                continue;
            }
            char[] b = new char[0];
            int x=0;
            b[x]=chars[i];
            x++;
        }
//        int s = scan.nextInt();
        System.out.println();
    }
}
