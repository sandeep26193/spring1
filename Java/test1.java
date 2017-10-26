class test1
{
	static double d1=450;
	public static void main(String[] args) {

//calling the static variables from 2 different classes


		System.out.println(d1);
		System.out.println("***********");

		//calling the f1 and f2 variables from test class 
		//by using class name
		System.out.println(test.f1);
		System.out.println(test.f2);

		//by using object
		test t1=new test();
		System.out.println(t1.f1);
		System.out.println(t1.f2);

		//using the class name is the best one

		
	}
}