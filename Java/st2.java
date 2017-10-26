class st2
{
	//accessing the static variables


	//static variables are constatnt variables
	static float f1=100;

	public static void main(String[] args)
	{
		//directly
		System.out.println(f1);

		//by using class classname
		System.out.println(st2.f1);

		//by using object
		st2 s1=new st2();
		System.out.println(s1.f1);//100

		s1.f1=s1.f1+20;
		System.out.println(s1.f1);//120

		st2 s2=new st2();
		System.out.println(s2.f1);// thee up value 120 is taken as f1

		//static varaible is called only once into the main after that the value is changed to the modified one
		//directly using is the best one to access the static variables




	//directly
	}
}