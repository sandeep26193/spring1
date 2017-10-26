class test2
{
	int x1=10;
	float f1=100,f2=200;

	public void a()
	{
		//non static variables
		System.out.println(x1);
		test2 t1=new test2();
		System.out.println(t1.x1);
		System.out.println(test2.x1);
	}
	public static void main(String[] args) 
	{
		test2 t1=new test2();
		t1.a();
	}





}