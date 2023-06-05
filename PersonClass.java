class PersonClass implements AnimalInterface,HumanInterface,PlantInterface{
	public void eat(){
		System.out.println("Person eats");
	}
	public void travel(){
		System.out.println("Person travels");
	}
	public void study(String qualification){
		System.out.println(type +" studying " + qualification);
	}
	public void getPlant(String arg){
		System.out.println("The name of the plant is "+ arg);
	}
}
