package Appearanceseries;

import java.io.Serializable;
import java.util.Scanner;

public class reClient {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        recursionSolution a=new recursionSolution();
        System.out.println(a.recursion(s));
    }
}
