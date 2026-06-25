public class Type_conversion_casting
 {
    public static void main(String args[]){

        byte b = 127;
        int a = 12;
        b = (byte)a;
        System.out.println(b);   // Explicit type casting

        byte c = 127;
        int d = 12;
        a = b;
        System.out.println(a);  // implicit type casting or conversion 

        float f = 5.6f;
        int x = (int)f;
        System.out.println(x);   // explicit for the float value ; will reduce the point value 

        byte e = 127;
        int g = 257;
        e = (byte)g;
        System.out.println(e);   // it will use modulus(%) operator and will divide the 257 by the value of 256(which is from -127 to 127)and will give the reminder of 1 



    }
    
}
