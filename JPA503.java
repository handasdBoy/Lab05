import java.util.Scanner;
public class JPA503{
    public static void main(String[] args){
        while(true){
            Scanner s = new Scanner(System.in);
            System.out.print("Input m :");
            int a = s.nextInt();
            if(a==999){
                break;
            }else{
                System.out.print("Input n :");
                int b = s.nextInt();
                int min = Math.min(a,b);
                int c = 1;
                for(int i=min;i>0;i--){
                    if(a%i==0 && b%i==0){
                        c = i;
                        break;
                    }
                }
                System.out.println("最大公因數"+c);
            }
        }
    }
}
