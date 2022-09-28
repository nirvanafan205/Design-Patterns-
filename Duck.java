public abstract class Duck
{
	FlyBehavior flyBehavior; //declare reference variables for the behavior interface type
	QuackBehavior quackBehavior; 

	public Duck()
	{

	}

	public abstract void display();

	public void performFly() //delegate to the behavior class
	{
		flyBehavior.fly(); 
	}

	public void performQuack() //delegate to the behavior class
	{
		quackBehavior.quack();
	}

	public void swim()
	{
		System.out.println("All ducks float, even decoys!");
	}	
}
