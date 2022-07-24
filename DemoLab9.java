class Car
{
void start()
	{
	System.out.print("Car is starting");
	}
}
class SportCar extends Car
{
void start()
	{
	System.out.println("SportCar is starting");
	}
}
	public class DemoLab9
	{
	public static void main(String args[])
		{
			Car c=new Car();
			c.start();
			SportCar Sc=new SportCar();
			Sc.start();
		}
	}