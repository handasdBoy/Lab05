import java.util.Scanner;
public class JPA502{
    public static void main(String[] args){
        while(true){
            System.out.print("Input n (0<=n<=16):");
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            int b = 1;
            if (a==999){
                break;
            }else if(a>16 || a<0){
                break;    
            }else{
                System.out.println(a+"的階乘(迴圈) = "+value(a,b));
                System.out.println(a+"的階乘(尾迴圈) = "+value(a,b));
            }
        }
    }

    public static int value(int a,int b){
        if (a==1){
            return b;
        }else{
            for(int i=a;i>0;i--){
                b*=i;
            }
            return b;
        }
    }
}
