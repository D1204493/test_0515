//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LotteryG lottry = new LotteryG();
        int [] ans = lottry.checkRandom(5,100);

        for(int a: ans) {  //叫出陣列資料
            System.out.println(a);
        }

    }
}