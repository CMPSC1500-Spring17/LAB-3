public class math {

    public static void main(String[] args)
    {
        System.out.println( ((5+4)-12) + "  :  " + subtract(add(5,4),12) );
        System.out.println( divide(27,3) + "  :  " + multiply(5, 3) );
        System.out.println( modulo(27,10) + "  :  " + concat("cat","dog"));
        System.out.println( stringRepeat("cat",5));

    }

    private static int add(int x, int y)
    {
        int result = 0;
        for( int i=0; i < x; i = i + 1)
            result = result + 1;

        for( int i=1; i <= y; i= i + 1)
            result = result + 1;

        return result;
    }

    private static int subtract(int x, int y)
    {
        int result = add(x,0);

        for( int i=0; i < y; i = i + 1)
            result = result - 1;

        return result;
    }

    private static int multiply(int v, int w)
    {
        int result = 0;

        for(int i=0; i < w; i = i + 1)
            result = result + v;

        return result;
    }

    private static int divide(int v, int w)
    {
        int result = v;
        int numberDivide = 0;
        while (result > 0) {
            result = result - w;
            numberDivide = numberDivide + 1;
        }
        return numberDivide;
    }

    private static int modulo(int v, int w)
    {
        int result = v;
        while (result > w) {
            result = result - w;
        }
        return result;
    }

    private static String concat(String first, String last)
    {
        return first+last;
    }

    private static String stringRepeat(String string, int n)
    {
        String totalRepeat = "";

        for(int i=0; i < n; i = i + 1)
            totalRepeat = totalRepeat + string;

        return totalRepeat;

    }
}
