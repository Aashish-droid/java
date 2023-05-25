package Main;

interface Iface1{
	public void car1();
}
interface Iface2 extends Iface1{
	public void car2();
}
class speed implements Iface2{
	public void car1() {
		System.out.println("The car speed is 200MPH");
	}
	public void car2() {
		System.out.println("The car speed is 300MPH");
	}
	
}

public class INF {

	public static void main(String[] args) {
		speed go = new speed();
		go.car1();
		go.car2();

	}

}
