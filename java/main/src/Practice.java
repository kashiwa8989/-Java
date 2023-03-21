public class  Practice {
    public static void main(String[] args) throws Exception {
        //真偽値・比較演算子１
        System.out.println(true);
        System.out.println(false);
        System.out.println(12 / 4 == 3);
        System.out.println(12 / 4 != 3);
        boolean bool = 3*9 == 27;
        System.out.println(bool);

        //比較演算子2
        System.out.println(4+2<6);
        System.out.println(4+2>=6);

        //論理演算子
        System.out.println(true || false);
        System.out.println(true && false);
        System.out.println(8<5 && 3>=2);
        System.out.println(8<5 || 3>=2);
        System.out.println(!(8<5));

        //if文
        if (true) {
            System.out.println("条件式がtrueのため、出力されます");
        }
        if (false) {
            System.out.println("条件式がfalseのため、出力されません");
        }
        int x =5;
        if (x > 2){
            System.out.println("xは2より大きい");
        }
        if (x > 8){
            System.out.println("xは8より大きい");
        }

        //else,else if文
        int number =12;
        if (number < 10){
            System.out.println("10より小さい");
        }else if (number <20){
            System.out.println("10以上、20より小さい");
        }else {
            System.out.println("20以上");
        }

        //switch文
        int n = 1;
        switch(n){
            case 1:
                System.out.println("大吉です");
                break;
            case 2 :
                System.out.println("吉です");
                break;
        }
        
        //switch文 default使う
        int n1 = 0;
    
        switch (n1) {
            case 1:
                System.out.println("大吉です");
                break;
            case 2:
                System.out.println("中吉です");
                break;
            default:
                System.out.println("凶です");
                break;
        }

        //               繰り返し文
        //while文
        int number1 =10;
        while (number1>0){
            System.out.println(number1);
            number1--;  
        }

        //for文
        for (int i = 1;i<=10;i++){
            System.out.println(i+"回目のループです");
        }

        //while文　continue break
        System.out.println("=== while文 ===");
        int i = 1;
        while (i < 10) {
        // iが5の倍数のとき、繰り返し処理を終了
        if (i % 5 ==0){
            break;
        }
        System.out.println(i);
        i++;
        }
        
        System.out.println("=== for文 ===");
        for (int j = 1; j < 10; j++) {
        // jが3の倍数のとき、処理をスキップ
        if (j % 3 == 0){
            continue;
        }
        System.out.println(j);
        }


        



        

    }    
}
