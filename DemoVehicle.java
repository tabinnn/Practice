abstract class Vehicle
{
	int No_of_Wheels;
	String Color;
	String Fuel;
	float Speed;
	abstract void start();
	abstract void accelerate();
	abstract void brake();
}
abstract class TransportationVehicle extends Vehicle
{
	int No_of_Doors;
	float Capacity;
}
class Van extends TransportationVehicle
{
	int No_of_Boxes;
	void start()
	{
		System.out.println("Van is stating");
	}
	void accelerate()
	{
		System.out.println("Van is accelerateing");
	}
	void brake()
	{
		System.out.println("Van is stopping");
	}
	void loadVan()
	{
		System.out.println("Van is loading");
	}
}
class Truck extends TransportionVehicle
{
	String size_of_container;
	void start()
	{
		System.out.println("Truck is stating");
	}
	void accelerate()
	{
		System.out.println("Truck is accelerateing");
	}
	void brake()
	{
		System.out.println("Truck is stopping");
	}
	void loadContainer()
	{
		System.out.println("Container is loading");
	}
}
public class DemoVehicle
{
	public static void main(String args[])
	{
		System.out.println("\"VAN\"");
		Van V = new Van();
		V.No_of_Wheels = 3;
		System.out.println("No of Wheels : " +V.No_of_Wheels);
		V.Color = "Blue";
		System.out.println("Color of Van is : " +V.Color);
		V.Fuel = "Full";
		System.out.println("Fuel is : " +V.Fuel);
		V.Speed = 0.0f;
		System.out.println("Speed is : " +V.Speed);
		V.start();
		V.accelerate();
		V.brake();
		V.No_of_Doors = 4;
		System.out.println("No of Doors is : " +V.No_of_Doors);
		V.Capacity = 100.0f;
		System.out.println("Capacity is : " +V.Capacity);
		V.No_of_Boxes = 50;
		System.out.println("No of Boxes is : " +V.No_of_Boxes);
		V.loadVan();
		System.out.println("\"Truck\"");
		Truck T = new Truck ();
		T.No_of_Wheels = 16;
		System.out.println("No of Wheels : " +T.No_of_Wheels);
		T.Color = "Blue and Green";
		System.out.println("Color of Truck is : " +T.Color);
		T.Fuel = "Full";
		System.out.println("Fuel is : " +T.Fuel);
		T.Speed = 0.0f;
		System.out.println("Speed is : " +T.Speed);
		T.start();
		T.accelerate();
		T.brake();
		T.No_of_Doors = 3;
		System.out.println("No of Doors is : " +T.No_of_Doors);
		T.Capacity = 100.0f;
		System.out.println("Capacity is : " +T.Capacity);
		T.size_of_container = "Big";
		System.out.println("Size of Container is : " +T.size_of_container);
		T.loadContainer();
		
		
	}
}






