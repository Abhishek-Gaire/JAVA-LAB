abstract class Maps{
	abstract void show();
	abstract void specifyPlace(String arg);
}
class WebMaps extends Maps{
	void show(){
		System.out.println("Web Maps: Bing Map, Google Map");
	}
	void specifyPlace(String arg){
		System.out.println("Place Name:"+ arg);
	}
}
public class AbstractClassDemo{
	public static void main(String [] args){
		WebMaps w = new WebMaps();
		w.show();
		w.specifyPlace("Pokhara");
	}
}

