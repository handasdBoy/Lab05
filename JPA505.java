public class JPA505{
    public static void main(String[] args){
        int add1 = add(2,3);
        double add2 = add(5.2,4.3);
        String add3 = add("I love"," Java!!");
        System.out.printf("%d %.6f %s",add1,add2,add3);
    }

    public static int add(int a,int b){
        System.out.println("Adding two integer: "+a+" , "+b);
        return a+b;
    }

    public static double add(double c,double d){
        System.out.println("Adding two doubles: "+c+" , "+d);
        return c+d;
    }

    public static String add(String e,String f){
        System.out.println("Adding two strings: "+e+" ,"+f);
        return e+f;
    }
}

