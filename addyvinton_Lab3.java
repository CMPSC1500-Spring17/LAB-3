public class LabThree {


        public static void main(String[] args)
        {
            System.out.println( 5+4 + "  :  " + add(5,4));
            System.out.println( ((5+4)-12) + "  :  " + subtract(add(5,4),12) );
            System.out.println( 5*4 + "  :  " + multiply(5,4));
            System.out.println( 20/4 + "  :  " + divide(20,4));
            System.out.println( 5 % 4 + "  :  " + modulo(5,4));
            System.out.println( "blue" + "shoes" + "  :  " + concatenate("blue","shoes"));
            System.out.println("blue" + "  :  " + repeating("blue", 5));

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
            int result = 0;

            for ( int i = 0; i < x; i = i + 1)
                result = result + y;

            return result;
        }
        private static int divide(int x, int y)
        {
            int result = 0;

            for ( int i = x; i >= y; i = i -y)

                result = result + 1;

            return result;
        }
        private static int modulo(int x, int y)
        {

            int result = x;

            result = result - multiply(divide(x, y), y);

            return result;

        }

        private static String concatenate(String x, String y)
        {
            String result = x;

            result = x + y;

            return result;

        }
        private static String repeating(String x, int y)
        {
            String result = x;

            for (int i = 1; i<y; i = i + 1)

                result = x + " " + result;

            return result;
        }





}
