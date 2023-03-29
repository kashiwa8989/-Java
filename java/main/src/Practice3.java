public class Practice3 {
    public static void main(String[] args) throws Exception {
    //メソッド1
        hello();
        printData("Kate Jones",27);
        printData("John Christopher Smith",65);
    }
    public static void hello(){
        System.out.println("Hello Java");
    }
    public static void printData(String name,int age){
        System.out.println("私の名前は"+name+"です");
        System.out.println("年齢は"+age+"歳です");
    }


}        