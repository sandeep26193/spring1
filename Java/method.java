class method
{
	
//methods

	int x=0; //non static
	static float f=20; //static variable
// object of the class
public void a()
{
	//a is a method name
System.out.println(x);

//calling static variables into non static class ie context of the class into object of the class
System.out.println(f);//directly
System.out.println(method.f);//by class name

method m1=new method();
System.out.println(m1.f);//by object creating
System.out.println("***********************");

}
public static void b()
{
	method m1=new method();
	System.out.println(m1.x);
	System.out.println(f);
	System.out.println("**********************hh***************");
}

//context of the class
	public static void main(String[] args)  

	{
		//main is the method name
		method m1=new method();
		m1.a();

		b();


	}
}