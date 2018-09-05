interface Animal
{
	void speak();
	void eat();
}
class Cat implements Animal
{
	public void speak()
	{
		System.out.println("i am cat");
	}
       public void eat()
	{
		System.out.println("i love to drink milk");
	}
}
class Dog implements Animal
	{
		public void speak()
		{
			System.out.println("i am dog");
		}
public void eat()
{
System.out.println("i love eat chicken :)");
}
}
public class Demo
{
public static void main(String[] x)
{
Dog d=new Dog();
Cat c=new Cat();
d.speak();
d.eat();
c.speak();
c.eat();
}
}



