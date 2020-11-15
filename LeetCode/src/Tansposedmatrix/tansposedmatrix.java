package Tansposedmatrix;

import java.util.Scanner;

public class tansposedmatrix {

//    public static String input() {
//        Scanner s = new Scanner(System.in);
//        String a = s.next();
////        int b = Integer.parseInt(a);
//        return a;
//    }
//
//    public static void analysis(String a){
//        if (a.equals("[")){
//            if (a.equals("[")){
//                ;
//            }
//        }
//
//    }


    public  static int[][] transpose(int[][] A) {
        int rowLength = A.length;
        int colLength = A[0].length;
//        new int[al][al]
        int [][] B = new int[colLength][rowLength];

        for (int j=0;j<rowLength;j++){
            for (int i=0;i<colLength;i++){
                B[i][j]=A[j][i];
            }
        }
        return B;
    }

    public static void main(String[] args) {
        int [][] A={{1,2,3},{4,5,6}};
        int [][] B=transpose(A);
        int rowLength = B.length;
        int colLength = B[0].length;
        System.out.print("[");
        for (int j=0;j<rowLength;j++){
            System.out.print("[");
            for (int i=0;i<colLength;i++){
                System.out.print(B[j][i]+",");
            }
            if (j==rowLength-1)
                System.out.print("]");
            else
                System.out.print("],");
        }
        System.out.println("]");
//        System.out.println(B);
    }
}
