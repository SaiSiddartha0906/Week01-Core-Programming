import java.util.Scanner;

public class RocketLaunch1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(n);
        int i;
        for(i=n-1;i>0;i--){
            System.out.println(i);
        }
        scanner.close();
    }
}
