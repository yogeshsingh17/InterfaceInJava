package interfaceInJava;

interface A
{
	public static void staticMethodInInterface()
	{
		System.out.println("In java static methods are allowed inside interface");
	}
	public void a();
	public void b();
	public void c();
	public void d();
}

abstract class B implements A
{
	public void a()
	{
		System.out.println("This is method a");
	}
}

class C extends B
{
	public void b()
	{
		System.out.println("This is method b");
	}
	
	public void c()
	{
		System.out.println("This is method c");
	}
	
	public void d()
	{
		System.out.println("This is method d");
	}
}

public class PracticeInterface 
{

	public static void main(String[] args) 
	{
		C aa=new C();
		aa.a();
		aa.b();
		aa.c();
		aa.d();
	}

}
