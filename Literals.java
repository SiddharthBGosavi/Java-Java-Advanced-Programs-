class Literals
{
    public static void main(String[] args)
     {
        int num1 = 0b101;
        System.out.println(num1); // using the binary number 

        int num2 = 0x7E;  // using the hexadecimal numbers  
        System.out.println(num2);

        int num3= 100_000_00;
        System.out.println(num3); // it will only print the actual value without the underscore but it helps to count the number of zeros in the assign value 

        double num4 = 56;
        System.out.println(num4); // we can assign the int value to the double , it will automatically create it into the double value 

        double num5 = 12e10;
        System.out.println(num5);

        char c = 'a';
        c++;
        System.out.println(c);



        
 
    }
}