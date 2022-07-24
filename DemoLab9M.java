 class Vehicle
{
int no_of_wheels;
String color;
String fuel;
String speed;
 abstract void start();
}
class TransportationVehicle extends Vehicle
{
int no_of_Doors;
 int LoadCapacity;
}
class Van extends TransportationVehicle
{
int no_of_boxes;
void LoadVan()
	{
	System.out.print("Van is loading");
	}
}
class Truck extends TransportationVehicle
{
	float size_of_Containers;
	void LoadContainer()
		{
		System.out.print("Truck is loading");
		
		}
}
		public class DemoLab9M
		{
		public static void main(String args[])
			{
			Vehicle v=new Vehicle();
			v.no_of_wheels=4;
			v.color="red";
			v.fuel="petrol";
			v.speed="meter";
			
			v.start();
				TransportationVehicle t=new TransportationVehicle();
				t.no_of_Doors=2;
				t.Loadcapacity=6;
				
					Van n=new Van();
					n.no_of_boxes=5;
					
					n.LoadVan();
						Truck r=new Truck();
						
						r.Loadcontainer();
			
			
			}
		}
