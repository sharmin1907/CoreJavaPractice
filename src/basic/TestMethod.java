package basic;

public class TestMethod {
    public static void main(String[] args) {
        firstMath();
        secondMath(165,132);
    }
    public static void firstMath(){
        int a = 12;
        int b = 16;
        int c = a+b;
        System.out.println(c);
    }
    public static void secondMath(int a,int b){
        int c = a+b;
        System.out.println(c);
    }
}
