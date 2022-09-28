public class MiniDuckSimulator
{
	public static void main(String[] args)
	{
		Duck mallard = new MallardDuck();
		mallard.performQuack(); //calls MallardDuck's inherited performQuack() method
					//calls quack on the ducks inherited quackBehavior reference

		mallard.performFly();   //same calls made for performFly()
	}
}
