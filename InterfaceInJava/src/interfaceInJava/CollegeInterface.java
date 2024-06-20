package interfaceInJava;

interface College
{
	public static void Branch()		//Static methods are allowed in interface	
	{
		System.out.println("");
		
	}
	
	public void classes();
	
	public void students();
	
	default void show()
	{
		System.out.println("This is a default method");
	}
	
}

abstract class Children implements College
{
	public void classes()
	{
		System.out.println("hi");
	}
}

class GrandChildren extends Children
{
	public void students()
	{
		System.out.println("Good evening");
	}
}

public class CollegeInterface 
{

	public static void main(String[] args) 
	{
		GrandChildren gc=new GrandChildren();
		gc.students();
		gc.classes();
		

	}

}
