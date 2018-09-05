abstract class Animal
{
char breed;
char color;
public void speak()
{
System.out.println("hello");
}

abstract public void eat();
}
class Cat extends Animal
{
public void eat()
{
System.out.println("i drink milk");
}
}
class Dog extends Animal
{
public void eat()
{
System.out.println("i drink water");
}
}
public class Java2
{
public static void main(String[] x)
{
Dog d=new Dog();
Cat c=new Cat();
d.eat();
d.speak();
c.speak();
c.eat();
}
}