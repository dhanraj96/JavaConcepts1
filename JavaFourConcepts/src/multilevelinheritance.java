class Parent_class
{
	void display()
	{
		System.out.println("I am from Parent Class");
	}
}
class Parent_two extends Parent_class
{
	void display()
	{
		System.out.println("I am from Parent Class");
	}
}
class Parent_three extends Parent_two
{
	void display()
	{
		System.out.println("I am from Parent Class");
	}
}
class Parent_four extends Parent_three
{
	void display()
	{
		System.out.println("I am from Parent Class");
	}
}


public class multilevelinheritance extends Parent_class {

	public static void main(String[] args) {
		Parent_class object = new Parent_class();
		object.display();

	}

}
