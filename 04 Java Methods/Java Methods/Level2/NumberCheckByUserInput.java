import java.util.Scanner;
public class NumberCheckByUserInput {
	public static int compare(int a,int b){
		if (a>b){
			return 1;
		}
		else if (b>a){
			return -1;
		}
		else{
			return 1;
		}
	}
	public static void isEven(int number){
		if (number%2==0){
			System.out.println(number+" is even number");
		}
		else{
			System.out.println(number+" is odd number");
		}
	}
	public static void isPositive(int num){
		if (num>=0){
			System.out.println(num+" is Positive");
			TriangularRounds.isEven(num);
		}
		else{
			System.out.println(num+" is Negative");
		}
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int[] arr=new int[5];
		for (int i=0;i<5;i++){
			System.out.println("Enter a number :");
			arr[i]=input.nextInt();
		}
		for (int i=0;i<5;i++){
			TriangularRounds.isPositive(arr[i]);
		}
		int result= TriangularRounds.compare(arr[0],arr[1]);
		System.out.println(result);
	}
}
		
			