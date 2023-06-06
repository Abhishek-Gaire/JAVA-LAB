import myPackage.*;
public class PackageDemo{
	public static void main(String[] args){
		System.out.println("\n Using <Animal> class in myPackage ");
		Animal cat =new Animal();
		System.out.println(cat.eat("milk"));
		cat.makeSound("Meow");

		System.out.println("\n Using <Food> class in myPackage");
		Foods obj= new Foods();
		obj.show();
		obj.getFoodID();
		obj.getFoodName();
		obj.setFoodID(int getFoodID(), String getFoodNamee());

		System.out.println("\n Using <Place> class in myPackage");
		Place place = new Place();

		System.out.println(place.place("Pokhara"));
		place.displayState("Gandaki State");
	}
}

