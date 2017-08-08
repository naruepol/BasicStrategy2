
public class TestDriver {

	public static void main(String[] args) {
		MallardDuck d1 = new MallardDuck();
		d1.quack();   //Quack! Quack!
		d1.display(); //Look like a mallard
		RubberDuck d2 = new RubberDuck();
		d2.quack();  //Squeak! Squeak!
		d2.display(); //Look like a rubber
		Duck d3 = new RedheadDuck();
		d3.swim();  //I'am swiming
		d3.display();  //Look like a redhead
		d3 = new RubberDuck();
		d3.swim();  //I'am swiming
		d3.display(); //Look like a rubber
	}

}
