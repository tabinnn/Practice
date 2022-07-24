//constructor overloading
class Box
{
	double wight, height,depth;
	Box()
	{
	wight=-1;
	height=-1;
	depth=-1;
	}
		Box(double c)
	{
		wight=height=depth=c;
	}
		Box(double w,double h,double d)
		{
		wight=w;
		height=h;
		depth=d;
		}
}

	class MainDemoConstructoroverloading
	{
	public static void main(String args[])
			
		{
		Box obj1=new Box();
		Box obj2=new Box(3.5);
		Box obj3=new Box(10,20,30);
		}
	}
