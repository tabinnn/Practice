abstract class Vehicle
{
	int No_of_tyres;
	abstract void start();
}
class Car extends Vehicle
	{
	void start()
		{
		System.out.print("Car start with key");
		}
		
	}
		class Motor_Bike extends Vehicle
		{
		void start()
			{
			System.out.print("Bike start with kick");
			}
		}
	public class MainDemoAbs
	{
		public static void main(String args[])
		{
		Car c=new Car();
		c.No_of_tyres=4;
		System.out.print(c.No_of_tyres);
		c.start();
			Motor_Bike b=new Motor_Bike();
			b.No_of_tyres=2;
			System.out.println(b.No_of_tyres);
			b.start();
		}
	}