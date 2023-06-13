class ThrowsExample{
	public static void validate_gpa(double gpa) throws ArithmeticException {
		if((gpa>4) || (gpa<0)){
			throw new ArithmeticException("The given GPA is not valid.");
		}
		else{
			System.out.println("The GPA is valid.");
		}
	}
	public static void main(String [] args){
		double myGpa=5;
		validate_gpa(myGpa);
	}
}
