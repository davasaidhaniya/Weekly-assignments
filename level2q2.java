import java.util.*;
public class level2q2
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        float base,height, area=0.0f,areain=0.0f;
        System.out.println("Enter base and height");
        base=in.nextFloat();
        height=in.nextFloat();
        area=((1/2f)*base*height);
        areain=area/2.54f;
        System.out.println("The Area of the triangle in sq in is "+areain+" and sq cm is "+area);
    }
}