import java.util.*;
public class level1q4
{
    public static void main(String args[])
    {
        float cp=129,sp=191,profit=0.0f,ppercentage=0.0f;
        profit=sp-cp;
        ppercentage=(float)(profit/cp)*100;
        System.out.println("The Cost Price is INR "+cp+" and Selling Price is INR "+sp);
        System.out.println("The Profit is INR "+profit+" and the Profit Percentage is INR"+ppercentage); 
    }
}