import java.util.*;
class even implements Runnable
{
    public int x;
    public even(int x)
    {
        this.x = x;
    }
    public void run()
    {
        System.out.println("New Thread "+ x +" is EVEN and Square of "+ x + " is: " + x * x);
    }
}

class odd implements Runnable
{
    public int x;
    public odd(int x)
    {
        this.x = x;
    }
    public void run()
    {
        System.out.println("New Thread "+ x +" is ODD and Cube of "+ x + " is: " + x * x * x);
    }
}

class A extends Thread
{
    public void run()
    {
        int num = 0;
        Random r = new Random();
        try
        {
            for (int i = 0; i < 5; i++)
            {
                num = r.nextInt(100);
                System.out.println("Main Thread and Generated Number is " + num);
                if (num % 2 == 0)
                {
                    Thread t1 = new Thread(new even(num));
                    t1.start();
                }
                else
                {
                    Thread t2 = new Thread(new odd(num));
                    t2.start();
                }
                Thread.sleep(1000);
                System.out.println("................................");
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}

public class ThreadProgram
{
    public static void main(String[] args)
    {
        A a = new A();
        a.start();
    }
}
/*Autoboxing:
Integer value: 100
Float value: 25.5
Character value: A
Boolean value: true

Unboxing:
int value: 100
float value: 25.5
char value: A
boolean value: true

Parsing Strings and Autoboxing:
Integer: 500
Float: 45.5
Character: Z
Boolean: true*/
