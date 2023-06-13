class NonGCESException extends Exception{
	NonGCESException (String s){
		super(s);
	}
}
class OwnExceptionDemo{
	static void checkStudent(String college) throws NonGCESException{
		if(college!="GCES")
			throw new NonGCESException(" not a GCES buddy ");
		else
			System.out.println("Welcome to GCES");
	}
	public static void main(String [] args){
		try{
			checkStudent("PMC");
		}
		catch(Exception e){
			System.out.println("Exception occured: "+ e);
		}
		finally {
			System.out.println("END");
		}
	}
}

