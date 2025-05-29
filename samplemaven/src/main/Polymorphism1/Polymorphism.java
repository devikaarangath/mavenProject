package Polymorphism1;

public class Polymorphism extends PolymorphismParentClass {
	
	public void display()
	{
		super.display();  	//Method Overriding (super.parentClass Method is called here)
		System.out.println("Polymorphism");
	}

	public static void main(String[] args) {
		Polymorphism obj = new Polymorphism();
		obj.display();
	}

}
