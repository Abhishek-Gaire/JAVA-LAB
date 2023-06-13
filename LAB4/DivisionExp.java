import java.util.Scanner;
class DivisionExp{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a,b,result;
		System.out.println("Enter two integers:");
		a=input.nextInt();
		b=input.nextInt();
		try{
			result=a/b;
			System.out.println("Result: "+ result);
		}
		catch(ArithmeticException e){
			System.out.println("Exception caught: Division by zero.");
		}
	}
}
