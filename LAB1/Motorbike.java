public class Motorbike{
	int speed;
	String model;
	public Motorbike(String model){
		this.model=model;
	}
	public void accelerate(){
		speed+=1;
	}
	public void stop(){
		speed = 0;
	}
	public void printSpeed(){
		System.out.println("Current speed of " + model +"is " + speed + "mph.");
	}

	public static void main(String [] args){
		Motorbike honda = new Motorbike("Honda");
		Motorbike pulsar = new Motorbike("Pulsar");
		honda.printSpeed();
		honda.accelerate();
		honda.accelerate();
		pulsar.accelerate();
		pulsar.accelerate();
		honda.printSpeed();
		pulsar.printSpeed();
		honda.stop();
		honda.printSpeed();
	}
}
