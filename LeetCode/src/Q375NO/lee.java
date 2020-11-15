package Q375NO;

public class lee {

    public static int getMoneyAmount(int n) {
        int get=new java.util.Random().nextInt(n);
        int pay=0;
        pay=count(n,get,pay);
        return  pay;
    }
    public static int count(int n,int get,int pay){
        int guess=new java.util.Random().nextInt(n);
        if (get==guess){
            System.out.println("猜对了，游戏结束。"+get+" 就是我选的数字。总共支付"+pay+"块");
        }else if (guess>get){
            System.out.println("你猜是"+guess+"，我的数字更小一些，你支付"+guess+"块。");
            pay+=guess;
            count(n,get,pay);
        }else {
            System.out.println("你猜是"+guess+"，我的数字更大一些，你支付"+guess+"块。");
            pay+=guess;
            count(n,get,pay);
        }

        return pay;
    }

    public static void main(String[] args) {
        getMoneyAmount(10);
    }
}
