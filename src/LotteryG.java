public class LotteryG {

    //產生樂透號碼
    public int getRandom() {
        double random = Math.random();
//        System.out.println(random);
        random = Math.floor(random * 100); //0~100之間，floor是去掉小數點
        random++;
//        System.out.println(random);
//        System.out.println((int) random);
        int result = (int)random; //double轉型成int
        return result;
    }

    //1.產生多少個亂數 int num
    //2.ex:1~100,100是int endNum(終值)
    public int[] checkRandom(int num, int endNum) {
        int [] arr = new int [num]; //建立陣列
        for(int i=0; i<num; i++) { //產生幾個亂數的迴圈
            int result = getRandom(); //產生亂數，呼叫上面的方法
            arr[i] = result;  //把亂數放到陣列裡

            boolean isrepeat = false;
            for(int j=0; j<num; j++) {  //確認產生的亂數彼此間沒有重複
                if (arr[j] == result) {
                    isrepeat = true;
                    break;
                }
            }
            if(!isrepeat) {  //if (true)
                arr[i] = result;
            }
        }
        return arr;  //return陣列，依照我設定的型別。
    }

}
