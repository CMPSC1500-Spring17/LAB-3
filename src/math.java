public class math {

    public static void main(String[] args)
    {
        System.out.println( "1111" + "  :  " + repeatstring("1",4) );
        System.out.println( (5*4) + "  :  " + multiply(5,4));
        System.out.println( ((8/4)-0) + "  :  " + divide(8,4) );
        System.out.println( ("1111") + "  :  " + concatenate("1","111") );
        System.out.println( ((5%4)-0) + "  :  " + modulo(5,4) );


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
    private static int multiply(int x, int y)
    {
        int result = x;

        for (int i = 0; i<y; i++)
        {
            result = result+result ;
            return result;
        }

        return result;

    }
    private static int divide(int x, int y)
    {
        int result = x;
        int count = 0;
        //int temp =0;
        for (int i =0; result>0; i++){
            result = result-y ;
            count++;
        }
        return count;

    }
    private static int modulo(int x, int y)
    {
        int result =x;
        int count =0;
        for(int i=0; result>=y;i++){
            result = result-y;
            count =result;
        }
        return count;

    }
     private static String concatenate(String x, String y)
    {
        String one=x;
        String two=y;
        String three= one+two;
        return three;

    }


    private static String repeatstring(String x, int y)
    {
        String repeat=x;
        //String nEw="";

        for(int i=0; i<y-1;i++){
            repeat=repeat+1;

           //return nEw;

        }
        return repeat;

    }



}
