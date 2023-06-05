class SampleClass{
	static int count=1;
	float data;

	public SampleClass(){
		count=count+1;
		System.out.println("number: "+ count);
	}
}
public class ObjectCountDemo{
	public static void main(String [] args){
		SampleClass stuff1 = new SampleClass();
		stuff1.data= SampleClass.count;
		SampleClass stuff2 = new SampleClass();
		stuff2.data= SampleClass.count;
		stuff2.data+=stuff1.data;
		System.out.println("Final Data:" + stuff2.data + " "+ stuff1.data );
	}
}
