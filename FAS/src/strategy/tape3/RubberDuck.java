package strategy.tape3;

public class RubberDuck extends Duck {

	public RubberDuck(){
		quackbehavior = new Squeak();
		flybehavior = new FlyNoWay(); 
				}
	
	@Override 
	public void display(){
		
		System.out.println("I'm a real Rubber Duck");
	}
	

}
