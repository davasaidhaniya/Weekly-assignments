import java.util.*;
public class level3q2
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        float fahrenheit,celsiusResult=0.0f;
        System.out.println("Enter the temperatiure in fahrenheit");
        fahrenheit=in.nextFloat();
        celsiusResult=(fahrenheit-32)*(5/9f);
        System.out.println("The "+fahrenheit+" fahrenheit is "+celsiusResult+" celsius");
    }
}