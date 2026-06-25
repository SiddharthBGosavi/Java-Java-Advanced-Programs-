public class Arithmetic_operators {
    public static void main(String args[]){

        
        int number1 = 4;
        int number2 = 5;
        int Output = number1+number2;
        System.out.println(Output);

        int Output1 = number1-number2;
        System.out.println(Output1);

        int Output2 = number1*number2;
        System.out.println(Output2);

        int Output3 = number2/number1;
        System.out.println(Output3);
        
        
        int num1 = 7;
        int result = num1++;
        System.out.println(result); // only fetch the initial value i.e., result = num1 = num1+1; it will only fetch the value of result = num1;
        // first it will increment then it will assign 

        int num2 = 8;
        int Result = ++num2; //int Result = num2 = num2 + 1;
        System.out.println(Result);  // first it will assign then it will increment 
    }
}
