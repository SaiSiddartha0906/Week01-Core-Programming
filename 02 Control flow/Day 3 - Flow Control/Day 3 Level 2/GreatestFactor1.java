import java.util.Scanner;
public class GreatestFactor1 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int greatestfactor=1;
		int i=num-1;
		while(true){
			if (num%i==0){
				greatestfactor=i;
				break;
			}
			i--;
		}
		System.out.println(greatestfactor);
	}
}
			