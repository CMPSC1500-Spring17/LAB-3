public class Practice3
{
    public static void main(String[] args)
    {
        System.out.println(modulo(14, 3));

    }

    private static int add(int x, int y)
    {
        int result = 0;
        for(int i = 0; i < x; i = i + 1)
            result = result + 1;

        for(int i = 1; i <= y; i= i + 1)
            result = result + 1;

        return result;
    }

    private static int subtract(int x, int y)
    {
        int result = add(x,0);

        for(int i = 0; i < y; i = i + 1)
            result = result - 1;

        return result;
    }

    private static int multiply(int x, int y)
    {
        int result = 0;

        for(int i = 0; i < x; i = i + 1)
        {
            result = result + y;
        }

        return result;
    }

    private static int divide(int x, int y)
    {
        int counter = 0;

        while (x > 0)
        {
            x = x - y;
            counter = counter + 1;
        }

        return counter;

    }

    private static int modulo(int x, int y)
    {
        int i = divide(x, y);
        int counter = 0;
        if(i != (x/y))
        {
            while(i != 0)
            {
                i = i - 1;
                counter = counter + 1;
            }
            return counter;
        }
        else
        {
            return 0;
        }
    }

}
