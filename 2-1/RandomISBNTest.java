import java.text.DecimalFormat;
import java.util.Random;

public class RandomISBNTest
{
    public static void main(String[] args)
    {
        int num1;
        
        Random gen = new Random();
        num1 = gen.nextInt(10);
        
        DecimalFormat fmt = DecimalFormat(00);
        System.out.println(num1);
        

    }

}
