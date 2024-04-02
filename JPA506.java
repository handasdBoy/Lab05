public class JPA506{
    public static void main(String[] args){
        double circle = value(5.0);
        double tri = value1(10.0,5.0);
        int tan = value2(5,10);
        System.out.printf("\n此圖形面積為 : %.6f",(circle+tri+tan));
    }

    public static double value(double a){
        System.out.print("圓形面積為 : "+(a*a*3.1415926));
        return (a*a*3.1415926);
    }

    public static double value1(double b,double c){
        System.out.printf("\n三角形面積為 : %.6f",(b*c/2));
        return (b*c/2);
    }

    public static int value2(int d,int e){
        System.out.printf("\n長方形面積為 : "+(d*e));
        return (d*e);
    }
}