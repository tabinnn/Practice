// this keyword

class Box
{
	double weight;
	double height;
	double depth;
	Box(double weight,double height,double depth)
	{	
	weight=weight;
	height=height;
	depth=depth;
	}
	double volume()
	{
		return weight * height * depth;
	}
}
	
	class MainDemoThisKeyword
	{
	public static void main(String args[])
	{
	Box obj=new Box(10,20,30);
	double vol=obj.volume();
	}
	}

	