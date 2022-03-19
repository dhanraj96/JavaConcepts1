
class Parent_one
{
	void display()
	{
		System.out.println("I am from Parent Class");
	}
}

public class SingleInheritance extends Parent_one {

	public static void main(String[] args) {
		Parent_one object = new Parent_one();
		object.display();
		

	}

}
