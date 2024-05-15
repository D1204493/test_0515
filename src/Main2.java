import java.util.*;

public class Main2 {
    public static void main(String [] args){

        LotteryG lotteryG = new LotteryG();
        int bomb = lotteryG.getRandom();
        int min = 1;
        int max = 100;

        System.out.println("請輸入：");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(bomb == input) {
            System.out.println("答對了！");
        }
        else if(bomb > input) {
            min = input;
            System.out.println("在" + max + "與" + min + "之間：");
        }
        else {
            max = input;
            System.out.println("在" + max + "與" + min + "之間：");
        }



    }
}
