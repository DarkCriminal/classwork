public class DemoClass
{
	//instance variable
	int id=100;
	String name="Deb";
	String address="Cossipore Road";
	long Phno=7278073626L;
	static String college="SVU";
	// method
	public void area()
	{
		//local variable
		int lenght=40;
		int width=20;
	}
	public static void main(String[] args)
	{
		System.out.println("main method");
		//instance of class
		DemoClass dc=new DemoClass();
		System.out.println(DemoClass.college);
		System.out.println("id"+dc.id);
		System.out.println("name"+dc.name);
		System.out.println("address"+dc.address);
		System.out.println("Phno"+dc.Phno);
	}
	}