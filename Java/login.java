class login
{
	public static void main(String[] args) {
		//create a object of reg class to get data from reg.java
		reg r1=new reg();
		System.out.println(r1.username);
		//by using class name or objet

		System.out.println(reg.password);
	}
}