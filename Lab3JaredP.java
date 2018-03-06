public class Lab3JP {


    public static void main(String[] args)

    {
        System.out.println((5*6) + " : " + multiplication(5,6));
        System.out.println(((5 + 4) - 12) + "  :  " + subtract(add(5, 4), 12));
        System.out.println((80/10) + " : " + divide(80,10));
        System.out.println(modulo(20,8));
        System.out.println("dog + house =" + " : " + concatination("dog","house"));
        System.out.println(repeat("shark", 3));
    }

    private static int add(int x, int y)

    {

        int result = 0;

        for (int i = 0; i < x; i = i + 1)

            result = result + 1;

        for (int i = 1; i <= y; i = i + 1)

            result = result + 1;

        return result;

    }

    private static int subtract(int x, int y)

    {
        int result = add(x, 0);

        for (int i = 0; i < y; i = i + 1)

            result = result - 1;

        return result;

    }
    private static int multiplication(int x, int y) {
        int result = 0;
        for(int i = 0; i < y; i++){
            result= add(result,x);
        }
return result;
    }
    private static int divide(int x, int y)
    {
        int result = x;
        int divide = 0;
        while (result > 0) {
            result = result - y;
            divide = divide + 1;
        }
        return divide;
    }
    private static int modulo(int x, int y)
    {
        int result = x;
        while (result > y) {
            result = result - y;
        }
        return result;
    }
    private static String concatination(String first, String last)
    {
        return first+last;
    }
    private static String repeat(String string, int n)
    { String current= string;
        for(int i=1; i < n; i++) {
            current += string;
        }
        return current;
    }
    }







