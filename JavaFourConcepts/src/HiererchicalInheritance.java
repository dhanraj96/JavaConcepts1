
class Parent_demo
{
	void display()
	{
		System.out.println("I am from Parent Class");
	}
}
class Parent_second extends Parent_demo
{
	void display()
	{
		System.out.println("I am from Parent Class");
	}
}
class Parent_third extends Parent_demo
{
	void display()
	{
		System.out.println("I am from Parent Class");
	}
}
class Parent_fourth extends Parent_demo
{
	void display()
	{
		System.out.println("I am from Parent Class");
	}
}



public class HiererchicalInheritance extends Parent_demo{

	public static void main(String[] args) {
		Parent_demo object = new Parent_demo();
		object.display();
		

	}

}
