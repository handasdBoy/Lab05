import java.util.Scanner;
public class JPA504{
    public static void main(String[] args){
        System.out.print("Input the number :");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.print("Ans:"+sum2(a));
    }

    public static int sum2(int a){
        if(a==1){
            return 2;
        }else{
            int sum = sum2(a-1)+2*a;
            return sum;
        }
    }
}
