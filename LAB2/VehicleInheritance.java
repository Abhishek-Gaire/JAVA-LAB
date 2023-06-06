import java.util.Scanner;
class Vehicle{
	String model;
	String color;
	float cost;
	Scanner b= new Scanner(System.in);
	public void getDetails(){
		System.out.println("Enter the model of your vehicle:");
		model=b.nextLine();
		System.out.println("Enter the color of your vehicle:");
		color=b.nextLine();
	}
	public void displayDetails(){
		System.out.println("Details of Vehicle are:");
		System.out.println("Model:" + model+ " Color:"+color+" Cost:" +cost);
	}

}
class Car extends Vehicle {
	float numWheels;
	Car(float num){
		this.numWheels=num;
	}
	public double getCost(){
		System.out.println("Enter the cost of your car:");
		cost=b.nextFloat();
		return cost;
	}
}
class Bike extends Vehicle {
	float numWheels;
	Bike(float num){
		this.numWheels=num;
	}
	public double getCost(){
		System.out.println("Enter the cost of your bike:");
		cost=b.nextFloat();
		return cost;
	}
}
public class VehicleInheritance{
	public void main(String[] args){
		Vehicle v= new Vehicle();
		Car c= new Car(4);
		Bike b= new Bike(2);
		v.getDetails();
		v.displayDetails();
		v=c;
		System.out.println("The Price of the car is: " + v.getCost());
		v=b;
		System.out.println("The price of the bike is: " + v.getCost());
	}
}
