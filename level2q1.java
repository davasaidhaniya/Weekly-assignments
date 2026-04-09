import java.util.*;
public class level2q1
{
    public static void main(String args[])
    {
        float number1,number2,add=0.0f,sub=0.0f,mul=0.0f,div=0.0f;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        number1=in.nextFloat();
        number2=in.nextFloat();
        add=number1+number2;
        sub=number1-number2;
        mul=number1*number2;
        div=number1/number2;
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "+number1+" and "+number2+" is "+add+", "+sub+", "+mul+", and "+div); 
    }
}