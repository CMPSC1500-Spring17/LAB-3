public class Math_Miracles_by_Piia {
    public static void main(String[] args){
        System.out.println(repeat("Moonage",3));
        //System.out.println(concatenate("Moonage","Daydream"));
        //System.out.println("The modulo of 7 by 3 is "+modulo(7,3)+" (should be 1)");
        //System.out.println("15 divided by 3 is "+divide(15,3));
        //System.out.println( ((5+4)-12) + "  :  " + subtract(add(5,4),12) );

    }

    private static int add(int x, int y){
        int result = 0;
        for( int i=0; i < x; i = i + 1)
            result = result + 1;
        for( int i=1; i <= y; i= i + 1)
            result = result + 1;
        return result;
    }

    private static int subtract(int x, int y){
        int result = add(x,0);
        for( int i=0; i < y; i = i + 1)
            result = result - 1;
        return result;
    }

    private static int multiply(int x, int y){
        int result=0;
        for(int j=0; j<y; j++){
            result=add(result,x);
        }
        return result;
    }

    private static int divide(int x, int y){ //it's weird but it works
        int test=0;
        while (multiply(test,y)!=x){
            test++;
        }
        return test;
    }

    private static int modulo(int x,int y){
        int current = add(x,0);
        while(subtract(current,y)>0){
            current=subtract(current,y);
        }
        return current;
    }

    private static String concatenate(String x,String y){
        return x+y;
    }

    private static String repeat(String a,int x){
        String current=a;
        for (int i=1; i<x; i++){
            current=concatenate(current,a);
        }
        return current;
    }
}
