
public class MallardDuck extends Duck implements Flyable, Quackable {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Quack! Quack!");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I'm flying");
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Look like a mallard");
	}

}
