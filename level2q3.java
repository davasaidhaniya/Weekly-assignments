import java.util.*;
public class level2q3
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int perimeter,side=0;
        System.out.println("Enter the perimeter of a square");
        perimeter=in.nextInt();
        side=perimeter/4;
        System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);
    }
}