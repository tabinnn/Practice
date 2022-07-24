package pkg2k21g;
public class Customer
{
	public String name;
	public double amount;
	public Customer(String n,double m)
	{
		name=n;
		amount=m;
	}
		public void show()
		{
			System.out.print("Name:" + name + "Amount:Rs."+ amount);
		}
}
 Pkg2k21g.Customer;
	class MainDemoPkg2k21G
	{
		public static void main(String args[])
		{
			Customer obj=new Customer("Ali",50000);
			obj.show();
			obj.name="Asad";
			obj.amount=10000;
			obj.show();
		}
	}