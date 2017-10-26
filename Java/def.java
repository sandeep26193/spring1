class def
{

	//initialization
	byte b1;  //this is class
	short s;
	int i;
	long l;

	static float f1;
	static double d3;
	static char ch;
	static boolean b2;

	public static void main(String[] args)
	{
		//for using the non static key words
		def d1=new def();
		System.out.println(d1.b1);
		System.out.println(d1.s);
		System.out.println(d1.i);
		System.out.println(d1.l);
		System.out.println("-------------------");

		System.out.println(f1);
		System.out.println(d3);
		System.out.println(ch);
		System.out.println(b2);


	}
}