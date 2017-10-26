class st1
{
	//static and non static variables
	int x=10;
	static float f1=20;


	public static void main(String[] args)
	{
		st1 s1=new st1();
		s1.x=s1.x+10;
		System.out.println(s1.x);//20


		f1=f1+10;
		System.out.println(f1);

		System.out.println("***************");

		st1 s2=new st1();

		s2.x=s2.x*0;

		System.out.println(s2.x);

		//static variables can be called only once in the main method
		//but the non static variable can be called as many times the object is created like s1 and s2

		//non static variables can allocate 
	}
}