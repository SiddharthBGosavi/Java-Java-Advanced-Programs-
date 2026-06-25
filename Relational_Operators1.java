public class Relational_Operators1{
    public static void main(String[] args){
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        boolean result = x>y && a<b;
        System.out.println(result);
        boolean result1 = x<y || a<b;
        System.out.println(result1);
        boolean result2 = x<y || a<b || a>1;
        System.out.println(result2);
        boolean result3 = a>b;
        System.out.println(result3);
    
    }
}