import java.util.*;
public class level3q1
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        float celcius,fahrenheitResult=0.0f;
        System.out.println("Enter the temperature in celcius");
        celcius=in.nextFloat();
        fahrenheitResult=(celcius*(9/5))+32;
        System.out.println("The "+celcius+" celcius is "+fahrenheitResult+" fahrenheit");
    }
}