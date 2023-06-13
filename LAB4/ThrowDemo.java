class ThrowDemo{
	public static void validate_gpa(double gpa){
		if((gpa>4) ||(gpa<0)){
			throw new ArithmeticException("The given GPA  is not valid.");
		}
		else{
			System.out.println("The given GPA is valid.");
		}
	}
	public static void main(String [] args){
		double myGpa=5;
		validate_gpa(myGpa);
	}
}
