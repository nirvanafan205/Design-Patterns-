public abstract class Duck
{
	QuackBehavior quackBehavior; //each duck has a reference to something that implements QuackBehavior interface

	public void performQuack()
	{
		quackBehavior.quack();
	}
}
