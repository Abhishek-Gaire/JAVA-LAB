public class ExpectionTraceDemo{
	public static void main(String[] args){
		printAverage(100,0);
		System.out.println("Exit main().");
	}
	public static void printAverage(int totalSum, int totalNumber){
		try{
			int average=totalSum/totalNumber;
			System.out.println("Average = "+ totalSum + "/" + totalNumber+ "=" + average);
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("Exception handled in "+ "printAverage()");
		}
		finally{
			System.out.println("Finally Done");
		}
		System.out.println("Exit printAverage().");
	}
}
