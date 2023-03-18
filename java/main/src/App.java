public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("初めてのJava");
        System.out.println(17);
        System.out.println(5+3);
        System.out.println("5+3");
        System.out.println(12/3);
        System.out.println(3*6);
        System.out.println(8%3);
        System.out.println("こんにちは"+"世界");
        System.out.println("38"+"19");
        System.out.println(38+19);

        int number0;
        number0 = 3;
        System.out.println(number0);

        String name;
        name ="Wanko";
        System.out.println(name);

        int number1 = 3;
        System.out.println(number1);
        int number2 = 7;
        System.out.println(number2);
        System.out.println(number1*number2);

        String text0 = "プログラミングを勉強しよう";
        System.out.println("Progateで"+text0);

        //変数の更新
        int number = 11;
        String text = "Ruby";
        System.out.println(number);
        System.out.println(text);

        number = 9;
        System.out.println(number);
        text = "Java";
        System.out.println(text);

        //自己代入
        int number4 = 3;
        System.out.println(number4);
        number4 = number4+7;
        System.out.println(number4);

        //自己代入の省略した書き方
        int number5 =8;
        number5 *= 7;
        System.out.println(number5);
        number5 ++;
        System.out.println(number5);
        
        //変数の役割と注意点
        int length = 6;
        int height = 8;
        int rectangleArea = length * height;
        System.out.println(rectangleArea);
        int triangleArea = length * height / 2;
        System.out.println(triangleArea);

        //少数を扱おう
        double number6 =8.5;
        double number7 =3.4;
        System.out.println(number6+number7);
        System.out.println(number6-number7);

        //自動型変換
        int month = 12;
        int date = 31;
        System.out.println(month+"月"+date+"日");
        System.out.println(7/2);
        System.out.println(7.0/2.0);
        System.out.println(7/2.0);

        //強制型変換
        int number8 = 7;
        int number9 = 2;
        System.out.println(number8 / number9);
        System.out.println((double)number8/number9);

        //総合演習1
        String name1 = "パク";
        int age =12;
        double height1 =1.2;
        double weight1 =20.0;
        double bmi = weight1/height1/height1;
        System.out.println("名前は"+name1+"です");
        System.out.println("年齢は"+age+"歳です");
        System.out.println("身長は"+height1+"mです");
        System.out.println("体重は"+weight1+"kgです");
        System.out.println("BMIは"+bmi+"です");



        

    }
}
