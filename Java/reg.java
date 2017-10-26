class reg
{
	String username="sandeep";//non static object of the class
	static String password="sunny@123";// static context of the class
	String mail="aaa@gmail.com";
	String address="sdadafsasf";


	public static void main(String[] args)
	{
	//context of the class
	reg r1=new reg();
	System.out.println(r1.username);
	System.out.println(password);
	System.out.println(r1.mail);




	}
}